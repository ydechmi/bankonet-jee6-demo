package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.AccountType;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class AccountTypeDaoBean
 */
@Stateless
public class AccountTypeDaoBean extends AbstractDao<AccountType,Integer> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public AccountTypeDaoBean() {
        super();
    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<AccountType> getEntityClass() {
		return AccountType.class;
	}
    
    

}
