package opo.vistec.entity.model;

import java.io.Serializable;

public class OrderId implements Serializable {

	/**
	 *   composite id key 
	 */
	private static final long serialVersionUID = 1L;
	private String salesid;
	private String invoiceid;
	
	public OrderId(){}
	
	public OrderId(String salesid, String invoiceid){
		this.salesid = salesid ;
		this.invoiceid = invoiceid;	
	}

	public String getSalesid() {
		return salesid;
	}

	public void setSalesid(String salesid) {
		this.salesid = salesid;
	}

	public String getInvoiceid() {
		return invoiceid;
	}

	public void setInvoiceid(String invoiceid) {
		this.invoiceid = invoiceid;
	}
	
	@Override
	public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((salesid == null) ? 0 : salesid.hashCode());
	   result = prime * result + ((invoiceid == null) ? 0 : invoiceid.hashCode());
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
	   OrderId other = (OrderId) obj;
	   if (salesid == null) {
	      if (other.salesid != null)
	         return false;
	      } else if (!salesid.equals(other.salesid))
	         return false;
	   if (invoiceid == null) {
	      if (other.invoiceid != null)
	         return false;
	      } else if (!invoiceid.equals(other.invoiceid))
	         return false;

	   return true;
	  }
}
