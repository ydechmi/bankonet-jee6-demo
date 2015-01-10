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
@Table(name="LANGUAGES")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="LGE_ID")),
	@AttributeOverride(name="code", column=@Column(name="LGE_CODE",unique=true)),
	@AttributeOverride(name="libelle", column=@Column(name="LGE_NAME",unique=true))
})
public class Langage extends AbstractReference {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3215580822027595301L;
	

	/**
	 * 
	 */
	public Langage() {
		
	}


	
	


}
