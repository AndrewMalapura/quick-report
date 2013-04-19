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
}
