package com.yd.bankonet.dao.accounts;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.accounts.CheckingAccount;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CheckingAccountDaoBean
 */
@Stateless
public class CheckingAccountDaoBean extends AbstractDao<CheckingAccount,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public CheckingAccountDaoBean() {
        super();
    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<CheckingAccount> getEntityClass() {
		return CheckingAccount.class;
	}
    
    

}
