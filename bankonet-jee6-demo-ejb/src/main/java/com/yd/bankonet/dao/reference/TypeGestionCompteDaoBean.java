package com.yd.bankonet.dao.reference;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.TypeGestionCompte;

/**
 * Session Bean implementation class TypeGestionCompteDaoBean
 */
@Stateless
@LocalBean
public class TypeGestionCompteDaoBean extends AbstractDao<TypeGestionCompte, Integer> {

    /**
     * Default constructor. 
     */
    public TypeGestionCompteDaoBean() {
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<TypeGestionCompte> getEntityClass() {
		// TODO Auto-generated method stub
		return TypeGestionCompte.class;
	}
    
    

}
