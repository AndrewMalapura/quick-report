package opo.vistec.entity.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class SalesLine implements Serializable {

	/**
	 * 
	 * @author malapura
	 * Строки заказов
	 */
	private static final long serialVersionUID = 1L;
	
	private Sales sales; 
	private Invent itemid; 		// номенклатура
	private Integer numlines;		
	private String locationitemid;
	private Double qty;
	private Double price;
	private BigDecimal cost;
	private Long recid;
	private String unitid;
	private BigDecimal cost_nds;
	private Double price_nds;
	private BigDecimal nds;
	private Double qty_real;
	
	public Sales getSales() {
		return sales;
	}
	public void setSales(Sales sales) {
		this.sales = sales;
	}
	public Invent getItemid() {
		return itemid;
	}
	public void setItemid(Invent itemid) {
		this.itemid = itemid;
	}
	public Integer getNumlines() {
		return numlines;
	}
	public void setNumlines(Integer numlines) {
		this.numlines = numlines;
	}
	public String getLocationitemid() {
		return locationitemid;
	}
	public void setLocationitemid(String locationitemid) {
		this.locationitemid = locationitemid;
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
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public Long getRecid() {
		return recid;
	}
	public void setRecid(Long recid) {
		this.recid = recid;
	}
	public String getUnitid() {
		return unitid;
	}
	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}
	public BigDecimal getCost_nds() {
		return cost_nds;
	}
	public void setCost_nds(BigDecimal cost_nds) {
		this.cost_nds = cost_nds;
	}
	public Double getPrice_nds() {
		return price_nds;
	}
	public void setPrice_nds(Double price_nds) {
		this.price_nds = price_nds;
	}
	public BigDecimal getNds() {
		return nds;
	}
	public void setNds(BigDecimal nds) {
		this.nds = nds;
	}
	public Double getQty_real() {
		return qty_real;
	}
	public void setQty_real(Double qty_real) {
		this.qty_real = qty_real;
	}

}
