package opo.vistec.entity.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class InvoiceLine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6806008116767082342L;
	private String salesid;
	private String invoiceid;
	private Invoice orders;
	private Invent invent;
	private String locationinvent;
	private Double qty;
	private Double price;
	private BigDecimal summa;
	private String unitid;
	private Integer recid;
	
	public String getSalesid() {
		return salesid;
	}
	public void setSalesid(String salesid) {
		this.salesid = salesid;
	}
	public Invoice getOrders() {
		return orders;
	}
	public void setOrders(Invoice orders) {
		this.orders =orders;
	}
	public String getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(String invoiceid) {
		this.invoiceid = invoiceid;
	}
	public Invent getInvent() {
		return invent;
	}
	public void setInvent(Invent invent) {
		this.invent = invent;
	}
	public String getLocationinvent() {
		return locationinvent;
	}
	public void setLocationinvent(String locationinvent) {
		this.locationinvent = locationinvent;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public BigDecimal getSumma() {
		return summa;
	}
	public void setSumma(BigDecimal summa) {
		this.summa = summa;
	}
	public String getUnitid() {
		return unitid;
	}
	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}
	public Integer getRecid() {
		return recid;
	}
	public void setRecid(Integer recid) {
		this.recid = recid;
	}
	
}
