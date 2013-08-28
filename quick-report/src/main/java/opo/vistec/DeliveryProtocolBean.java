package opo.vistec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import opo.vistec.entity.SalesLineBo;
import opo.vistec.entity.model.Invent;
import opo.vistec.entity.model.SalesLine;
import opo.vistec.report.model.WholesaleBean;

import org.primefaces.context.RequestContext;

public class DeliveryProtocolBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	SalesLineBo salesLineBO;
	
	private List<SalesLine> sold; // коллекция позиций заказов 
    private BigDecimal wholesale_price;  /// ������� ����
    private Date start;
    private Date end;
    private String itemid;
    private Double quantity;
    private Invent selectedInvent;
    
    private ArrayList<WholesaleBean> wholesale_list = new ArrayList<WholesaleBean>();
    
    public void onRowSelect() {  
    	itemid = selectedInvent.getItemid();
    	// ������� ���������� ����
    	RequestContext rc = RequestContext.getCurrentInstance();
        rc.execute("selectInvent.hide()");
    }  
 
    /**
     * 
     * @param event
     */
    
    public void addData(){
    	WholesaleBean wb = new WholesaleBean();
    	sold = salesLineBO.findSoldByDate(start, end, itemid);
    	if(sold.size() == 0) System.out.println("Голяк!!!");
    	else{
    		wb.setProduct_name(sold.get(0).getItemid().getItemname()); // ������� �������� �������. �������
    		wb.setInvent_number(sold.get(0).getItemid().getItemid());  // ������� ����� �������. �������
    		wb.setMark("52");  // �����
    		wb.setUnit(sold.get(0).getUnitid()); // ������� ���������
    		wb.setQuantity(quantity);   //  ����������
    		wb.setComparable_price("");
    		wb.setSum_comparable("");
    		//  ������ ������� ������� ����
    		BigDecimal wholesale_cost = BigDecimal.valueOf(0.00);
    		Double qty = 0.0;
    	for (SalesLine itrbl : sold) {
    		wholesale_cost = wholesale_cost.add(BigDecimal.valueOf(itrbl.getPrice()));
    		qty += itrbl.getQty();
			}
    	//System.out.println("����� �����="+wholesale_cost);
    		/**������� ����**/
    	   // BigDecimal bd_qty = BigDecimal.valueOf(qty);
    	    wb.setWholesale_price(wholesale_cost.divide(BigDecimal.valueOf(sold.size()), 2, RoundingMode.HALF_UP));
    		//wb.setSum_wholesale(wholesale_cost);
    		
    		// ��������� ������
    		wholesale_list.add(wb);
    	}
    	    
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
	public Invent getSelectedInvent() {
		return selectedInvent;
	}
	public void setSelectedInvent(Invent selectedInvent) {
		this.selectedInvent = selectedInvent;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public ArrayList<WholesaleBean> getWholesale_list() {
		return wholesale_list;
	}

	public void setWholesale_list(ArrayList<WholesaleBean> wholesale_list) {
		this.wholesale_list = wholesale_list;
	}
	

}
