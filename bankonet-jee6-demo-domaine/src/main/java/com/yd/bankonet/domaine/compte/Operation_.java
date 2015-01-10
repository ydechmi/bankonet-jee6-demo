package com.yd.bankonet.domaine.compte;

import com.yd.bankonet.domaine.AbstractEntity_;
import com.yd.bankonet.domaine.reference.TypeOperation;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-24T16:08:00.602+0100")
@StaticMetamodel(Operation.class)
public class Operation_ extends AbstractEntity_ {
	public static volatile SingularAttribute<Operation, Date> dateOpe;
	public static volatile SingularAttribute<Operation, Double> montantOpe;
	public static volatile SingularAttribute<Operation, TypeOperation> typeOpe;
	public static volatile SingularAttribute<Operation, Compte> compteDebite;
	public static volatile SingularAttribute<Operation, Compte> compteCredite;
}
