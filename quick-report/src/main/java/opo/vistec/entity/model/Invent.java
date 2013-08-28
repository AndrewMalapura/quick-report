package opo.vistec.entity.model;

import java.io.Serializable;
import java.util.Date;

public class Invent implements Serializable{

	/**
	 *    справочник номенклатур
	 *    описаны не все пол€ из Ѕƒ
	 */
	private static final long serialVersionUID = 1L;
	
	private String itemid;
	private String itemgroupid; // номенклатурна€ группа
	private String itemname; // название номенклатуры
	private Integer itemtype;
	private String bomunitid;// единицы измерени€
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
	
	@Override
	public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((recid == null) ? 0 : recid.hashCode());
	   result = prime * result + ((itemid == null) ? 0 : itemid.hashCode());
	   result = prime * result + ((itemgroupid == null) ? 0 : itemgroupid.hashCode());
	   result = prime * result + ((itemname == null) ? 0 :itemname.hashCode());
	   result = prime * result + ((itemtype == null) ? 0 : itemtype.hashCode());
	   result = prime * result + ((bomunitid == null) ? 0 : bomunitid.hashCode());
	   result = prime * result + ((modifieddate == null) ? 0 : modifieddate.hashCode());
	   result = prime * result + ((modifiedby == null) ? 0 : modifiedby.hashCode());
	   result = prime * result + ((createddate == null) ? 0 : createddate.hashCode());
	   result = prime * result + ((createdby == null) ? 0 : createdby.hashCode());
	   result = prime * result + ((locationunitid == null) ? 0 : locationunitid.hashCode());
	   result = prime * result + ((salesunitid == null) ? 0 : salesunitid.hashCode());
	   result = prime * result + ((nds == null) ? 0 : nds.hashCode());
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
	   Invent other = (Invent) obj;
	   if (recid == null) {
	      if (other.recid != null)
	         return false;
	      } else if (!recid.equals(other.recid))
	         return false;
	   if (itemid == null) {
	      if (other.itemid != null)
	         return false;
	      } else if (!itemid.equals(other.itemid))
	         return false;
	   if (itemgroupid == null) {
		      if (other.itemgroupid != null)
		         return false;
		      } else if (!itemgroupid.equals(other.itemgroupid))
		         return false;
	   if (itemname == null) {
		      if (other.itemname != null)
		         return false;
		      } else if (!itemname.equals(other.itemname))
		         return false;
	   if (itemtype == null) {
		      if (other.itemtype != null)
		         return false;
		      } else if (!itemtype.equals(other.itemtype))
		         return false;
	   if (bomunitid == null) {
		      if (other.bomunitid != null)
		         return false;
		      } else if (!bomunitid.equals(other.bomunitid))
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
	   if (locationunitid == null) {
		      if (other.locationunitid != null)
		         return false;
		      } else if (!locationunitid.equals(other.locationunitid))
		         return false;
	   if (salesunitid == null) {
		      if (other.salesunitid != null)
		         return false;
		      } else if (!salesunitid.equals(other.salesunitid))
		         return false;
	   if (saleslocationid == null) {
		      if (other.saleslocationid != null)
		         return false;
		      } else if (!saleslocationid.equals(other.saleslocationid))
		         return false;
	   if (nds == null) {
		      if (other.nds != null)
		         return false;
		      } else if (!nds.equals(other.nds))
		         return false;
	   return true;
	  }
}
