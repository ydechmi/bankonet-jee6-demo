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
@Table(name="ACCOUNT_MANAG_TYPE")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="AMT_ID")),
	@AttributeOverride(name="code", column=@Column(name="AMT_CODE",unique=true)),
	@AttributeOverride(name="libelle", column=@Column(name="AMT_NAME",unique=true))
})
public class TypeGestionCompte extends AbstractReference {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1242983320250670701L;


	/**
	 * 
	 */
	public TypeGestionCompte() {
		
	}
	
}
