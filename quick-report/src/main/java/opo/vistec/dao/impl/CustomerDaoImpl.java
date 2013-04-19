package opo.vistec.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import opo.vistec.dao.CustomerDAO;
import opo.vistec.entity.model.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport  implements CustomerDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAllCustomer() {
		return getHibernateTemplate().find("from Customer");
	}

}
