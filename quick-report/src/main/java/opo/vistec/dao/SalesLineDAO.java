package opo.vistec.dao;

import java.util.Date;
import java.util.List;

import opo.vistec.entity.model.SalesLine;

public interface SalesLineDAO {
	
	public List<SalesLine> sold_invent(Date start, Date end,  String itemid);

}
