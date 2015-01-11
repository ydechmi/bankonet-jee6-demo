package com.yd.bankonet.service.datas;

import com.yd.bankonet.dao.reference.*;
import com.yd.bankonet.dao.utilisateur.ClientDaoBean;
import com.yd.bankonet.dao.utilisateur.UtilisateurDaoBean;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Created by ydechmi on 11/01/2015.
 */
@Stateless(name = "RepositoryService")
public class RepositoryBean{

    @EJB
    private LangageDaoBean langageDao;

    @EJB
    private RoleDaoBean roleDao;

    @EJB
    private StatutCompteDaoBean statutCompteDao;

    @EJB
    private TypeCompteDaoBean typeCompteDao;

    @EJB
    private TypeGestionCompteDaoBean typeGestionCompteDao;

    @EJB
    private TypeOperationDaoBean typeOperationDao;

    @EJB
    private ClientDaoBean clientDao;

    @EJB
    private UtilisateurDaoBean utilisateurDao;




    /**
     * Method to load Langage datas into
     * database
     */
    public void loadLangage() {

    }


    public void loadRole() {

    }

    public void loadStatutCompte() {

    }

    public void loadTypeCompte() {

    }

    public void loadTypeGestionCompte() {

    }


    public void loadTypeOperation() {

    }

    public void loadClient() {

    }


    public void loadUtilisateur() {

    }
}
