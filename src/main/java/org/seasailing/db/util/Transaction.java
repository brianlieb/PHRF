package org.seasailing.db.util;

import java.util.Objects;
import java.util.Optional;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.seasailing.db.util.HibernateSessionFactory.DataSource;
import static org.seasailing.db.util.SessionUtility.*;

public class Transaction  {
	private static Logger logger = LoggerFactory.getLogger(Transaction.class);
	private Txn transaction_;
	
	public Transaction() {
	}
	
	public Transaction addTxn(Txn transaction) {
		this.transaction_ = transaction.andThen(transaction);
		return this;
	}

	public Transaction addTxn(Optional<Txn> transaction) {
		transaction.ifPresent(transaction_::andThen);
		return this;
	}
	
	public void run(DataSource ds) {
		Session session = createSession(ds);
		logger.info("Beginning Transaction!");
		try {
			this.transaction_.execute(session);
		} catch (Exception e) {
			rollbackAndClose(session);
			throw logAndThrowError("Error running the transaction. " + e.getMessage());
		} finally {
			logger.info("Transaction Committed.");
			endSession(session);
		}
	}
	
	@FunctionalInterface
	public interface Txn<T> {
		
	    T execute(Session s);

	    default <Y> Txn<Y> andThen(Txn<Y> after) {
	        Objects.requireNonNull(after);
	        return (session) -> {
	        	execute(session); 
	        	logger.info("---");
				return after.execute(session);
	        };
	    }
	    
	}
	
}
