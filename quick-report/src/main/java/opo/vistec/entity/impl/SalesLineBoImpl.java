package opo.vistec.entity.impl;

import java.util.Date;
import java.util.List;

import opo.vistec.dao.SalesLineDAO;
import opo.vistec.entity.SalesLineBo;
import opo.vistec.entity.model.SalesLine;

public class SalesLineBoImpl implements SalesLineBo {

	SalesLineDAO salesLineDAO;
	
	public void setSalesLineDAO(SalesLineDAO salesLineDAO) {
		this.salesLineDAO = salesLineDAO;
	}

	@Override
	public List<SalesLine> findSoldByDate(Date start, Date end, String itemid) {
		return salesLineDAO.sold_invent(start, end, itemid);
	}

	@Override
	public List<SalesLine> getStringsRealization(Date start, Date end) {
		return salesLineDAO.getStringsRealization(start, end);
	}

}
