package opo.vistec.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import opo.vistec.dao.SalesDAO;
import opo.vistec.entity.model.Sales;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class SalesDaoImpl extends HibernateDaoSupport implements SalesDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Sales> findAllSales() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -3); // минус 3 мес€ца от текущей даты
		return getHibernateTemplate().find("from Sales s where s.deliverydate >= ?", cal.getTime());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sales> findByDateInterval( Date start, Date end) {
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		Query q = session.createQuery("from Sales where deliverydate >= :start AND deliverydate <= :end")
				.setParameter("start", start)
				.setParameter("end", end);
		return q.list();
	}

}
