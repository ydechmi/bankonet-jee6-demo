/**
 * 
 */
package com.yd.bankonet.domaine.compte;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 * @author ydechmi
 *
 */
@Entity
@DiscriminatorValue("CEP")
public class CompteEpargne extends Compte {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7538268885866989987L;
	
	@Column(name="ACC_SAVINGS_AMOUNT_MAX")
	private double plafond;
	
	@Column(name="ACC_SAVINGS_RATE",length=126)
	private float taux;

	/**
	 * 
	 */
	public CompteEpargne() {
	}

	/**
	 * @return the plafond
	 */
	public double getPlafond() {
		return plafond;
	}

	/**
	 * @param plafond the plafond to set
	 */
	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}

	/**
	 * @return the taux
	 */
	public float getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(float taux) {
		this.taux = taux;
	}

}
