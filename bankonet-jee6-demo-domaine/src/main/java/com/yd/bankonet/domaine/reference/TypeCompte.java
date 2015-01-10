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
@Table(name="ACCOUNT_TYPE")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="ACT_ID")),
	@AttributeOverride(name="code", column=@Column(name="ACT_CODE",unique=true)),
	@AttributeOverride(name="libelle", column=@Column(name="ACT_NAME",unique=true))
})
public class TypeCompte extends AbstractReference {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4458994857653906338L;
	
	/**
	 * 
	 */
	public TypeCompte() {
		
	}


	
}
