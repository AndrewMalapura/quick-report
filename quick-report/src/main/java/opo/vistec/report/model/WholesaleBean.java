package opo.vistec.report.model;

import java.math.BigDecimal;

public class WholesaleBean {
	
	String product_name;
	String invent_number;
	String mark;
	String unit;
	Double quantity;
	String comparable_price;
	BigDecimal wholesale_price;
	String sum_comparable;
	BigDecimal sum_wholesale;
	
	// ---- Getters and Setters -----
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getInvent_number() {
		return invent_number;
	}
	public void setInvent_number(String invent_number) {
		this.invent_number = invent_number;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public String getComparable_price() {
		return comparable_price;
	}
	public void setComparable_price(String comparable_price) {
		this.comparable_price = comparable_price;
	}
	public BigDecimal getWholesale_price() {
		return wholesale_price;
	}
	public void setWholesale_price(BigDecimal wholesale_price) {
		this.wholesale_price = wholesale_price;
	}
	public String getSum_comparable() {
		return sum_comparable;
	}
	public void setSum_comparable(String sum_comparable) {
		this.sum_comparable = sum_comparable;
	}
	public BigDecimal getSum_wholesale() {
		return sum_wholesale;
	}
	public void setSum_wholesale(BigDecimal sum_wholesale) {
		this.sum_wholesale = sum_wholesale;
	}
	
}
