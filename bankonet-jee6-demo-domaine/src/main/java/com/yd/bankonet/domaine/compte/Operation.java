/**
 * 
 */
package com.yd.bankonet.domaine.compte;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.yd.bankonet.domaine.AbstractEntity;
import com.yd.bankonet.domaine.reference.TypeOperation;

/**
 * @author ydechmi
 *
 */
@Entity
@Table(name="OPERATIONS")
@AttributeOverride(name="id", column=@Column(name="OPE_ID"))
public class Operation extends AbstractEntity<Long> {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 905829556156780998L;
	
	@Column(name="OPE_DATE",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dateOpe;
	
	@Column(name="OPE_AMOUNT",length=128,nullable=false)
	private double montantOpe;
	
	@ManyToOne
	@JoinColumn(name="OPE_OPT_ID", nullable=false)
	private TypeOperation typeOpe;
	
	@OneToOne
	@JoinColumn(name="OPE_CD_ID", nullable=false)
	private Compte compteDebite;
	
	@OneToOne
	@JoinColumn(name="OPE_CC_ID", nullable=false)
	private Compte compteCredite;

	/**
	 * 
	 */
	public Operation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the dateOpe
	 */
	public Date getDateOpe() {
		return dateOpe;
	}

	/**
	 * @param dateOpe the dateOpe to set
	 */
	public void setDateOpe(Date dateOpe) {
		this.dateOpe = dateOpe;
	}

	/**
	 * @return the montantOpe
	 */
	public double getMontantOpe() {
		return montantOpe;
	}

	/**
	 * @param montantOpe the montantOpe to set
	 */
	public void setMontantOpe(double montantOpe) {
		this.montantOpe = montantOpe;
	}

	/**
	 * @return the typeOpe
	 */
	public TypeOperation getTypeOpe() {
		return typeOpe;
	}

	/**
	 * @param typeOpe the typeOpe to set
	 */
	public void setTypeOpe(TypeOperation typeOpe) {
		this.typeOpe = typeOpe;
	}

	/**
	 * @return the compteDebite
	 */
	public Compte getCompteDebite() {
		return compteDebite;
	}

	/**
	 * @param compteDebite the compteDebite to set
	 */
	public void setCompteDebite(Compte compteDebite) {
		this.compteDebite = compteDebite;
	}

	/**
	 * @return the compteCredite
	 */
	public Compte getCompteCredite() {
		return compteCredite;
	}

	/**
	 * @param compteCredite the compteCredite to set
	 */
	public void setCompteCredite(Compte compteCredite) {
		this.compteCredite = compteCredite;
	}
	
	


}
