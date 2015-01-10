package com.yd.bankonet.domaine.utilisateur;

import com.yd.bankonet.domaine.AbstractEntity_;
import com.yd.bankonet.domaine.compte.Compte;
import com.yd.bankonet.domaine.compte.CompteEdite;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-24T16:08:00.612+0100")
@StaticMetamodel(Client.class)
public class Client_ extends AbstractEntity_ {
	public static volatile SingularAttribute<Client, String> adresse;
	public static volatile SingularAttribute<Client, String> codePostal;
	public static volatile SingularAttribute<Client, String> pays;
	public static volatile SingularAttribute<Client, String> telephone;
	public static volatile SingularAttribute<Client, String> ville;
	public static volatile ListAttribute<Client, Compte> comptes;
	public static volatile ListAttribute<Client, CompteEdite> comptesEdites;
	public static volatile SingularAttribute<Client, Utilisateur> utilisateur;
}
