package com.yd.bankonet.domaine.utilisateur;

import com.yd.bankonet.domaine.AbstractEntity_;
import com.yd.bankonet.domaine.reference.Langage;
import com.yd.bankonet.domaine.reference.Role;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-24T16:08:00.614+0100")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ extends AbstractEntity_ {
	public static volatile SingularAttribute<Utilisateur, String> firstName;
	public static volatile SingularAttribute<Utilisateur, String> lastName;
	public static volatile SingularAttribute<Utilisateur, Boolean> alertModification;
	public static volatile SingularAttribute<Utilisateur, String> courriel;
	public static volatile SingularAttribute<Utilisateur, Date> derniereConnexion;
	public static volatile SingularAttribute<Utilisateur, String> login;
	public static volatile SingularAttribute<Utilisateur, String> password;
	public static volatile SingularAttribute<Utilisateur, Client> client;
	public static volatile SingularAttribute<Utilisateur, Langage> langue;
	public static volatile ListAttribute<Utilisateur, Role> roles;
}
