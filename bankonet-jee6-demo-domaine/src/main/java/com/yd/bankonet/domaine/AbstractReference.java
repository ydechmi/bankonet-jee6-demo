/**
 *
 */
package com.yd.bankonet.domaine;

import javax.persistence.MappedSuperclass;

/**
 * @author ydechmi
 */
@MappedSuperclass
public class AbstractReference extends AbstractEntity<Integer> {

    /**
     *
     */
    private static final long serialVersionUID = -7144228493615849921L;

    private String code;

    private String label;

    /**
     *
     */
    public AbstractReference() {

    }

    /**
     * Constructor
     *
     * @param code  code of object
     * @param label label of object
     */
    public AbstractReference(String code, String label) {
        this.code = code;
        this.label = label;
    }

    /**
     * @return the code
     */
    public String getCode() {

        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {

        this.code = code;
    }

    /**
     * @return the label
     */
    public String getLabel() {

        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {

        this.label = label;
    }


}
