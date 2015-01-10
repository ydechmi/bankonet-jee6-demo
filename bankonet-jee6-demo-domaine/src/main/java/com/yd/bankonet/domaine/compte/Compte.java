package com.yd.bankonet.domaine.compte;




import java.util.ArrayList;
import java.util.List;



import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.yd.bankonet.domaine.AbstractEntity;
import com.yd.bankonet.domaine.reference.StatutCompte;
import com.yd.bankonet.domaine.reference.TypeGestionCompte;
import com.yd.bankonet.domaine.utilisateur.Client;

/**
 * @author ydechmi
 *
 */
@Entity
@Table(name="ACCOUNTS")
@AttributeOverride(name="id", column=@Column(name="ACC_ID",nullable=false))
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ACC_TYPE",discriminatorType=DiscriminatorType.STRING,length=5)
public abstract class Compte extends AbstractEntity<Long> {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -3528045097937757822L;
	
	@Column(name="ACC_CODE_BANK",nullable=false,length=5)
	private String codeBanque;
	
	@Column(name="ACC_CODE_CASH_DESK",nullable=false,length=5)
	private String codeGuichet;
	
	@Column(name="ACC_NUMBER",nullable=false)
	private long numero;
	
	@Column(name="ACC_KEY",nullable=false)
	private String cle;
	
	@Column(name="ACC_NAME",nullable=false,unique=true)
	@NotNull
	private String libelle;

	@ManyToOne
	@JoinColumn(name="ACC_AST_ID", nullable=false)
	private StatutCompte statut;

	@ManyToOne
	@JoinColumn(name="ACC_AMT_ID", nullable=false)
	private TypeGestionCompte typeGestion;

	@OneToOne
	@JoinColumn(name="ACC_CUS_ID", nullable=false)
	private Client client;
	
	@OneToMany(mappedBy="compteDebite")
	private List<Operation> operationsDebit=new ArrayList<Operation>();
	
	@OneToMany(mappedBy="compteCredite")
	private List<Operation> operationsCredit=new ArrayList<Operation>();
	

	public Compte() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}


	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	/**
	 * @return the statut
	 */
	public StatutCompte getStatut() {
		return statut;
	}


	/**
	 * @param statut the statut to set
	 */
	public void setStatut(StatutCompte statut) {
		this.statut = statut;
	}


	/**
	 * @return the typeGestion
	 */
	public TypeGestionCompte getTypeGestion() {
		return typeGestion;
	}


	/**
	 * @param typeGestion the typeGestion to set
	 */
	public void setTypeGestion(TypeGestionCompte typeGestion) {
		this.typeGestion = typeGestion;
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


	/**
	 * @return the operationsDebit
	 */
	public List<Operation> getOperationsDebit() {
		return operationsDebit;
	}


	/**
	 * @param operationsDebit the operationsDebit to set
	 */
	public void setOperationsDebit(List<Operation> operationsDebit) {
		this.operationsDebit = operationsDebit;
	}


	/**
	 * @return the operationsCredit
	 */
	public List<Operation> getOperationsCredit() {
		return operationsCredit;
	}


	/**
	 * @param operationsCredit the operationsCredit to set
	 */
	public void setOperationsCredit(List<Operation> operationsCredit) {
		this.operationsCredit = operationsCredit;
	}
	
	
	/**
	 * @return the codeBanque
	 */
	public String getCodeBanque() {
		return codeBanque;
	}


	/**
	 * @param codeBanque the codeBanque to set
	 */
	public void setCodeBanque(String codeBanque) {
		this.codeBanque = codeBanque;
	}


	/**
	 * @return the codeGuichet
	 */
	public String getCodeGuichet() {
		return codeGuichet;
	}


	/**
	 * @param codeGuichet the codeGuichet to set
	 */
	public void setCodeGuichet(String codeGuichet) {
		this.codeGuichet = codeGuichet;
	}


	/**
	 * @return the numero
	 */
	public long getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(long numero) {
		this.numero = numero;
	}


	/**
	 * @return the cle
	 */
	public String getCle() {
		return cle;
	}


	/**
	 * @param cle the cle to set
	 */
	public void setCle(String cle) {
		this.cle = cle;
	}

	
	

}
