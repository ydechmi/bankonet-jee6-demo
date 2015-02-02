/**
 *
 */
package com.yd.bankonet.domaine.reference;

import com.yd.bankonet.domaine.AbstractReference;
import com.yd.bankonet.domaine.users.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ydechmi
 */
@Entity
@Table(name = "ROLES")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "ROL_ID")),
        @AttributeOverride(name = "code", column = @Column(name = "ROL_CODE", unique = true)),
        @AttributeOverride(name = "label", column = @Column(name = "ROL_NAME", unique = true))
})
public class Role extends AbstractReference {

    /**
     *
     */
    private static final long serialVersionUID = -3523103983730385993L;


    @ManyToMany(mappedBy = "roles")
    private List<User> users = new ArrayList<>();

    /**
     *
     */
    public Role() {

    }

    /**
     * Constructor
     *
     * @param code  code of object
     * @param label label of object
     */
    public Role(String code, String label) {
        super(code, label);
    }

    /**
     * @return the users
     */
    public List<User> getUsers() {

        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(List<User> users) {

        this.users = users;
    }


}
