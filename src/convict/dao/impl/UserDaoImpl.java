package convict.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import convict.dao.UserDao;
import convict.po.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory SessionFactory ;
	
	private Session getSession() {
		return SessionFactory.getCurrentSession();
	}
	
	@Override
	public Integer insertUser(User user) {
		getSession().save(user);
		return null;
	}

}
