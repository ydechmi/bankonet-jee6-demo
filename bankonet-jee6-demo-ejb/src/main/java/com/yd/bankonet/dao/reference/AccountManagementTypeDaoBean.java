package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.AccountManagementType;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class AccountManagementTypeDaoBean
 */
@Stateless
public class AccountManagementTypeDaoBean extends AbstractDao<AccountManagementType, Integer> {

    /**
     * Default constructor. 
     */
    public AccountManagementTypeDaoBean() {

    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<AccountManagementType> getEntityClass() {
		return AccountManagementType.class;
	}
    
    

}
