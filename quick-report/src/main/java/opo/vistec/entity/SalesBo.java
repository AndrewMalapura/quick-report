package opo.vistec.entity;

import java.util.Date;
import java.util.List;

import opo.vistec.entity.model.Sales;

public interface SalesBo {
	List<Sales> findAllSales();
	List<Sales> findByDate(Date start, Date end);
}
