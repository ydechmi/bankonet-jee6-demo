package com.yd.bankonet.service.security;

import com.yd.bankonet.dao.reference.RoleDaoBean;
import com.yd.bankonet.dao.users.UserDaoBean;
import com.yd.bankonet.domaine.reference.Role;
import com.yd.bankonet.domaine.users.User;
import com.yd.bankonet.test.JavaArchiveDeployment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.List;

/**
 * Testing class for SecurityService
 * Created by ydechmi on 04/05/2015.
 */
@RunWith(Arquillian.class)
public class SecurityServiceTest extends JavaArchiveDeployment {

    @EJB
    UserDaoBean userDaoBean;

    @EJB
    RoleDaoBean roleDaoBean;

    @EJB
    SecurityService securityService;

    @Test
    public void testCheckUserLogin() throws Exception {
        User user=new User();
        user.setAlertUpdate(true);
        user.setFirstName("Jerome");
        user.setLastName("Dupont");
        user.setLogin("jdupont");
        user.setPassword("123456");
        user.setEmail("jdupont@sample.com");
        userDaoBean.persist(user);
        boolean authentication=securityService.checkUserLogin("jdupont","123456");
        Assert.assertTrue(authentication);
        userDaoBean.removeById(user.getId());
    }

    @Test
         public void testCheckUserLoginWithLoginNotExist() throws Exception {
        User user=new User();
        user.setAlertUpdate(true);
        user.setFirstName("Jerome");
        user.setLastName("Dupont");
        user.setLogin("jtoto");
        user.setPassword("123456");
        user.setEmail("jdupont@sample.com");
        userDaoBean.persist(user);
        boolean authentication=securityService.checkUserLogin("jdupont","123456");
        Assert.assertFalse(authentication);
        userDaoBean.removeById(user.getId());
    }

    @Test
    public void testCheckUserLoginWithBadPassword() throws Exception {
        User user=new User();
        user.setAlertUpdate(true);
        user.setFirstName("Jerome");
        user.setLastName("Dupont");
        user.setLogin("jdupont");
        user.setPassword("12345678");
        user.setEmail("jdupont@sample.com");
        userDaoBean.persist(user);
        boolean authentication=securityService.checkUserLogin("jdupont","123456");
        Assert.assertFalse(authentication);
        userDaoBean.removeById(user.getId());
    }
    @Test
    public void testGetUserRoles() throws Exception {
        Role role=new Role("CLIENT","Client");
        roleDaoBean.persist(role);
        User user=new User();
        user.setAlertUpdate(true);
        user.setFirstName("Jerome");
        user.setLastName("Dupont");
        user.setLogin("jdupont");
        user.setPassword("123456");
        user.setEmail("jdupont@sample.com");
        user.getRoles().add(role);
        userDaoBean.persist(user);
        List<String> roles=securityService.getUserRoles("jdupont");
        Assert.assertTrue(roles.size()==1);
        Assert.assertEquals("CLIENT", roles.get(0));
        userDaoBean.removeById(user.getId());
        roleDaoBean.removeById(role.getId());
    }
}