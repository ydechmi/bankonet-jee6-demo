package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.StatutCompte;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class StatutCompteDaoBean
 */
@Stateless
public class StatutCompteDaoBean extends AbstractDao<StatutCompte,Integer> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public StatutCompteDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<StatutCompte> getEntityClass() {
		// TODO Auto-generated method stub
		return StatutCompte.class;
	}
    
    

}
