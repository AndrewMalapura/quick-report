package opo.vistec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import opo.vistec.entity.SalesLineBo;
import opo.vistec.entity.model.Invent;
import opo.vistec.entity.model.SalesLine;

import org.primefaces.event.SelectEvent;

public class DeliveryProtocolBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	SalesLineBo salesLineBO;
	
	private List<SalesLine> sold; // проданная продукция 
    private BigDecimal wholesale_price;  /// оптовая цена
    private Date start;
    private Date end;
    private String itemid;
    
    public void handleDateSelect(SelectEvent event) {  
         
    } 
    /**
     * Диалог для выбора номенклатурного номера
     * @param event
     */
    
    public String viewInvents() {  
        return "dialog:selectInvent";  
    }
    
    public void addData(){
    	sold = salesLineBO.findSoldByDate(start, end, itemid);
    	System.out.println("размер коллекции - "+sold.size());
    }
 
	// ------------- getters and setters ---------------
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public SalesLineBo getSalesLineBO() {
		return salesLineBO;
	}
	public void setSalesLineBO(SalesLineBo salesLineBO) {
		this.salesLineBO = salesLineBO;
	}
	public List<SalesLine> getSold() {
		return sold;
	}
	public void setSold(List<SalesLine> sold) {
		this.sold = sold;
	}
	public BigDecimal getWholesale_price() {
		return wholesale_price;
	}
	public void setWholesale_price(BigDecimal wholesale_price) {
		this.wholesale_price = wholesale_price;
	}
	

}
