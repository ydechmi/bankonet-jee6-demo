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
@Table(name = "OPERATION_TYPE")
@NamedQueries({
        @NamedQuery(name="OperationType.findByCode",
                query="SELECT a FROM OperationType a where a.code=:code")
})
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "OPT_ID")),
        @AttributeOverride(name = "code", column = @Column(name = "OPT_CODE", unique = true)),
        @AttributeOverride(name = "label", column = @Column(name = "OPT_NAME", unique = true))
})
public class OperationType extends AbstractReference {

    /**
     *
     */
    private static final long serialVersionUID = 1289075133417808628L;

    /**
     *
     */
    public OperationType() {
        super();
    }

    /**
     * Constructor
     *
     * @param code  code of object
     * @param label label of object
     */
    public OperationType(String code, String label) {
        super(code, label);
    }
}
