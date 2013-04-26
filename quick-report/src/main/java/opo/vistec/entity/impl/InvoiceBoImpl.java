package opo.vistec.entity.impl;

import java.util.List;

import opo.vistec.dao.InvoiceDAO;
import opo.vistec.entity.InvoiceBo;
import opo.vistec.entity.model.Invoice;

public class InvoiceBoImpl implements InvoiceBo {
	

	InvoiceDAO invoiceDAO;
	
	public void setInvoiceDAO(InvoiceDAO invoiceDAO) {
		this.invoiceDAO = invoiceDAO;
	}

	@Override
	public List<Invoice> findAllOrders() {
		return invoiceDAO.findAllOrders();
	}

}
