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
@Table(name="ACCOUNT_STATE")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="AST_ID")),
	@AttributeOverride(name="code", column=@Column(name="AST_CODE",unique=true)),
	@AttributeOverride(name="libelle", column=@Column(name="AST_NAME",unique=true))
})

public class StatutCompte extends AbstractReference {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1080290048967059455L;
	
	/**
	 * 
	 */
	public StatutCompte() {
		
	}	
	
	

}
