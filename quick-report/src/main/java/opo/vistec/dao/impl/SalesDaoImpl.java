package opo.vistec.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import opo.vistec.dao.SalesDAO;
import opo.vistec.entity.model.Sales;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class SalesDaoImpl extends HibernateDaoSupport implements SalesDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Sales> findAllSales() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		Date date=new Date();        
		try {
		    date = sdf.parse("01.03.2013");           
		}catch (Exception e) {
		    e.printStackTrace();
		}   
		return getHibernateTemplate().find("from Sales s where s.deliverydate > ?", date);
	}

}
