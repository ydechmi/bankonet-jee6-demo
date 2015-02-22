package com.yd.bankonet.dao.users;

import com.yd.bankonet.dao.reference.LanguageDaoBean;
import com.yd.bankonet.dao.reference.RoleDaoBean;
import com.yd.bankonet.domaine.reference.Language;
import com.yd.bankonet.domaine.reference.Role;
import com.yd.bankonet.domaine.users.Customer;
import com.yd.bankonet.domaine.users.User;
import com.yd.bankonet.test.JavaArchiveDeployment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.ArrayList;
import java.util.List;

@RunWith(Arquillian.class)
public class UserDaoBeanTest extends JavaArchiveDeployment {

    @EJB
    UserDaoBean userDaoBean;

    @EJB
    LanguageDaoBean languageDaoBean;

    @EJB
    RoleDaoBean roleDaoBean;

    @EJB
    CustomerDaoBean customerDaoBean;

    private User user;

    @Before
    public void setUp() throws Exception {
        user=new User();
        user.setAlertUpdate(true);
        user.setFirstName("Jerome");
        user.setLastName("Dupont");
        user.setLogin("jdupont");
        user.setPassword("123456");
        user.setEmail("jdupont@sample.com");

    }

    @Test
    public void testPersist() throws Exception {

        userDaoBean.persist(user);
        Assert.assertNotNull(user.getId());
        userDaoBean.removeById(user.getId());
    }

    @Test
    public void testPersistWithLangage() throws Exception {
        Language language=new Language("FR","French");
        languageDaoBean.persist(language);
        Language userLanguage=new Language();
        userLanguage.setId(language.getId());
        user.setLanguage(userLanguage);
        userDaoBean.persist(user);
        User result=userDaoBean.findById(user.getId());
        Assert.assertEquals("FR", result.getLanguage().getCode());
        userDaoBean.removeById(user.getId());
    }

    @Test
    public void testPersistWithCustomer() throws Exception {
        Customer customer=new Customer();
        customer.setAddress("1 Paris Street");
        customer.setCity("Paris");
        customer.setCountry("France");
        customer.setZipCode("75000");
        customer.setPhone("0101010101");
        customerDaoBean.persist(customer);
        user.setCustomer(customer);
        userDaoBean.persist(user);
        User result=userDaoBean.findById(user.getId());
        Assert.assertEquals("1 Paris Street", result.getCustomer().getAddress());
        Assert.assertEquals("Paris", result.getCustomer().getCity());
        Assert.assertEquals("75000", result.getCustomer().getZipCode());
        Assert.assertEquals("France", result.getCustomer().getCountry());
        Assert.assertEquals("0101010101", result.getCustomer().getPhone());
        userDaoBean.removeById(user.getId());
    }

    @Test
    public void testPersistWithRole() throws Exception {
        Role role=new Role("Client","client");
        roleDaoBean.persist(role);
        List<Role> roles=new ArrayList<>();
        roles.add(role);
        user.setRoles(roles);
        userDaoBean.persist(user);
        User result=userDaoBean.findById(user.getId());
        Assert.assertEquals("Client", result.getRoles().get(0).getCode());
        userDaoBean.removeById(user.getId());
    }

    @Test
    public void testRemoveById() throws Exception {

        userDaoBean.persist(user);
        Assert.assertNotNull(user.getId());
        userDaoBean.removeById(user.getId());
        Assert.assertNull(userDaoBean.findById(user.getId()));
    }

    @Test
    public void testUpdate() throws Exception {
        userDaoBean.persist(user);
        user.setFirstName("toto");
        userDaoBean.update(user);
        User result=userDaoBean.findById(user.getId());
        Assert.assertEquals("toto",result.getFirstName());
        userDaoBean.removeById(user.getId());

    }

    @Test
    public void testFindById() throws Exception {
        userDaoBean.persist(user);
        Assert.assertNotNull(userDaoBean.findById(user.getId()));
        userDaoBean.removeById(user.getId());
    }

    @Test
    public void testFindAll() throws Exception {
        userDaoBean.persist(user);
        Assert.assertTrue(userDaoBean.findAll().size()==1);
        userDaoBean.removeById(user.getId());
    }
}