package opo.vistec.entity.model;

import java.io.Serializable;
import java.util.Date;

public class Invent implements Serializable{

	/**
	 *    Номенклатуры
	 *    описаны не все поля
	 */
	private static final long serialVersionUID = 1L;
	
	private String itemid;
	private String itemgroupid;
	private String itemname; // название номенклатуры
	private Integer itemtype;
	private String bomunitid;
	private Date modifieddate;
	private String modifiedby;
	private Date createddate;
	private String createdby;
	private Long recid;
	private String locationunitid;
	private String salesunitid;
	private String saleslocationid;
	private Integer nds;
	
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getItemgroupid() {
		return itemgroupid;
	}
	public void setItemgroupid(String itemgroupid) {
		this.itemgroupid = itemgroupid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Integer getItemtype() {
		return itemtype;
	}
	public void setItemtype(Integer itemtype) {
		this.itemtype = itemtype;
	}
	public String getBomunitid() {
		return bomunitid;
	}
	public void setBomunitid(String bomunitid) {
		this.bomunitid = bomunitid;
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
	public Long getRecid() {
		return recid;
	}
	public void setRecid(Long recid) {
		this.recid = recid;
	}
	public String getLocationunitid() {
		return locationunitid;
	}
	public void setLocationunitid(String locationunitid) {
		this.locationunitid = locationunitid;
	}
	public String getSalesunitid() {
		return salesunitid;
	}
	public void setSalesunitid(String salesunitid) {
		this.salesunitid = salesunitid;
	}
	public String getSaleslocationid() {
		return saleslocationid;
	}
	public void setSaleslocationid(String saleslocationid) {
		this.saleslocationid = saleslocationid;
	}
	public Integer getNds() {
		return nds;
	}
	public void setNds(Integer nds) {
		this.nds = nds;
	}	

}
