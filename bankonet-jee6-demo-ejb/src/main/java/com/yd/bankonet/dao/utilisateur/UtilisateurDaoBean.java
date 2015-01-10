package com.yd.bankonet.dao.utilisateur;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.utilisateur.Utilisateur;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class UtilisateurDaoBean
 */
@Stateless
@LocalBean
public class UtilisateurDaoBean extends AbstractDao<Utilisateur,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public UtilisateurDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<Utilisateur> getEntityClass() {
		// TODO Auto-generated method stub
		return Utilisateur.class;
	}

    
}
