package opo.vistec.entity.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class InvoiceLine implements Serializable {

	/**
	 * Строки налоговой наклакдной
	 */
	private static final long serialVersionUID = 6806008116767082342L;
	private Invoice order;
	private Invent invent;
	private String locationinvent;
	private Double qty;
	private Double price;
	private BigDecimal summa;
	private String unitid;
	private InvoiceLineId id;
	
	public Invoice getOrder() {
		return order;
	}
	public void setOrder(Invoice order) {
		this.order = order;
	}
	public Invent getInvent() {
		return invent;
	}
	public void setInvent(Invent invent) {
		this.invent = invent;
	}
	public String getLocationinvent() {
		return locationinvent;
	}
	public void setLocationinvent(String locationinvent) {
		this.locationinvent = locationinvent;
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
	public BigDecimal getSumma() {
		return summa;
	}
	public void setSumma(BigDecimal summa) {
		this.summa = summa;
	}
	public String getUnitid() {
		return unitid;
	}
	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}
	public InvoiceLineId getId() {
		return id;
	}
	public void setId(InvoiceLineId id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((order == null) ? 0 : order.hashCode());
	   result = prime * result + ((invent == null) ? 0 : invent.hashCode());
	   result = prime * result + ((locationinvent == null) ? 0 : locationinvent.hashCode());
	   result = prime * result + ((qty == null) ? 0 : qty.hashCode());
	   result = prime * result + ((price == null) ? 0 : price.hashCode());
	   result = prime * result + ((summa == null) ? 0 : summa.hashCode());
	   result = prime * result + ((unitid == null) ? 0 : unitid.hashCode());
	   result = prime * result + ((id == null) ? 0 : id.hashCode());
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
	   InvoiceLine other = (InvoiceLine) obj;
	   if (id == null) {
	      if (other.id != null)
	         return false;
	      } else if (!id.equals(other.id))
	         return false;
	   if (order == null) {
	      if (other.order != null)
	         return false;
	      } else if (!order.equals(other.order))
	         return false;
	   if (invent == null) {
		      if (other.invent != null)
		         return false;
		      } else if (!invent.equals(other.invent))
		         return false;
	   if (locationinvent == null) {
		      if (other.locationinvent != null)
		         return false;
		      } else if (!locationinvent.equals(other.locationinvent))
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
	   if (summa == null) {
		      if (other.summa != null)
		         return false;
		      } else if (!summa.equals(other.summa))
		         return false;
	   if (unitid == null) {
		      if (other.unitid != null)
		         return false;
		      } else if (!unitid.equals(other.unitid))
		         return false;
	   return true;
	  }
}
