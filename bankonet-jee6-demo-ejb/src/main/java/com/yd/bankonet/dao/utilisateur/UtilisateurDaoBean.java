package com.yd.bankonet.dao.utilisateur;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.utilisateur.Utilisateur;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class UtilisateurDaoBean
 */
@Stateless
public class UtilisateurDaoBean extends AbstractDao<Utilisateur,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public UtilisateurDaoBean() {
        super();
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<Utilisateur> getEntityClass() {
		return Utilisateur.class;
	}

    
}
