package com.yd.bankonet.dao.accounts;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.accounts.SavingsAccount;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class SavingsAccountDaoBean
 */
@Stateless
public class SavingsAccountDaoBean extends AbstractDao<SavingsAccount,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public SavingsAccountDaoBean() {
        super();
    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<SavingsAccount> getEntityClass() {
		return SavingsAccount.class;
	}

}
