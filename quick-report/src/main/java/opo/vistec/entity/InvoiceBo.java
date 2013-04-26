package opo.vistec.entity;

import java.util.List;

import opo.vistec.entity.model.Invoice;

public interface InvoiceBo {
	
	List<Invoice> findAllOrders();
}
