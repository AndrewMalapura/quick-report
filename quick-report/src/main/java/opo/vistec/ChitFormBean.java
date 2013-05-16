package opo.vistec;

import java.io.Serializable;
import java.util.List;

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
	
	// ---- атрибуты поставщика --
	
	private List<String> factory_attributes;

	public List<String> getFactory_attributes() {		
		return factory_attributes;
	} 

}
