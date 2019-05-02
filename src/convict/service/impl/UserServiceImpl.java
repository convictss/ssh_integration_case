package convict.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import convict.dao.UserDao;
import convict.execption.AgeException;
import convict.po.User;
import convict.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void addUser(User user) {
		userDao.insertUser(user);
	}

}
