package opo.vistec.entity.impl;

import java.util.List;

import opo.vistec.dao.InventDAO;
import opo.vistec.entity.InventBo;
import opo.vistec.entity.model.Invent;

public class InventBoImpl implements InventBo {
	
	InventDAO inventDAO;
	public void setInventDAO(InventDAO inventDAO) {
		this.inventDAO = inventDAO;
	}
	@Override
	public List<Invent> findAllInvents() {
		return inventDAO.findAllInvents();
	}

}
