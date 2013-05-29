package opo.vistec;

import java.io.Serializable;

import opo.vistec.entity.CustomerBo;
import opo.vistec.entity.InventBo;
import opo.vistec.entity.SalesBo;
import opo.vistec.entity.model.Sales;

/**
 * 
 * @author malapura
 *
 */
public class ChitFormBean implements Serializable{

	/**
	 *  Форма для создания счет-фактуры менеджером
	 */
	private static final long serialVersionUID = 1L;
	
	CustomerBo customerBO;
	SalesBo salesBO;
	InventBo inventBO;
	
	private Sales sale = new Sales();

	
	// -------- getters and setters ----------
	public CustomerBo getCustomerBO() {
		return customerBO;
	}
	public void setCustomerBO(CustomerBo customerBO) {
		this.customerBO = customerBO;
	}
	public SalesBo getSalesBO() {
		return salesBO;
	}
	public void setSalesBO(SalesBo salesBO) {
		this.salesBO = salesBO;
	}
	public InventBo getInventBO() {
		return inventBO;
	}
	public void setInventBO(InventBo inventBO) {
		this.inventBO = inventBO;
	}
	public Sales getSale() {
		return sale;
	}
	public void setSale(Sales sale) {
		this.sale = sale;
	}

}
