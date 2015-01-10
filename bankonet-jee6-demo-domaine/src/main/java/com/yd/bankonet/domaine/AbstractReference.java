/**
 * 
 */
package com.yd.bankonet.domaine;

import javax.persistence.MappedSuperclass;

/**
 * @author ydechmi
 *
 */
@MappedSuperclass
public class AbstractReference extends AbstractEntity<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7144228493615849921L;
	
	private String code;
	
	private String libelle;

	/**
	 * 
	 */
	public AbstractReference() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

}
