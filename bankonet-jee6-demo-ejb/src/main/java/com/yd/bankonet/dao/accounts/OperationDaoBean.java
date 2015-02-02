package com.yd.bankonet.dao.accounts;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.accounts.Operation;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class OperationDaoBean
 */
@Stateless
public class OperationDaoBean extends AbstractDao<Operation,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public OperationDaoBean() {
        super();

    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<Operation> getEntityClass() {
		return Operation.class;
	}
    
    

}
