package opo.vistec.dao.impl;

import java.util.Date;
import java.util.List;

import opo.vistec.dao.SalesLineDAO;
import opo.vistec.entity.model.SalesLine;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class SalesLineDaoImpl extends HibernateDaoSupport implements SalesLineDAO {
	
	@SuppressWarnings("unchecked")
	public List<SalesLine> sold_invent(Date start, Date end,  String itemid){
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		Query q = session.createQuery("from SalesLine where sales.deliverydate > :start AND sales.deliverydate < :end AND itemid.itemid= :itemid")
				.setParameter("start", start)
				.setParameter("end", end)
				.setParameter("itemid", itemid);
		return q.list();
	}

}
