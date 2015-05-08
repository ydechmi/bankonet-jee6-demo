package com.yd.bankonet.dao.users;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.users.User;

import javax.ejb.Stateless;
import java.util.List;

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

	/**
	 * Get user by login
	 * @param login identifier of user
	 * @return User
	 */
	public User findByLogin(String login){
		List<User> users=getEntityManager().createNamedQuery("findByLogin")
				.setParameter("login",login).getResultList();
		if(!users.isEmpty()){
			return users.get(0);
		}else{
			return null;
		}

	}
}
