/**
 * 
 */
package com.yd.bankonet.domaine.utilisateur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.yd.bankonet.domaine.AbstractEntity;
import com.yd.bankonet.domaine.reference.Langage;
import com.yd.bankonet.domaine.reference.Role;


/**
 * @author ydechmi
 *
 */
@Entity
@Table(name="USERS")
@AttributeOverride(name="id", column=@Column(name="USE_ID",nullable=false))
public class Utilisateur extends AbstractEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5337552856714674802L;
	
	@Column(name="USE_FIRST_NAME",length=100,nullable=false)
	private String firstName;
	
	@Column(name="USE_LAST_NAME",length=100,nullable=false)
	private String lastName;
	
	@Column(name="USE_ALERT_MODIF")
	private boolean alertModification;
	
	@Column(name="USE_EMAIL",length=250,unique=true)
	private String courriel;
	
	@Column(name="USE_LAST_CONNEXION")
	@Temporal(TemporalType.DATE)
	private Date derniereConnexion;
	
	@Column(name="USE_LOGIN",length=50,nullable=false,unique=true)
	private String login;
	
	@Column(name="USE_PASSWORD",length=50,nullable=false,unique=true)
	private String password;
	
	@OneToOne
	@JoinColumn(name="USE_CUS_ID",referencedColumnName="CUS_ID")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="USE_LGE_ID")
	private Langage langue;
	
	
	@ManyToMany
	@JoinTable(name="USER_ROLE_ASS",
		joinColumns=@JoinColumn(name="URA_USE_ID",referencedColumnName="USE_ID"),
		inverseJoinColumns=@JoinColumn(name="URA_ROL_ID",referencedColumnName="ROL_ID")
	)
	private List<Role> roles=new ArrayList<Role>();
	

	/**
	 * 
	 */
	public Utilisateur() {
		super();
		
	}

	/**
	 * @return the alertModification
	 */
	public boolean isAlertModification() {
		return alertModification;
	}

	/**
	 * @param alertModification the alertModification to set
	 */
	public void setAlertModification(boolean alertModification) {
		this.alertModification = alertModification;
	}

	/**
	 * @return the courriel
	 */
	public String getCourriel() {
		return courriel;
	}

	/**
	 * @param courriel the courriel to set
	 */
	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	/**
	 * @return the derniereConnexion
	 */
	public Date getDerniereConnexion() {
		return derniereConnexion;
	}

	/**
	 * @param derniereConnexion the derniereConnexion to set
	 */
	public void setDerniereConnexion(Date derniereConnexion) {
		this.derniereConnexion = derniereConnexion;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the langue
	 */
	public Langage getLangue() {
		return langue;
	}

	/**
	 * @param langue the langue to set
	 */
	public void setLangue(Langage langue) {
		this.langue = langue;
	}

	/**
	 * @return the roles
	 */
	public List<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
