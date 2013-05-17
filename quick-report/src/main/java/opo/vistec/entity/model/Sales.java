package opo.vistec.entity.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Sales implements Serializable{
	
	/**
	 *  @author malapura
	 *  
	 *  Таблица SalesTable
	 */
	private static final long serialVersionUID = 1L;
	private String salesid;
	private Customer custaccount;
	private Date deliverydate;
	private String currencycode;
	private Long recid;
	private Integer approved;
	private Contract contractaccount;
	private BigDecimal summa;
	private Date warrantdata;
	private String warrantwho;
	private String warrant;
	private String car;
	private String carnumber;
	private Date createdtime;
	private Date modifiedtime;
	private String salesman;
	//private Set<SalesLine> salesList ;
	private List<Invent> salesList;
	
	// Getters and Setters
	public String getSalesid() {
		return salesid;
	}
	public void setSalesid(String salesid) {
		this.salesid = salesid;
	}
	public Customer getCustaccount() {
		return custaccount;
	}
	public void setCustaccount(Customer custaccount) {
		this.custaccount = custaccount;
	}
	public Date getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public Long getRecid() {
		return recid;
	}
	public void setRecid(Long recid) {
		this.recid = recid;
	}
	public Integer getApproved() {
		return approved;
	}
	public void setApproved(Integer approved) {
		this.approved = approved;
	}
	public Contract getContractaccount() {
		return contractaccount;
	}
	public void setContractaccount(Contract contractaccount) {
		this.contractaccount = contractaccount;
	}
	public BigDecimal getSumma() {
		return summa;
	}
	public void setSumma(BigDecimal summa) {
		this.summa = summa;
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
	public String getWarrant() {
		return warrant;
	}
	public void setWarrant(String warrant) {
		this.warrant = warrant;
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
	public Date getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}
	public Date getModifiedtime() {
		return modifiedtime;
	}
	public void setModifiedtime(Date modifiedtime) {
		this.modifiedtime = modifiedtime;
	}
	public String getSalesman() {
		return salesman;
	}
	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}
	public List<Invent> getSalesList() {
		return salesList;
	}
	public void setSalesList(List<Invent> salesList) {
		this.salesList = salesList;
	}
}
