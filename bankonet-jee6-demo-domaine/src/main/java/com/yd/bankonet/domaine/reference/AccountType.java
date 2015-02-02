/**
 *
 */
package com.yd.bankonet.domaine.reference;


import com.yd.bankonet.domaine.AbstractReference;

import javax.persistence.*;

/**
 * @author ydechmi
 */
@Entity
@Table(name = "ACCOUNT_TYPE")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "ACT_ID")),
        @AttributeOverride(name = "code", column = @Column(name = "ACT_CODE", unique = true)),
        @AttributeOverride(name = "label", column = @Column(name = "ACT_NAME", unique = true))
})
public class AccountType extends AbstractReference {

    /**
     *
     */
    private static final long serialVersionUID = 4458994857653906338L;

    /**
     *
     */
    public AccountType() {

    }

    /**
     * Constructor
     *
     * @param code  code of object
     * @param label label of object
     */
    public AccountType(String code, String label) {

        super(code, label);
    }
}
