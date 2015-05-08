package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.Role;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by ydechmi on 11/01/2015.
 *
 */
@Stateless
public class RoleDaoBean extends AbstractDao<Role,Integer>{

    public RoleDaoBean() {
    }

    /**
     * @return the role class
     */
    public Class<Role> getEntityClass() {
        return Role.class;
    }

    /**
     * Get role by code
     * @param code identifier of role
     * @return Role
     */
    public Role findByCode(String code){
        List<Role> roles=getEntityManager().createNamedQuery("Role.findByCode")
                .setParameter("code",code).getResultList();
        if(!roles.isEmpty()){
            return roles.get(0);
        }else{
            return null;
        }

    }
}
