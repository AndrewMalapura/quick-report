package opo.vistec.dao;

import java.util.List;

import opo.vistec.entity.model.Invoice;

public interface InvoiceDAO {
	List<Invoice> findAllOrders();
}
