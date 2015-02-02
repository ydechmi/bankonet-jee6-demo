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
@Table(name = "ACCOUNT_STATE")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "AST_ID")),
        @AttributeOverride(name = "code", column = @Column(name = "AST_CODE", unique = true)),
        @AttributeOverride(name = "label", column = @Column(name = "AST_NAME", unique = true))
})

public class AccountStatus extends AbstractReference {

    /**
     *
     */
    private static final long serialVersionUID = 1080290048967059455L;

    /**
     *
     */
    public AccountStatus() {

    }

    /**
     * Constructor
     *
     * @param code  code of object
     * @param label label of object
     */
    public AccountStatus(String code, String label) {
        super(code, label);
    }
}
