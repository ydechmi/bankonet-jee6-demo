package com.yd.bankonet.dao.compte;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.compte.CompteEpargne;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CompteEpargneDaoBean
 */
@Stateless
public class CompteEpargneDaoBean extends AbstractDao<CompteEpargne,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public CompteEpargneDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<CompteEpargne> getEntityClass() {
		// TODO Auto-generated method stub
		return CompteEpargne.class;
	}
    
    

}
