package com.yd.bankonet.dao.users;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.users.Customer;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CustomerDaoBean
 */
@Stateless
public class CustomerDaoBean extends AbstractDao<Customer,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public CustomerDaoBean() {
        super();
    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<Customer> getEntityClass() {
		return Customer.class;
	}

}
