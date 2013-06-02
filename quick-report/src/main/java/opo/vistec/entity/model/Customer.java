package opo.vistec.entity.model;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author malapura
 * 
 *  Таблица клиентов предприятия custtable
 */
public class Customer implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -3158492031436474103L;
	private String accountnun;
	private String name;
	private String address;
	private String phone;
	private String custgroup;
	private String currency;
	private String country;
	private String zipcode;
	private String state;
	private String county;
	private String namealias;
	private String city;
	private String inn_ru;
	private String codeokpo_ru;
	private String regno_nds_ua;
	private Integer notresident_ua;
	private Date modifieddate;
	private String modifiedby;
	private Date createddate;
	private String createdby;
	private String manager;
	
	// getters and setters
	public String getAccountnun() {
		return accountnun;
	}
	public void setAccountnun(String accountnun) {
		this.accountnun = accountnun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCustgroup() {
		return custgroup;
	}
	public void setCustgroup(String custgroup) {
		this.custgroup = custgroup;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getNamealias() {
		return namealias;
	}
	public void setNamealias(String namealias) {
		this.namealias = namealias;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInn_ru() {
		return inn_ru;
	}
	public void setInn_ru(String inn_ru) {
		this.inn_ru = inn_ru;
	}
	public String getCodeokpo_ru() {
		return codeokpo_ru;
	}
	public void setCodeokpo_ru(String codeokpo_ru) {
		this.codeokpo_ru = codeokpo_ru;
	}
	public String getRegno_nds_ua() {
		return regno_nds_ua;
	}
	public void setRegno_nds_ua(String regno_nds_ua) {
		this.regno_nds_ua = regno_nds_ua;
	}
	public Integer getNotresident_ua() {
		return notresident_ua;
	}
	public void setNotresident_ua(Integer notresident_ua) {
		this.notresident_ua = notresident_ua;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	@Override
	public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((accountnun == null) ? 0 : accountnun.hashCode());
	   result = prime * result + ((name == null) ? 0 : name.hashCode());
	   result = prime * result + ((address == null) ? 0 : address.hashCode());
	   result = prime * result + ((phone == null) ? 0 :phone.hashCode());
	   result = prime * result + ((custgroup == null) ? 0 : custgroup.hashCode());
	   result = prime * result + ((currency == null) ? 0 : currency.hashCode());
	   result = prime * result + ((country == null) ? 0 : country.hashCode());
	   result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
	   result = prime * result + ((state == null) ? 0 : state.hashCode());
	   result = prime * result + ((county == null) ? 0 : county.hashCode());
	   result = prime * result + ((namealias == null) ? 0 : namealias.hashCode());
	   result = prime * result + ((city == null) ? 0 : city.hashCode());
	   result = prime * result + ((inn_ru == null) ? 0 : inn_ru.hashCode());
	   result = prime * result + ((codeokpo_ru== null) ? 0 : codeokpo_ru.hashCode());
	   result = prime * result + ((regno_nds_ua == null) ? 0 : regno_nds_ua.hashCode());
	   result = prime * result + ((notresident_ua == null) ? 0 : notresident_ua.hashCode());
	   result = prime * result + ((modifieddate == null) ? 0 : modifieddate.hashCode());
	   result = prime * result + ((modifiedby == null) ? 0 : modifiedby.hashCode());
	   result = prime * result + ((createddate == null) ? 0 : createddate.hashCode());
	   result = prime * result + ((createdby == null) ? 0 : createdby.hashCode());
	   result = prime * result + ((manager == null) ? 0 : manager.hashCode());
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
	   Customer other = (Customer) obj;
	   if (accountnun == null) {
	      if (other.accountnun != null)
	         return false;
	      } else if (!accountnun.equals(other.accountnun))
	         return false;
	   if (name == null) {
	      if (other.name != null)
	         return false;
	      } else if (!name.equals(other.name))
	         return false;
	   if (address == null) {
		      if (other.address != null)
		         return false;
		      } else if (!address.equals(other.address))
		         return false;
	   if (phone == null) {
		      if (other.phone != null)
		         return false;
		      } else if (!phone.equals(other.phone))
		         return false;
	   if (custgroup == null) {
		      if (other.custgroup != null)
		         return false;
		      } else if (!custgroup.equals(other.custgroup))
		         return false;
	   if (currency == null) {
		      if (other.currency != null)
		         return false;
		      } else if (!currency.equals(other.currency))
		         return false;
	   if (country == null) {
		      if (other.country != null)
		         return false;
		      } else if (!country.equals(other.country))
		         return false;
	   if (zipcode == null) {
		      if (other.zipcode != null)
		         return false;
		      } else if (!zipcode.equals(other.zipcode))
		         return false;
	   if (state == null) {
		      if (other.state != null)
		         return false;
		      } else if (!state.equals(other.state))
		         return false;
	   if (county == null) {
		      if (other.county != null)
		         return false;
		      } else if (!county.equals(other.county))
		         return false;
	   if (namealias == null) {
		      if (other.namealias != null)
		         return false;
		      } else if (!namealias.equals(other.namealias))
		         return false;
	   if (city == null) {
		      if (other.city != null)
		         return false;
		      } else if (!city.equals(other.city))
		         return false;
	   if (inn_ru == null) {
		      if (other.inn_ru != null)
		         return false;
		      } else if (!inn_ru.equals(other.inn_ru))
		         return false;
	   if (codeokpo_ru == null) {
		      if (other.codeokpo_ru != null)
		         return false;
		      } else if (!codeokpo_ru.equals(other.codeokpo_ru))
		         return false;
	   if (regno_nds_ua == null) {
		      if (other.regno_nds_ua != null)
		         return false;
		      } else if (!regno_nds_ua.equals(other.regno_nds_ua))
		         return false;
	   if (notresident_ua == null) {
		      if (other.notresident_ua != null)
		         return false;
		      } else if (!notresident_ua.equals(other.notresident_ua))
		         return false;
	   if (modifieddate == null) {
		      if (other.modifieddate != null)
		         return false;
		      } else if (!modifieddate.equals(other.modifieddate))
		         return false;
	   if (modifiedby == null) {
		      if (other.modifiedby != null)
		         return false;
		      } else if (!modifiedby.equals(other.modifiedby))
		         return false;
	   if (createddate == null) {
		      if (other.createddate != null)
		         return false;
		      } else if (!createddate.equals(other.createddate))
		         return false;
	   if (createdby == null) {
		      if (other.createdby != null)
		         return false;
		      } else if (!createdby.equals(other.createdby))
		         return false;
	   if (manager == null) {
		      if (other.manager != null)
		         return false;
		      } else if (!manager.equals(other.manager))
		         return false;
	   return true;
	  }
}
