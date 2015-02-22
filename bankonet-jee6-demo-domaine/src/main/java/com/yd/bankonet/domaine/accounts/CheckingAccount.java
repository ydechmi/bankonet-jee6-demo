/**
 *
 */
package com.yd.bankonet.domaine.accounts;

import javax.persistence.*;

/**
 * @author ydechmi
 */
@Entity
@NamedQueries({
        @NamedQuery(name="CheckingAccount.findByCode",
                query="SELECT a FROM CheckingAccount a where a.codeBank=:codeBank")
})
@DiscriminatorValue("CCO")
public class CheckingAccount extends Account {

    /**
     *
     */
    @Transient
    private static final long serialVersionUID = -764206683104674951L;

    @Column(name = "ACC_AMOUNT_MAX")
    private double authorizedOverdraft ;

    /**
     *
     */
    public CheckingAccount() {
    }

    /**
     *
     * @return
     */
    public double getAuthorizedOverdraft() {
        return authorizedOverdraft;
    }

    /**
     *
     * @param authorizedOverdraft
     */
    public void setAuthorizedOverdraft(double authorizedOverdraft) {
        this.authorizedOverdraft = authorizedOverdraft;
    }
}
