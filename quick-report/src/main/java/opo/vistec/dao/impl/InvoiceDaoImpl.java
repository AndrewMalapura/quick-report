package opo.vistec.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import opo.vistec.dao.InvoiceDAO;
import opo.vistec.entity.model.Invoice;

public class InvoiceDaoImpl extends HibernateDaoSupport implements InvoiceDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Invoice> findAllOrders() {
		return getHibernateTemplate().find("from Invoice");
	}

}
