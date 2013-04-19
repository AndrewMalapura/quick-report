package opo.vistec.dao.impl;

import java.util.List;

import opo.vistec.auth.model.User;
import opo.vistec.dao.UserDAO;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport  implements UserDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		return getHibernateTemplate().find("from User");
	}

}
