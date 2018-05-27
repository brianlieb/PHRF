package org.seasailing.db.util;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.Session;
import org.seasailing.core.exceptions.UnrecoverableException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.seasailing.db.util.Transaction.Txn;

public class BaseRepository {
	protected static Logger logger = LoggerFactory.getLogger(BaseRepository.class);

	protected static final UnrecoverableException logAndThrowError(String msg) throws UnrecoverableException {
		logger.error(msg);
		return new UnrecoverableException(msg);
	}

	protected static final UnrecoverableException logAndThrowError(String msg, Exception e) throws UnrecoverableException {
		UnrecoverableException ex= new UnrecoverableException(msg + "\n" + e.getMessage());
		ex.addSuppressed(e);
		logger.error(msg, ex);
		return ex;
	}


	protected static final Txn doNothing =
			session -> {};


	protected static final Function<Object, Qry<Object>> hasId =
            o ->
        		session -> Optional.ofNullable(session.getIdentifier(o));

	protected static final Function<Object, Txn> delete =
		o ->
                session -> hasId.apply(o).execute(session).ifPresent(id -> session.delete(o));

	protected static final Function<Object, Txn> save =
		o ->
			s -> s.saveOrUpdate(o);

	protected static final Function<Function<Object, Txn>, Function<Object, Txn>> prepareTransaction =
			fn ->
				o -> o!=null?fn.apply(o):doNothing;

	protected static final <T> Txn prepareTransaction(Function<Object, Txn> txn, Collection<T> objects) {
		return prepareTransaction(txn, objects.stream());
	}

	protected static final <T> Txn prepareTransaction(Function<Object, Txn> txn, Stream<T> stream) {
		return stream
				.map(o -> prepareTransaction.apply(txn).apply(o))
				.reduce((t1, t2) -> t1.andThen(t2))
				.orElse(doNothing);
	}

	protected static final <X, Z> Function<Collection<X>, Collection<Z>> collectionMapper(Function<X,Z> mapper) {
	    return collection -> collection.stream().map(mapper).collect(Collectors.toList());
    }

    protected static final <X,Z> Qry<Z> prepareQry(Qry<X> results, Function<X,Z> mapper) {
	    return session -> results.execute(session).map(mapper);
    }

    protected static final <X,Z> Qry<Z> prepareQry(Supplier<Qry<X>> results, Function<X,Z> mapper) {
        return prepareQry(results.get(), mapper);
    }



}
