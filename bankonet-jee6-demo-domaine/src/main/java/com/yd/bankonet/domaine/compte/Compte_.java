package com.yd.bankonet.domaine.compte;

import com.yd.bankonet.domaine.AbstractEntity_;
import com.yd.bankonet.domaine.reference.StatutCompte;
import com.yd.bankonet.domaine.reference.TypeGestionCompte;
import com.yd.bankonet.domaine.utilisateur.Client;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-24T16:08:00.594+0100")
@StaticMetamodel(Compte.class)
public class Compte_ extends AbstractEntity_ {
	public static volatile SingularAttribute<Compte, String> codeBanque;
	public static volatile SingularAttribute<Compte, String> codeGuichet;
	public static volatile SingularAttribute<Compte, Long> numero;
	public static volatile SingularAttribute<Compte, String> cle;
	public static volatile SingularAttribute<Compte, String> libelle;
	public static volatile SingularAttribute<Compte, StatutCompte> statut;
	public static volatile SingularAttribute<Compte, TypeGestionCompte> typeGestion;
	public static volatile SingularAttribute<Compte, Client> client;
	public static volatile ListAttribute<Compte, Operation> operationsDebit;
	public static volatile ListAttribute<Compte, Operation> operationsCredit;
}
