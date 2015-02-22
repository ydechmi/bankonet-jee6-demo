package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.OperationType;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class OperationTypeDaoBean
 */
@Stateless
public class OperationTypeDaoBean extends AbstractDao<OperationType,Integer> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public OperationTypeDaoBean() {
        super();
    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<OperationType> getEntityClass() {
		return OperationType.class;
	}

}
