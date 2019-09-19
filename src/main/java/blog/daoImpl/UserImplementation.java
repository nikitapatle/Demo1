package blog.daoImpl;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import blog.daoInterface.UserInterface;
import blog.model.User;

public class UserImplementation implements UserInterface

{
	@Autowired
	private SessionFactory sf;
	
	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	public int saveUser(User user) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		Session session=sf.openSession();
		Transaction tx=(Transaction) session.beginTransaction();
		int id=(int) session.save(user);
		tx.commit();
		session.close();
		return id;
	}
	
}
