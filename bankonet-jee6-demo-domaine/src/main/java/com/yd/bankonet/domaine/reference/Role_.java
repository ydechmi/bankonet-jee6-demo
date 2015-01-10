package com.yd.bankonet.domaine.reference;

import com.yd.bankonet.domaine.AbstractReference_;
import com.yd.bankonet.domaine.utilisateur.Utilisateur;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-24T16:08:00.605+0100")
@StaticMetamodel(Role.class)
public class Role_ extends AbstractReference_ {
	public static volatile ListAttribute<Role, Utilisateur> users;
}
