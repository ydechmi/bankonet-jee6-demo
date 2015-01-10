/**
 * 
 */
package com.yd.bankonet.domaine.compte;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 * @author ydechmi
 *
 */
@Entity
@DiscriminatorValue("CCO")
public class CompteCourant extends Compte {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -764206683104674951L;
	
	@Column(name="ACC_AMOUNT_MAX")
	private double decouvertAutorise;

	/**
	 * 
	 */
	public CompteCourant() {
	}

	/**
	 * @return the decouvertAutorise
	 */
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	/**
	 * @param decouvertAutorise the decouvertAutorise to set
	 */
	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	
}
