package opo.vistec.dao;

import java.util.Date;
import java.util.List;

import opo.vistec.entity.model.Sales;

public interface SalesDAO {
	List<Sales> findAllSales();
	List <Sales> findByDateInterval(Date start, Date end);
}
