package com.yd.bankonet.dao.compte;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.utilisateur.Client;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CompteCourantDaoBean
 */
@Stateless
@LocalBean
public class CompteCourantDaoBean extends AbstractDao<Client,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public CompteCourantDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<Client> getEntityClass() {
		return Client.class;
	}
    
    

}
