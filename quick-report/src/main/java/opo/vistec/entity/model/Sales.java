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
	private List<SalesLine> salesList;
	
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
	public List<SalesLine> getSalesList() {
		return salesList;
	}
	public void setSalesList(List<SalesLine> salesList) {
		this.salesList = salesList;
	}
	
	@Override
	public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((salesid == null) ? 0 : salesid.hashCode());
	   result = prime * result + ((custaccount == null) ? 0 : custaccount.hashCode());
	   result = prime * result + ((deliverydate == null) ? 0 : deliverydate.hashCode());
	   result = prime * result + ((currencycode == null) ? 0 : currencycode.hashCode());
	   result = prime * result + ((recid == null) ? 0 : recid.hashCode());
	   result = prime * result + ((approved == null) ? 0 : approved.hashCode());
	   result = prime * result + ((contractaccount == null) ? 0 : contractaccount.hashCode());
	   result = prime * result + ((summa == null) ? 0 : summa.hashCode());
	   result = prime * result + ((warrantdata == null) ? 0 : warrantdata.hashCode());
	   result = prime * result + ((warrantwho == null) ? 0 : warrantwho.hashCode());
	   result = prime * result + ((warrant == null) ? 0 : warrant.hashCode());
	   result = prime * result + ((car == null) ? 0 : car.hashCode());
	   result = prime * result + ((carnumber == null) ? 0 : carnumber.hashCode());
	   result = prime * result + ((createdtime == null) ? 0 : createdtime.hashCode());
	   result = prime * result + ((modifiedtime == null) ? 0 : modifiedtime.hashCode());
	   result = prime * result + ((salesman == null) ? 0 : salesman.hashCode());
	   result = prime * result + ((salesList == null) ? 0 : salesList.hashCode());
	   return result;
	}
	@Override
	public boolean equals(Object obj) {
	   if (this == obj)
	      return true;
	   if (obj == null)
	      return false;
	   if (getClass() != obj.getClass())
	      return false;
	   Sales other = (Sales) obj;
	   if (salesid == null) {
	      if (other.salesid != null)
	         return false;
	      } else if (!salesid.equals(other.salesid))
	         return false;
	   if (custaccount == null) {
	      if (other.custaccount != null)
	         return false;
	      } else if (!custaccount.equals(other.custaccount))
	         return false;
	   if (deliverydate == null) {
		      if (other.deliverydate != null)
		         return false;
		      } else if (!deliverydate.equals(other.deliverydate))
		         return false;
	   if (currencycode == null) {
		      if (other.currencycode != null)
		         return false;
		      } else if (!currencycode.equals(other.currencycode))
		         return false;
	   if (recid == null) {
		      if (other.recid != null)
		         return false;
		      } else if (!recid.equals(other.recid))
		         return false;
	   if (approved == null) {
		      if (other.approved != null)
		         return false;
		      } else if (!approved.equals(other.approved))
		         return false;
	   if (contractaccount == null) {
		      if (other.contractaccount != null)
		         return false;
		      } else if (!contractaccount.equals(other.contractaccount))
		         return false;
	   if (summa == null) {
		      if (other.summa != null)
		         return false;
		      } else if (!summa.equals(other.summa))
		         return false;
	   if (warrantdata == null) {
		      if (other.warrantdata != null)
		         return false;
		      } else if (!warrantdata.equals(other.warrantdata))
		         return false;
	   if (warrantwho == null) {
		      if (other.warrantwho != null)
		         return false;
		      } else if (!warrantwho.equals(other.warrantwho))
		         return false;
	   if (warrant == null) {
		      if (other.warrant != null)
		         return false;
		      } else if (!warrant.equals(other.warrant))
		         return false;
	   if (car == null) {
		      if (other.car != null)
		         return false;
		      } else if (!car.equals(other.car))
		         return false;
	   if (carnumber == null) {
		      if (other.carnumber != null)
		         return false;
		      } else if (!carnumber.equals(other.carnumber))
		         return false;
	   if (createdtime == null) {
		      if (other.createdtime != null)
		         return false;
		      } else if (!createdtime.equals(other.createdtime))
		         return false;
	   if (modifiedtime == null) {
		      if (other.modifiedtime != null)
		         return false;
		      } else if (!modifiedtime.equals(other.modifiedtime))
		         return false;
	   if (salesman == null) {
		      if (other.salesman != null)
		         return false;
		      } else if (!salesman.equals(other.salesman))
		         return false;
	   if (salesList == null) {
		      if (other.salesList != null)
		         return false;
		      } else if (!salesList.equals(other.salesList))
		         return false;
	   return true;
	  }
}
