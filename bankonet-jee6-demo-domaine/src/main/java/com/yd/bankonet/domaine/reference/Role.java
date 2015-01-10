/**
 * 
 */
package com.yd.bankonet.domaine.reference;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.yd.bankonet.domaine.AbstractReference;
import com.yd.bankonet.domaine.utilisateur.Utilisateur;

/**
 * @author ydechmi
 *
 */
@Entity
@Table(name="ROLES")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="ROL_ID")),
	@AttributeOverride(name="code", column=@Column(name="ROL_CODE",unique=true)),
	@AttributeOverride(name="libelle", column=@Column(name="ROL_NAME",unique=true))
})
public class Role extends AbstractReference {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3523103983730385993L;
	
	
	@ManyToMany(mappedBy="roles")
	private List<Utilisateur> users=new ArrayList<Utilisateur>();
	
	/**
	 * 
	 */
	public Role() {

	}

	/**
	 * @return the users
	 */
	public List<Utilisateur> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<Utilisateur> users) {
		this.users = users;
	}
	
	
	
	
	
}
