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
	
	private OrderId orderPK; //  composite primary key
	private Date invoicedate;
	private String warrant;
	private Date warrantdata;
	private String warrantwho;
	private String car;
	private String carnumber;
	private BigDecimal cost;
	private List<InvoiceLine> invoiceList;
	
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
	public OrderId getOrderPK() {
		return orderPK;
	}
	public void setOrderPK(OrderId orderPK) {
		this.orderPK = orderPK;
	}

	@Override
	public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((orderPK == null) ? 0 : orderPK.hashCode());
	   result = prime * result + ((invoicedate == null) ? 0 : invoicedate.hashCode());
	   result = prime * result + ((warrant == null) ? 0 : warrant.hashCode());
	   result = prime * result + ((warrantdata == null) ? 0 : warrantdata.hashCode());
	   result = prime * result + ((warrantwho == null) ? 0 : warrantwho.hashCode());
	   result = prime * result + ((car == null) ? 0 : car.hashCode());
	   result = prime * result + ((carnumber == null) ? 0 : carnumber.hashCode());
	   result = prime * result + ((cost == null) ? 0 : cost.hashCode());
	   result = prime * result + ((invoiceList == null) ? 0 : invoiceList.hashCode());
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
	   Invoice other = (Invoice) obj;
	   if (orderPK == null) {
	      if (other.orderPK != null)
	         return false;
	      } else if (!orderPK.equals(other.orderPK))
	         return false;
	   if (invoicedate == null) {
	      if (other.invoicedate != null)
	         return false;
	      } else if (!invoicedate.equals(other.invoicedate))
	         return false;
	   if (warrant == null) {
		      if (other.warrant != null)
		         return false;
		      } else if (!warrant.equals(other.warrant))
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
	   if (cost == null) {
		      if (other.cost != null)
		         return false;
		      } else if (!cost.equals(other.cost))
		         return false;
	   if (invoiceList == null) {
		      if (other.invoiceList != null)
		         return false;
		      } else if (!invoiceList.equals(other.invoiceList))
		         return false;
	   return true;
	  }
}
