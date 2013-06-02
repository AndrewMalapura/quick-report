package opo.vistec.entity.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class SalesLine implements Serializable {

	/**
	 * 
	 * @author malapura
	 * sale strings
	 */
	private static final long serialVersionUID = 1L;
	
	private Sales sales; 
	private Invent itemid; 		
	private Integer numlines;		
	private String locationitemid;
	private Double qty;
	private Double price;
	private BigDecimal cost;
	private Integer recid;
	private String unitid;
	private BigDecimal cost_nds;
	private Double price_nds;
	private BigDecimal nds;
	private Double qty_real;
	

	public Sales getSales() {
		return sales;
	}
	public void setSales(Sales sales) {
		this.sales = sales;
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
	public String getLocationitemid() {
		return locationitemid;
	}
	public void setLocationitemid(String locationitemid) {
		this.locationitemid = locationitemid;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
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
	public Integer getRecid() {
		return recid;
	}
	public void setRecid(Integer recid) {
		this.recid = recid;
	}
	public String getUnitid() {
		return unitid;
	}
	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}
	public BigDecimal getCost_nds() {
		return cost_nds;
	}
	public void setCost_nds(BigDecimal cost_nds) {
		this.cost_nds = cost_nds;
	}
	public Double getPrice_nds() {
		return price_nds;
	}
	public void setPrice_nds(Double price_nds) {
		this.price_nds = price_nds;
	}
	public BigDecimal getNds() {
		return nds;
	}
	public void setNds(BigDecimal nds) {
		this.nds = nds;
	}
	public Double getQty_real() {
		return qty_real;
	}
	public void setQty_real(Double qty_real) {
		this.qty_real = qty_real;
	}

	@Override
	public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((sales == null) ? 0 : sales.hashCode());
	   result = prime * result + ((itemid == null) ? 0 : itemid.hashCode());
	   result = prime * result + ((numlines == null) ? 0 : numlines.hashCode());
	   result = prime * result + ((locationitemid == null) ? 0 : locationitemid.hashCode());
	   result = prime * result + ((qty == null) ? 0 : qty.hashCode());
	   result = prime * result + ((price == null) ? 0 : price.hashCode());
	   result = prime * result + ((cost == null) ? 0 : cost.hashCode());
	   result = prime * result + ((recid == null) ? 0 : recid.hashCode());
	   result = prime * result + ((unitid == null) ? 0 : unitid.hashCode());
	   result = prime * result + ((cost_nds == null) ? 0 : cost_nds.hashCode());
	   result = prime * result + ((price_nds == null) ? 0 : price_nds.hashCode());
	   result = prime * result + ((nds == null) ? 0 : nds.hashCode());
	   result = prime * result + ((qty_real == null) ? 0 : qty_real.hashCode());	   
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
	   SalesLine other = (SalesLine) obj;
	   if (sales == null) {
	      if (other.sales != null)
	         return false;
	      } else if (!sales.equals(other.sales))
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
	   if (locationitemid == null) {
		      if (other.locationitemid != null)
		         return false;
		      } else if (!locationitemid.equals(other.locationitemid))
		         return false;
	   if (qty == null) {
		      if (other.qty != null)
		         return false;
		      } else if (!qty.equals(other.qty))
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
	   if (recid == null) {
		      if (other.recid != null)
		         return false;
		      } else if (!recid.equals(other.recid))
		         return false;
	   if (unitid == null) {
		      if (other.unitid != null)
		         return false;
		      } else if (!unitid.equals(other.unitid))
		         return false;
	   if (cost_nds == null) {
		      if (other.cost_nds != null)
		         return false;
		      } else if (!cost_nds.equals(other.cost_nds))
		         return false;
	   if (price_nds == null) {
		      if (other.price_nds != null)
		         return false;
		      } else if (!price_nds.equals(other.price_nds))
		         return false;
	   if (nds == null) {
		      if (other.nds != null)
		         return false;
		      } else if (!nds.equals(other.nds))
		         return false;
	   if (qty_real == null) {
		      if (other.qty_real != null)
		         return false;
		      } else if (!qty_real.equals(other.qty_real))
		         return false;
	   return true;
	  }
}
