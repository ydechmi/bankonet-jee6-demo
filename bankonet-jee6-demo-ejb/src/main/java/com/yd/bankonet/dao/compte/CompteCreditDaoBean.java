package com.yd.bankonet.dao.compte;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.compte.CompteCredit;

/**
 * Session Bean implementation class CompteCreditDaoBean
 */
@Stateless
@LocalBean
public class CompteCreditDaoBean extends AbstractDao<CompteCredit, Long> {

    /**
     * Default constructor. 
     */
    public CompteCreditDaoBean() {
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<CompteCredit> getEntityClass() {
		// TODO Auto-generated method stub
		return CompteCredit.class;
	}
    
    

}
