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
	 *  ����� ��� �������� ����-������� ����������
	 */
	private static final long serialVersionUID = 1L;
	
	// ---- �������� ���������� --
	
	private List<String> factory_attributes;

	public List<String> getFactory_attributes() {		
		return factory_attributes;
	} 

}
