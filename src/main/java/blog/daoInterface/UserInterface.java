package blog.daoInterface;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import blog.model.User;

public interface UserInterface
{

	public int saveUser(User user) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;
}
