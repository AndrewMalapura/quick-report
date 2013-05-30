package opo.vistec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import opo.vistec.auth.UserBO;
import opo.vistec.auth.model.User;
import opo.vistec.entity.*;
import opo.vistec.entity.model.*;


/**
 *  @author malapura
 * 
 */

public class SessionBean implements Serializable {

	private static final long serialVersionUID = 1L;
	// ������������ ��� �������� ������� ������
	User user  = new User();
	/**
	 *   ������� ������-������
	 *      �������� ORM  
	 */
	UserBO userBO;             
	CustomerBo customerBO;
	SalesBo salesBO;
	InventBo inventBO;
	InvoiceBo invoiceBO;
	
	
	

	/**
	 *   ��������� ������ �� ��
	 */
	// ��������� ��������
	public List<Customer> custList;
	public List<Customer> filteredCustomers;
	// ��������� �������
	public List<Sales> salesList;
	public List<Sales> filteredSales;
	Sales selectedSale;
	// ��������� �����������
	public List<Invent> inventList = new ArrayList<Invent>();
	public List<Invent> filteredInvent;
	Invent selectedInvent;
	// ��������� ������� (���������)
	public List<Invoice> ordersList;
	
	// �������� �������� � ������������ ���������(layoutUnit "centerlayot")  
	private String currentPage = "/pages/customers.xhtml";
	
	
	public void onRowSelect(SelectEvent event) {  
    	System.out.println("onRowSelect");
    	RequestContext rc = RequestContext.getCurrentInstance();
        rc.execute("selectInvent.hide()");
    }  
	
	/**
	 *  user authorization
	 */
	public String login(){
		Locale locale = new Locale("ru");
		FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
		//FacesMessage.
		// ������ ������������� �� ��
		List<User> list = userBO.findAllUsers();
		// ����� � ��������� 
		for (User usr : list) {
	 if(usr.equals(user)){
	    loadCustomers();
	    this.user = usr;
		    return "success";
	 }
		}
		// �������� ������
	 FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		    return "loginfailed";
	}
	
	/**
	 *   Actions
	 */
	public void viewNomenclatures() {  // ������� �� �������� ������������
		if(inventList == null) loadInvent();
    	currentPage = "/pages/nomenclature.xhtml";
        addMessage("������������");  
    }
    public void viewCustomers() {     //  ������� �� �������� �������
    	currentPage = "/pages/customers.xhtml";
        addMessage("������� ������");  
    }    
    public void viewUsers() {		//   ������� �� �������� ������������
    	currentPage = "/pages/users.xhtml";
        addMessage("������������");  
    }
    public void viewContracts() {	//   ������� �� ��������  ���������
    	currentPage = "/pages/contracts.xhtml";
        addMessage("���������");  
    }
    public void viewSales(){		//   ������� �� �������� ������
    	if(salesList==null) loadSales();    	
    	currentPage = "/pages/sales.xhtml";
    	addMessage("��� ������"); 
    } 
    public void delete() {  
        addMessage("Data deleted");  
    }  
      
	public void addMessage(String summary) {  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);  
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }
	
/**
 *    �������� ������ �� ��  
 */
	public List<User> loadUsers(){
		return userBO.findAllUsers();
	}
	public void loadCustomers(){
		custList = customerBO.findAllCustomer();
	}	
	public void loadSales(){
		salesList = salesBO.findAllSales();
	}
	public void loadInvent(){
		inventList = inventBO.findAllInvents();
	}
	public void loadOrders(){	
		//OrderId id = new OrderId("868/08", "1013"); 
		ordersList = invoiceBO.findAllOrders();
		System.out.println("size="+ordersList.size());
		int i = 0;
		for (Invoice order : ordersList) {
			System.out.println(" invoice :"+order.getOrderPK().getInvoiceid()+
		" salesid :"+order.getOrderPK().getSalesid()+"  size list :"+order.getInvoiceList().size());	
			if(i>10) break;
			i++;
		}
	}

	
//  ----------  getters and setters ------------------
	public UserBO getUserBO() {
		return userBO;
	}
	public void setUserBO(UserBO userBO) {
		this.userBO = userBO;
	}
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Customer> getFilteredCustomers() {
		return filteredCustomers;
	}
	public void setFilteredCustomers(List<Customer> filteredCustomers) {
		this.filteredCustomers = filteredCustomers;
	}
	public List<Sales> getFilteredSales() {
		return filteredSales;
	}
	public void setFilteredSales(List<Sales> filteredSales) {
		this.filteredSales = filteredSales;
	}	
	public List<Customer> getCustList() {
		return custList;
	}	
	public void setCustList(List<Customer> custList) {
		this.custList = custList;
	}
    public List<Sales> getSalesList() {
		return salesList;
	}
	public void setSalesList(List<Sales> salesList) {
		this.salesList = salesList;
	}
    public List<Invent> getInventList() {
    	if(inventList.size()==0) loadInvent();
		return inventList;
	}
	public void setInventList(List<Invent> inventList) {
		this.inventList = inventList;
	}
	public InvoiceBo getInvoiceBO() {
		return invoiceBO;
	}

	public void setInvoiceBO(InvoiceBo invoiceBO) {
		this.invoiceBO = invoiceBO;
	}

	public List<Invoice> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Invoice> ordersList) {
		this.ordersList = ordersList;
	}

	public List<Invent> getFilteredInvent() {
		return filteredInvent;
	}
	public void setFilteredInvent(List<Invent> filteredInvent) {
		this.filteredInvent = filteredInvent;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public Sales getSelectedSale() {
		return selectedSale;
	}

	public void setSelectedSale(Sales selectedSale) {
		this.selectedSale = selectedSale;
	}
	// ---------------  End getters, setters 

	public Invent getSelectedInvent() {
		return selectedInvent;
	}

	public void setSelectedInvent(Invent selectedInvent) {
		this.selectedInvent = selectedInvent;
	}
}
