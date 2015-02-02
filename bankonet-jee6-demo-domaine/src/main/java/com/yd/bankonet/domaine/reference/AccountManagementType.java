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
@Table(name = "ACCOUNT_MANAG_TYPE")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "AMT_ID")),
        @AttributeOverride(name = "code", column = @Column(name = "AMT_CODE", unique = true)),
        @AttributeOverride(name = "label", column = @Column(name = "AMT_NAME", unique = true))
})
public class AccountManagementType extends AbstractReference {

    /**
     *
     */
    private static final long serialVersionUID = -1242983320250670701L;


    /**
     *
     */
    public AccountManagementType() {

    }

    /**
     * Constructor
     *
     * @param code  code of object
     * @param label label of object
     */
    public AccountManagementType(String code, String label) {
        super(code, label);
    }
}
