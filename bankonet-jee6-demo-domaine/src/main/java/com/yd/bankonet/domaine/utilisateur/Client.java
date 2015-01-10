/**
 * 
 */
package com.yd.bankonet.domaine.utilisateur;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.yd.bankonet.domaine.AbstractEntity;
import com.yd.bankonet.domaine.compte.Compte;
import com.yd.bankonet.domaine.compte.CompteEdite;

/**
 * @author ydechmi
 *
 */
@Entity
@Table(name="CUSTOMERS")
@AttributeOverride(name="id", column=@Column(name="CUS_ID",nullable=false))	
public class Client extends AbstractEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6040893909478020478L;
	
	@Column(name="CUS_ADDRESS",length=250)
	private String adresse;
	
	@Column(name="CUS_POSTAL_CODE",length=50)
	private String codePostal;
	
	@Column(name="CUS_COUNTRY",length=50)
	private String pays;
	
	@Column(name="CUS_PHONE",length=50)
	private String telephone;
	
	@Column(name="CUS_TOWN",length=50)
	private String ville;

	@OneToMany(mappedBy="client")
	private List<Compte> comptes=new ArrayList<Compte>();
	
	@OneToMany(mappedBy="client")
	private List<CompteEdite> comptesEdites=new ArrayList<CompteEdite>();
	
	@OneToOne(mappedBy="client")
	private Utilisateur utilisateur;

	/**
	 * 
	 */
	public Client() {
		
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * @return the comptesEdites
	 */
	public List<CompteEdite> getComptesEdites() {
		return comptesEdites;
	}

	/**
	 * @param comptesEdites the comptesEdites to set
	 */
	public void setComptesEdites(List<CompteEdite> comptesEdites) {
		this.comptesEdites = comptesEdites;
	}

	/**
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	

}
