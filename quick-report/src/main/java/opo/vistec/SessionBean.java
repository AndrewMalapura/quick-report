package opo.vistec;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

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
	// Пользователь для которого открыта сессия
	User user  = new User();;
	/**
	 *   Объекты бизнес-логики
	 *   сущности ORM  
	 */
	UserBO userBO;             
	CustomerBo customerBO;
	SalesBo salesBO;
	InventBo inventBO;
	Sales selectedSale;
	

	/**
	 *   коллекции данных из БД
	 */
	// Коллекции клиентов
	public List<Customer> custList;
	public List<Customer> filteredCustomers;
	// Коллекции заказов
	public List<Sales> salesList;
	public List<Sales> filteredSales;
	// Коллекции номенклатур
	public List<Invent> inventList;
	public List<Invent> filteredInvent;
	// Текущая страница(контент) 
	private String currentPage = "/pages/customers.xhtml";
	
	
	/**
	 *  авторизация пользователя
	 */
	public String login(){
		// список пользователей из БД
		List<User> list = loadUsers();
		// поиск в коллекции 
		for (User usr : list) {
		  if(usr.equals(user)){
		loadCustomers();
		this.user = usr;
		return "success";
		  }
		}
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "loginfailed";
	}
	
	/**
	 *   Actions
	 */
	public void viewNomenclatures() {  // перейти на страницу номенклатуры
		if(inventList == null) loadInvent();
    	currentPage = "/pages/nomenclature.xhtml";
        addMessage("Номенклатуры");  
    }
    public void viewCustomers() {     //  перейти на страницу клиенты
    	currentPage = "/pages/customers.xhtml";
        addMessage("Клиенты завода");  
    }    
    public void viewUsers() {		//   перейти на страницу пользователи
    	currentPage = "/pages/users.xhtml";
        addMessage("Пользователи");  
    }
    public void viewContracts() {	//   перейти на страницу  контракты
    	currentPage = "/pages/contracts.xhtml";
        addMessage("Контракты");  
    }
    public void viewSales(){		//   перейти на страницу заказы
    	if(salesList==null) loadSales();    	
    	currentPage = "/pages/sales.xhtml";
    	addMessage("Все заказы"); 
    } 
    public void delete() {  
        addMessage("Data deleted");  
    }  
      
	public void addMessage(String summary) {  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);  
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }
	
/**
 *    Вытянуть данные из БД  
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
		return inventList;
	}
	public void setInventList(List<Invent> inventList) {
		this.inventList = inventList;
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
	// ---------------  End getters, setters 

	public Sales getSelectedSale() {
		return selectedSale;
	}

	public void setSelectedSale(Sales selectedSale) {
		this.selectedSale = selectedSale;
	}
}
