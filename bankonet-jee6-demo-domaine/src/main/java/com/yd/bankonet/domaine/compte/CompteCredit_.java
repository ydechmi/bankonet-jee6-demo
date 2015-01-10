package com.yd.bankonet.domaine.compte;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-24T16:08:00.598+0100")
@StaticMetamodel(CompteCredit.class)
public class CompteCredit_ extends Compte_ {
	public static volatile SingularAttribute<CompteCredit, Double> montantEmprunte;
	public static volatile SingularAttribute<CompteCredit, Float> taux;
	public static volatile SingularAttribute<CompteCredit, Date> dateDebut;
	public static volatile SingularAttribute<CompteCredit, Date> dateFin;
	public static volatile SingularAttribute<CompteCredit, Compte> compteDebite;
	public static volatile SingularAttribute<CompteCredit, Compte> compteDestinataire;
}
