package com.yd.bankonet.service.security;

import com.yd.bankonet.dao.users.UserDaoBean;
import com.yd.bankonet.domaine.reference.Role;
import com.yd.bankonet.domaine.users.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Bean implementation of SecurityService
 * Created by ydechmi on 04/05/2015.
 */
@Stateless
public class SecurityBean implements SecurityService{


    @EJB
    UserDaoBean userDaoBean;

    /**
     * Default Constructor
     */
    public SecurityBean() {
    }

    /**
     * Check user authentication
     *
     * @param login    user identifier
     * @param password user password
     * @return true if checking is OK else false
     */
    @Override
    public boolean checkUserLogin(String login, String password) {
        User user = userDaoBean.findByLogin(login);
        return null != user && password.equals(user.getPassword());

    }

    /**
     * Get user roles
     *
     * @param login user identifier
     * @return list of roles
     */
    @Override
    public List<String> getUserRoles(String login) {
        User user=userDaoBean.findByLogin(login);
        List<String> roles=new ArrayList<>();
        if(null!=user){
            for(Role role:user.getRoles()){
                roles.add(role.getCode());
            }
        }
        return roles;
    }
}
