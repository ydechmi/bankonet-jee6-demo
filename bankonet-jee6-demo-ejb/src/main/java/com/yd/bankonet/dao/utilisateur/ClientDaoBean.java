package com.yd.bankonet.dao.utilisateur;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.utilisateur.Client;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ClientDaoBean
 */
@Stateless
@LocalBean
public class ClientDaoBean extends AbstractDao<Client,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public ClientDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<Client> getEntityClass() {
		// TODO Auto-generated method stub
		return Client.class;
	}
    
    

}
