package com.yd.bankonet.service.datas;

import com.yd.bankonet.dao.reference.*;
import com.yd.bankonet.dao.users.CustomerDaoBean;
import com.yd.bankonet.dao.users.UserDaoBean;
import com.yd.bankonet.test.JavaArchiveDeployment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

@RunWith(Arquillian.class)
public class RepositoryServiceTest extends JavaArchiveDeployment {

    @EJB
    private RepositoryService repositoryService;

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
     *  Test loading data into database
     * @throws Exception
     */
    @Test
    public void testLoadData() throws Exception {
        repositoryService.loadData();
        Assert.assertTrue(languageDao.findAll().size()>0);
        Assert.assertTrue(roleDao.findAll().size()>0);
        Assert.assertTrue(accountStatusDao.findAll().size()>0);
        Assert.assertTrue(accountTypeDao.findAll().size()>0);
        Assert.assertTrue(accountManagementTypeDao.findAll().size()>0);
        Assert.assertTrue(operationTypeDao.findAll().size()>0);
    }
}