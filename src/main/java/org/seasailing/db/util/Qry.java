package org.seasailing.db.util;


import org.hibernate.Session;

import java.util.Optional;
import java.util.function.Function;

import static org.seasailing.db.util.SessionUtility.*;


public interface Qry<T> {
	Optional<T> execute(Session s);
	
	default Optional<T> run(HibernateSessionFactory.DataSource ds) {
		Session session = createSession(ds);
		logger.debug("Running query."); 
		try {
			return this.execute(session);
		} catch (Exception e) {
			rollbackAndClose(session);
			throw logAndThrowError("Error running the query. " + e.getMessage());
		} finally {
			endSession(session);
		}
	}
}
