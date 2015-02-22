package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.AccountStatus;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class AccountStatusDaoBean
 */
@Stateless
public class AccountStatusDaoBean extends AbstractDao<AccountStatus,Integer> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public AccountStatusDaoBean() {
        super();
    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<AccountStatus> getEntityClass() {
		return AccountStatus.class;
	}

}
