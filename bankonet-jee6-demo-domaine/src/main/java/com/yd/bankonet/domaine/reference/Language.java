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
@Table(name = "LANGUAGES")
@NamedQueries({
        @NamedQuery(name="Language.findByCode",
                query="SELECT a FROM Language a where a.code=:code")
})
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "LGE_ID")),
        @AttributeOverride(name = "code", column = @Column(name = "LGE_CODE", unique = true)),
        @AttributeOverride(name = "label", column = @Column(name = "LGE_NAME", unique = true))
})
public class Language extends AbstractReference {

    /**
     *
     */
    private static final long serialVersionUID = 3215580822027595301L;


    /**
     * Default Constructor
     */
    public Language() {

    }

    /**
     * Constructor
     *
     * @param code  code of object
     * @param label label of object
     */
    public Language(String code, String label) {
        super(code, label);
    }
}
