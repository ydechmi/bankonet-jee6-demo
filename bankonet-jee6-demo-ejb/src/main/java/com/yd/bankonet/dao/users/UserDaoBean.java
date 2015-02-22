package com.yd.bankonet.dao.users;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.users.User;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class UserDaoBean
 */
@Stateless
public class UserDaoBean extends AbstractDao<User,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public UserDaoBean() {
        super();
    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<User> getEntityClass() {
		return User.class;
	}
}
