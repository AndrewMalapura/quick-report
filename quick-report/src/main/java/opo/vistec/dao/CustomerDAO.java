package opo.vistec.dao;

import java.util.List;

import opo.vistec.entity.model.Customer;

public interface CustomerDAO {
	List<Customer> findAllCustomer();
}
