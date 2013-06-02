package opo.vistec.entity.model;

import java.io.Serializable;
import java.util.Date;

public class Contract implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String contractaccount;
	private String contractnumber; 
	private Date contractdate;
	private String contractcode;
	private String partneraccount;
	private String currencycode;
	private String modifiedby;
	private Date modifieddate;
	

	public String getContractaccount() {
		return contractaccount;
	}
	public void setContractaccount(String contractaccount) {
		this.contractaccount = contractaccount;
	}
	public String getContractnumber() {
		return contractnumber;
	}
	public void setContractnumber(String contractnumber) {
		this.contractnumber = contractnumber;
	}
	public Date getContractdate() {
		return contractdate;
	}
	public void setContractdate(Date contractdate) {
		this.contractdate = contractdate;
	}
	public String getContractcode() {
		return contractcode;
	}
	public void setContractcode(String contractcode) {
		this.contractcode = contractcode;
	}
	public String getPartneraccount() {
		return partneraccount;
	}
	public void setPartneraccount(String partneraccount) {
		this.partneraccount = partneraccount;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	@Override
	public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((contractaccount == null) ? 0 : contractaccount.hashCode());
	   result = prime * result + ((contractnumber == null) ? 0 : contractnumber.hashCode());
	   result = prime * result + ((contractdate == null) ? 0 : contractdate.hashCode());
	   result = prime * result + ((contractcode == null) ? 0 :contractcode.hashCode());
	   result = prime * result + ((partneraccount == null) ? 0 : partneraccount.hashCode());
	   result = prime * result + ((currencycode == null) ? 0 : currencycode.hashCode());
	   result = prime * result + ((modifiedby == null) ? 0 : modifiedby.hashCode());
	   result = prime * result + ((modifieddate == null) ? 0 : modifieddate.hashCode());
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
	   Contract other = (Contract) obj;
	   if (contractaccount == null) {
	      if (other.contractaccount != null)
	         return false;
	      } else if (!contractaccount.equals(other.contractaccount))
	         return false;
	   if (contractnumber == null) {
	      if (other.contractnumber != null)
	         return false;
	      } else if (!contractnumber.equals(other.contractnumber))
	         return false;
	   if (contractdate == null) {
		      if (other.contractdate != null)
		         return false;
		      } else if (!contractdate.equals(other.contractdate))
		         return false;
	   if (contractcode == null) {
		      if (other.contractcode != null)
		         return false;
		      } else if (!contractcode.equals(other.contractcode))
		         return false;
	   if (partneraccount == null) {
		      if (other.partneraccount != null)
		         return false;
		      } else if (!partneraccount.equals(other.partneraccount))
		         return false;
	   if (currencycode == null) {
		      if (other.currencycode != null)
		         return false;
		      } else if (!currencycode.equals(other.currencycode))
		         return false;
	   if (modifiedby == null) {
		      if (other.modifiedby != null)
		         return false;
		      } else if (!modifiedby.equals(other.modifiedby))
		         return false;
	   if (modifieddate == null) {
		      if (other.modifieddate != null)
		         return false;
		      } else if (!modifieddate.equals(other.modifieddate))
		         return false;
	   	   return true;
	  }
}
