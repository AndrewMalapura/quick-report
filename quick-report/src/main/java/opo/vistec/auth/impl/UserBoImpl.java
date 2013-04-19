package opo.vistec.auth.impl;

import java.util.List;

import opo.vistec.auth.UserBO;
import opo.vistec.auth.model.User;
import opo.vistec.dao.UserDAO;

public class UserBoImpl implements UserBO {
	
	UserDAO userDAO ;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<User> findAllUsers() {
		return userDAO.findAllUsers();
	}

}
