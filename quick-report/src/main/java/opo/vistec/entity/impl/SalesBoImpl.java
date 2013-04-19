package opo.vistec.entity.impl;

import java.util.List;

import opo.vistec.dao.SalesDAO;
import opo.vistec.entity.SalesBo;
import opo.vistec.entity.model.Sales;

public class SalesBoImpl implements SalesBo {
	
	SalesDAO salesDAO;
	
	public void setSalesDAO(SalesDAO salesDAO) {
		this.salesDAO = salesDAO;
	}
	@Override
	public List<Sales> findAllSales() {
		return salesDAO.findAllSales();
	}

}
