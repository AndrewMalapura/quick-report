package opo.vistec.entity.model;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
 * @author Andrew Malapura 
 *  inventory transactions
 */
public class InventTrans implements Serializable {

	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;
	private Integer recid;
	private Invent itemid;
	private Integer numlines;
	private String itemlocationid;
	private Double qty;
	private String unitid;
	private Sales documentid;
	private Integer document;
	private Double price;
	private BigDecimal cost;
	private BigDecimal cost_nds;
	
	public Integer getRecid() {
		return recid;
	}
	public void setRecid(Integer recid) {
		this.recid = recid;
	}
	public Invent getItemid() {
		return itemid;
	}
	public void setItemid(Invent itemid) {
		this.itemid = itemid;
	}
	public Integer getNumlines() {
		return numlines;
	}
	public void setNumlines(Integer numlines) {
		this.numlines = numlines;
	}
	public String getItemlocationid() {
		return itemlocationid;
	}
	public void setItemlocationid(String itemlocationid) {
		this.itemlocationid = itemlocationid;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public String getUnitid() {
		return unitid;
	}
	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}
	public Sales getDocumentid() {
		return documentid;
	}
	public void setDocumentid(Sales documentid) {
		this.documentid = documentid;
	}
	public Integer getDocument() {
		return document;
	}
	public void setDocument(Integer document) {
		this.document = document;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public BigDecimal getCost_nds() {
		return cost_nds;
	}
	public void setCost_nds(BigDecimal cost_nds) {
		this.cost_nds = cost_nds;
	}
	
	@Override
	public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((recid == null) ? 0 : recid.hashCode());
	   result = prime * result + ((itemid == null) ? 0 : itemid.hashCode());
	   result = prime * result + ((numlines == null) ? 0 : numlines.hashCode());
	   result = prime * result + ((itemlocationid == null) ? 0 :itemlocationid.hashCode());
	   result = prime * result + ((qty == null) ? 0 : qty.hashCode());
	   result = prime * result + ((documentid == null) ? 0 : documentid.hashCode());
	   result = prime * result + ((document == null) ? 0 : document.hashCode());
	   result = prime * result + ((price == null) ? 0 : price.hashCode());
	   result = prime * result + ((cost == null) ? 0 : cost.hashCode());
	   result = prime * result + ((cost_nds == null) ? 0 : cost_nds.hashCode());
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
	   InventTrans other = (InventTrans) obj;
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
	   if (numlines == null) {
		      if (other.numlines != null)
		         return false;
		      } else if (!numlines.equals(other.numlines))
		         return false;
	   if (itemlocationid == null) {
		      if (other.itemlocationid != null)
		         return false;
		      } else if (!itemlocationid.equals(other.itemlocationid))
		         return false;
	   if (qty == null) {
		      if (other.qty != null)
		         return false;
		      } else if (!qty.equals(other.qty))
		         return false;
	   if (unitid == null) {
		      if (other.unitid != null)
		         return false;
		      } else if (!unitid.equals(other.unitid))
		         return false;
	   if (documentid == null) {
		      if (other.documentid != null)
		         return false;
		      } else if (!documentid.equals(other.documentid))
		         return false;
	   if (document == null) {
		      if (other.document != null)
		         return false;
		      } else if (!document.equals(other.document))
		         return false;
	   if (price == null) {
		      if (other.price != null)
		         return false;
		      } else if (!price.equals(other.price))
		         return false;
	   if (cost == null) {
		      if (other.cost != null)
		         return false;
		      } else if (!cost.equals(other.cost))
		         return false;
	   if (cost_nds == null) {
		      if (other.cost_nds != null)
		         return false;
		      } else if (!cost_nds.equals(other.cost_nds))
		         return false;
	   return true;
	  }
}
