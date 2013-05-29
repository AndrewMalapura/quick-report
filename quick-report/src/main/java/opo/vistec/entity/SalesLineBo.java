package opo.vistec.entity;

import java.util.Date;
import java.util.List;

import opo.vistec.entity.model.SalesLine;

public interface SalesLineBo {
	
	public List<SalesLine> findSoldByDate(Date start, Date end, String itemid);

}
