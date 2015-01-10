package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.TypeOperation;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TypeOperationDaoBean
 */
@Stateless
@LocalBean
public class TypeOperationDaoBean extends AbstractDao<TypeOperation,Integer> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public TypeOperationDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<TypeOperation> getEntityClass() {
		// TODO Auto-generated method stub
		return TypeOperation.class;
	}
    
    

}
