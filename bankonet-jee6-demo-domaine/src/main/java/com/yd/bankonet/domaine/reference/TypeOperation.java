/**
 * 
 */
package com.yd.bankonet.domaine.reference;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.yd.bankonet.domaine.AbstractReference;

/**
 * @author ydechmi
 *
 */

@Entity
@Table(name="OPERATION_TYPE")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="OPT_ID")),
	@AttributeOverride(name="code", column=@Column(name="OPT_CODE",unique=true)),
	@AttributeOverride(name="libelle", column=@Column(name="OPT_NAME",unique=true))
})
public class TypeOperation extends AbstractReference{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1289075133417808628L;
	
	/**
	 * 
	 */
	public TypeOperation() {
		super();
	}
}
