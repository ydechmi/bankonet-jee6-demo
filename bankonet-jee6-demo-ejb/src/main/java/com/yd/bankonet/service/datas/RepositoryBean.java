package com.yd.bankonet.service.datas;

import com.yd.bankonet.dao.reference.*;
import com.yd.bankonet.dao.utilisateur.ClientDaoBean;
import com.yd.bankonet.dao.utilisateur.UtilisateurDaoBean;
import com.yd.bankonet.domaine.reference.Langage;
import com.yd.bankonet.domaine.reference.Role;
import com.yd.bankonet.domaine.reference.StatutCompte;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    public void loadLanguage() {
        List<Langage> languages=new ArrayList<Langage>(2);
        languages.add(new Langage(Locale.FRENCH.getLanguage(),Locale.FRENCH.getDisplayLanguage()));
        languages.add(new Langage(Locale.ENGLISH.getLanguage(),Locale.ENGLISH.getDisplayLanguage()));

        for(Langage langage:languages) langageDao.persist(langage);

    }


    /**
     * Load user's roles
     */
    public void loadRole() {
        List<Role> roles=new ArrayList<Role>(3);
        roles.add(new Role("ADMINSTRATEUR","Administrateur"));
        roles.add(new Role("MANAGER","Manager"));
        roles.add(new Role("CLIENT","Client"));

        for(Role role:roles){
            roleDao.persist(role);
        }
    }

    /**
     * Load compte's statuts
     */
    public void loadStatutCompte() {
        List<StatutCompte> statuts=new ArrayList<StatutCompte>(2);
        statuts.add(new StatutCompte("CREATED","Crée"));
        statuts.add(new StatutCompte("DELETED","Supprimé"));

        for(StatutCompte statut:statuts){
            statutCompteDao.persist(statut);
        }

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
