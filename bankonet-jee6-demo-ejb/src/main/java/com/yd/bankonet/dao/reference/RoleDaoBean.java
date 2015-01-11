package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.Role;

import javax.ejb.Stateless;

/**
 * Created by ydechmi on 11/01/2015.
 */
@Stateless
public class RoleDaoBean extends AbstractDao<Role,Integer>{

    public RoleDaoBean() {
    }

    /**
     * @return
     */
    public Class<Role> getEntityClass() {
        return Role.class;
    }
}
