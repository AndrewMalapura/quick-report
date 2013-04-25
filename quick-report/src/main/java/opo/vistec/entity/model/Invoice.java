package opo.vistec.entity.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author malapura
 *   Налоговая накладная
 * 
 */
public class Invoice implements Serializable {

	private static final long serialVersionUID = -4840424253401955433L;
	
	private OrderId order;
	private String invoiceid;
	private String salesid;
	private Date invoicedate;
	private String warrant;
	private Date warrantdata;
	private String warrantwho;
	private String car;
	private String carnumber;
	private BigDecimal cost;
	private List<InvoiceLine> invoiceList;
	
	public String getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(String invoiceid) {
		this.invoiceid = invoiceid;
	}
	public String getSalesid() {
		return salesid;
	}
	public void setSalesid(String salesid) {
		this.salesid = salesid;
	}
	
	/*
	
	public OrderId getOrderid() {
		return orderid;
	}
	public void setOrderid(OrderId orderid) {
		this.orderid = orderid;
	}*/
	public Date getInvoicedate() {
		return invoicedate;
	}
	public void setInvoicedate(Date invoicedate) {
		this.invoicedate = invoicedate;
	}
	public String getWarrant() {
		return warrant;
	}
	public void setWarrant(String warrant) {
		this.warrant = warrant;
	}
	public Date getWarrantdata() {
		return warrantdata;
	}
	public void setWarrantdata(Date warrantdata) {
		this.warrantdata = warrantdata;
	}
	public String getWarrantwho() {
		return warrantwho;
	}
	public void setWarrantwho(String warrantwho) {
		this.warrantwho = warrantwho;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	
	public List<InvoiceLine> getInvoiceList() {
		return invoiceList;
	}
	public void setInvoiceList(List<InvoiceLine> invoiceList) {
		this.invoiceList = invoiceList;
	}
	public OrderId getOrder() {
		return order;
	}
	public void setOrder(OrderId order) {
		this.order = order;
	}

}
