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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.yd.bankonet.domaine.AbstractEntity;
import com.yd.bankonet.domaine.utilisateur.Client;

/**
 * @author ydechmi
 *
 */
@Entity
@AttributeOverride(name="id", column=@Column(name="CUS_ACC_ID",nullable=false))
@Table(name="CUSTOMER_ACCOUNT_ASS")
public class CompteEdite extends AbstractEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7634708444990961846L;
	
	@Column(name="CAA_PRINT_DATE",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dateEdition;
	
	@ManyToOne
	@JoinColumn(name="CAA_ACC_ID", nullable=false)
	private Compte compte;
	
	@ManyToOne
	@JoinColumn(name="CAA_CUS_ID", nullable=false)
	private Client client;

	/**
	 * 
	 */
	public CompteEdite() {
		super();
	}

	/**
	 * @return the dateEdition
	 */
	public Date getDateEdition() {
		return dateEdition;
	}

	/**
	 * @param dateEdition the dateEdition to set
	 */
	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}

	/**
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
