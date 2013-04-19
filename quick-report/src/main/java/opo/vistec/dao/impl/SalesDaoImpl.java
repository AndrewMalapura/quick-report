package opo.vistec.dao.impl;

import java.util.List;

import opo.vistec.dao.SalesDAO;
import opo.vistec.entity.model.Sales;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class SalesDaoImpl extends HibernateDaoSupport implements SalesDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Sales> findAllSales() {
		return getHibernateTemplate().find("from Sales");
	}

}
