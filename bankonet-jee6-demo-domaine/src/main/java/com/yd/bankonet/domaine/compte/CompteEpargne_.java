package com.yd.bankonet.domaine.compte;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-24T16:08:00.601+0100")
@StaticMetamodel(CompteEpargne.class)
public class CompteEpargne_ extends Compte_ {
	public static volatile SingularAttribute<CompteEpargne, Double> plafond;
	public static volatile SingularAttribute<CompteEpargne, Float> taux;
}
