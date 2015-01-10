package com.yd.bankonet.domaine.compte;

import com.yd.bankonet.domaine.AbstractEntity_;
import com.yd.bankonet.domaine.utilisateur.Client;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-24T16:08:00.599+0100")
@StaticMetamodel(CompteEdite.class)
public class CompteEdite_ extends AbstractEntity_ {
	public static volatile SingularAttribute<CompteEdite, Date> dateEdition;
	public static volatile SingularAttribute<CompteEdite, Compte> compte;
	public static volatile SingularAttribute<CompteEdite, Client> client;
}
