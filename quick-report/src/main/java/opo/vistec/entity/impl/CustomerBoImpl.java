package opo.vistec.entity.impl;

import java.util.List;

import opo.vistec.dao.CustomerDAO;
import opo.vistec.entity.CustomerBo;
import opo.vistec.entity.model.Customer;

public class CustomerBoImpl implements CustomerBo {

	CustomerDAO customerDAO;
	
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public List<Customer> findAllCustomer() {
		return customerDAO.findAllCustomer();
	}

}
