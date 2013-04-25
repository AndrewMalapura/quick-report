package opo.vistec.entity.model;

import java.io.Serializable;

public class InvoiceLineId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String salesid;
	private String invoiceid;
	private Invent invent;
	
	public InvoiceLineId(){}
	
	public InvoiceLineId(String salesid, String invoiceid, Invent invent){
		this.salesid = salesid;
		this.invoiceid = invoiceid;
		this.invent = invent;
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

	public Invent getInvent() {
		return invent;
	}

	public void setInvent(Invent invent) {
		this.invent = invent;
	}
	
	@Override
	public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((salesid == null) ? 0 : salesid.hashCode());
	   result = prime * result + ((invoiceid == null) ? 0 : invoiceid.hashCode());
	   result = prime * result + ((invent == null) ? 0 : invent.hashCode());
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
	   InvoiceLineId other = (InvoiceLineId) obj;
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
	   if (invent == null) {
		      if (other.invent != null)
		         return false;
		      } else if (!invoiceid.equals(other.invoiceid))
		         return false;
	   return true;
	  }
}
