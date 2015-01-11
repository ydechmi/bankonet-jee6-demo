package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.TypeGestionCompte;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class TypeGestionCompteDaoBean
 */
@Stateless
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
