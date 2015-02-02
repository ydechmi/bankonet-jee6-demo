package com.yd.bankonet.dao.accounts;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.accounts.AccountCredit;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class AccountCreditDaoBean
 */
@Stateless
public class AccountCreditDaoBean extends AbstractDao<AccountCredit, Long> {

    /**
     * Default constructor. 
     */
    public AccountCreditDaoBean() {

    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<AccountCredit> getEntityClass() {
		return AccountCredit.class;
	}
    
    

}
