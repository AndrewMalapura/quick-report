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

}
