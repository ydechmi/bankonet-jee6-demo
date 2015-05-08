package com.yd.bankonet.service.security;

import javax.ejb.Remote;
import java.util.List;

/**
 * Service to check authentication  and
 * authorization
 * Created by ydechmi on 04/05/2015.
 */
@Remote
public interface SecurityService {

    /**
     * Check user authentication
     * @param login user identifier
     * @param password user password
     * @return true if checking is OK else false
     */
    boolean checkUserLogin(String login,String password);

    /**
     * Get user roles
     * @param login identifier of user
     * @return list of roles
     */
    List<String> getUserRoles(String login);
}
