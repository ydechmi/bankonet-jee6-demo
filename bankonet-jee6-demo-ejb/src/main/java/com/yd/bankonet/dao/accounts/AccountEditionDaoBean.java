package com.yd.bankonet.dao.accounts;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.accounts.AccountEdition;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AccountEditionDaoBean
 */
@Stateless
@LocalBean
public class AccountEditionDaoBean extends AbstractDao<AccountEdition, Long> {

    /**
     * Default constructor. 
     */
    public AccountEditionDaoBean() {

    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<AccountEdition> getEntityClass() {
		return AccountEdition.class;
	}
    
    

}
