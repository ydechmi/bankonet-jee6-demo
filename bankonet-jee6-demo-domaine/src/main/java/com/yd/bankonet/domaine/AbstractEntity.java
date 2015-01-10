/**
 * 
 */
package com.yd.bankonet.domaine;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/**
 * @author ydechmi
 *
 */
@MappedSuperclass
public abstract class AbstractEntity<ID> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6296680255948314831L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull	
	private ID id;

	/**
	 * @return the id
	 */
	public ID getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ID id) {
		this.id = id;
	}
	
	

}
