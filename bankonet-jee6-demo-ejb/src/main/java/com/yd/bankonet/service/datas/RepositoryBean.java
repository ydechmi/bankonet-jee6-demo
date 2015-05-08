package com.yd.bankonet.service.datas;

import com.yd.bankonet.dao.reference.*;
import com.yd.bankonet.dao.users.CustomerDaoBean;
import com.yd.bankonet.dao.users.UserDaoBean;
import com.yd.bankonet.domaine.reference.*;
import com.yd.bankonet.domaine.users.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by ydechmi on 11/01/2015.
 *
 */
@Stateless
public class RepositoryBean implements RepositoryService{

    @EJB
    private LanguageDaoBean languageDao;

    @EJB
    private RoleDaoBean roleDao;

    @EJB
    private AccountStatusDaoBean accountStatusDao;

    @EJB
    private AccountTypeDaoBean accountTypeDao;

    @EJB
    private AccountManagementTypeDaoBean accountManagementTypeDao;

    @EJB
    private OperationTypeDaoBean operationTypeDao;

    @EJB
    private CustomerDaoBean customerDao;

    @EJB
    private UserDaoBean userDao;




    /**
     * Method to insert Language data into database
     */
    private void insertLanguages() {
        List<Language> languages=new ArrayList<>(2);
        languages.add(new Language(Locale.FRENCH.getLanguage(),Locale.FRENCH.getDisplayLanguage()));
        languages.add(new Language(Locale.ENGLISH.getLanguage(),Locale.ENGLISH.getDisplayLanguage()));

        for(Language language :languages) languageDao.persist(language);

    }


    /**
     * Method to insert user's roles into database
     */
    private void insertRoles() {
        List<Role> roles=new ArrayList<>(3);
        roles.add(new Role("ADMINISTRATEUR","Administrateur"));
        roles.add(new Role("MANAGER","Manager"));
        roles.add(new Role("CLIENT","Client"));

        for(Role role:roles){
            roleDao.persist(role);
        }
    }

    /**
     * Method to insert account's status
     */
    private void insertAccountStatus() {
        List<AccountStatus> statuts=new ArrayList<>(2);
        statuts.add(new AccountStatus("CREATED","Crée"));
        statuts.add(new AccountStatus("DELETED","Supprimé"));

        for(AccountStatus statut:statuts){
            accountStatusDao.persist(statut);
        }

    }

    /**
     * Method to insert account's types
     */
    private void insertAccountTypes() {
        List<AccountType> accountTypes=new ArrayList<>(3);
        accountTypes.add(new AccountType("CCO","Compte Courant"));
        accountTypes.add(new AccountType("CCR","Compte Crédit"));
        accountTypes.add(new AccountType("CEP","Compte Epargne"));

        for(AccountType accountType :accountTypes){
            accountTypeDao.persist(accountType);
        }
    }

    /**
     * Method to load account's type management
     */
    private void insertAccountManagementType() {
        List<AccountManagementType> types=new ArrayList<>(4);
        types.add(new AccountManagementType("CHQ","Compe chèque"));
        types.add(new AccountManagementType("FOR1","Forfait entrée de gamme"));
        types.add(new AccountManagementType("FOR2","Forfait premium"));
        types.add(new AccountManagementType("OPE"," A l'opération"));

        for(AccountManagementType type:types){
            accountManagementTypeDao.persist(type);
        }

    }

    /**
     * Method to load operation's types into database
     */
    private void insertOperationTypes() {
        List<OperationType> operationTypes=new ArrayList<>(3);
        operationTypes.add(new OperationType("RET", "Retrait"));
        operationTypes.add(new OperationType("CRE", "Crédit"));
        operationTypes.add(new OperationType("TRA", "Transfert"));

        for(OperationType operationType :operationTypes){
            operationTypeDao.persist(operationType);
        }
    }

    /**
     * Method to load users
     */
    private void insertUsers() {
        Role role=null;
        User userCli=new User();
        userCli.setAlertUpdate(true);
        userCli.setFirstName("Jerome");
        userCli.setLastName("Dupont");
        userCli.setLogin("jdupont");
        userCli.setPassword("123456");
        userCli.setEmail("jdupont@sample.com");
        role=roleDao.findByCode("CLIENT");
        userCli.getRoles().add(role);
        userDao.persist(userCli);

        //Admin
        User userAdmin=new User();
        userAdmin.setAlertUpdate(true);
        userAdmin.setFirstName("admin");
        userAdmin.setLastName("admin");
        userAdmin.setLogin("admin");
        userAdmin.setPassword("admin");
        userAdmin.setEmail("admin@sample.com");
        role=roleDao.findByCode("ADMINISTRATEUR");
        userAdmin.getRoles().add(role);
        userDao.persist(userAdmin);

        //Manager
        User userMana=new User();
        userMana.setAlertUpdate(true);
        userMana.setFirstName("manager");
        userMana.setLastName("manager");
        userMana.setLogin("manager");
        userMana.setPassword("manager");
        userMana.setEmail("manager@sample.com");
        role=roleDao.findByCode("MANAGER");
        userMana.getRoles().add(role);
        userDao.persist(userMana);

    }

    @Override
    public void loadData() {
        insertAccountManagementType();
        insertAccountStatus();
        insertAccountTypes();
        insertOperationTypes();
        insertLanguages();
        insertRoles();
        insertUsers();
    }
}
