package org.seasailing.db.util;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Consumer;
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


    protected static final <X> Qry<X> saveOrUpdate(X x) {
        return session -> {
                session.saveOrUpdate(x);
                return Optional.of(x);
        };
    }

    protected static final <X> Qry<X> delete(X x) {
        return session -> {
                session.delete(x);
                return Optional.of(x);
        };
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
