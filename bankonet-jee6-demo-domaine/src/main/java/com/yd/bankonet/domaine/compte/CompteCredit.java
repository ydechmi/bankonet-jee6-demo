/**
 * 
 */
package com.yd.bankonet.domaine.compte;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author ydechmi
 *
 */
@Entity
@DiscriminatorValue("CCR")
public class CompteCredit extends Compte {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 3965808003607135604L;
	
	@Column(name="ACC_LOAN_AMOUNT")
	private double montantEmprunte;
	
	@Column(name="ACC_LOAN_RATE",length=126)
	private float taux;
	
	@Column(name="ACC_LOAN_BEGIN_DATE")
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Column(name="ACC_LOAN_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@OneToOne
	@JoinColumn(name="ACC_CPT_DEB_ID",referencedColumnName="ACC_ID")
	private Compte compteDebite;
	
	@OneToOne
	@JoinColumn(name="ACC_CPT_DST_ID",referencedColumnName="ACC_ID")
	private Compte compteDestinataire;
	/**
	 * 
	 */
	public CompteCredit() {
		
	}
	/**
	 * @return the montantEmprunte
	 */
	public double getMontantEmprunte() {
		return montantEmprunte;
	}
	/**
	 * @param montantEmprunte the montantEmprunte to set
	 */
	public void setMontantEmprunte(double montantEmprunte) {
		this.montantEmprunte = montantEmprunte;
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
	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}
	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}
	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
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
	 * @return the compteDestinataire
	 */
	public Compte getCompteDestinataire() {
		return compteDestinataire;
	}
	/**
	 * @param compteDestinataire the compteDestinataire to set
	 */
	public void setCompteDestinataire(Compte compteDestinataire) {
		this.compteDestinataire = compteDestinataire;
	}
	
	

}
