package opo.vistec.dao.impl;

import java.util.List;

import opo.vistec.dao.InventDAO;
import opo.vistec.entity.model.Invent;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class InventDaoImpl extends HibernateDaoSupport implements InventDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Invent> findAllInvents() {
		return getHibernateTemplate().find("from Invent");
	}

}
