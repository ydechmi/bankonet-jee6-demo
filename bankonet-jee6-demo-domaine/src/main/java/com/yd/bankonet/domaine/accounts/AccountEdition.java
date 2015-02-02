/**
 *
 */
package com.yd.bankonet.domaine.accounts;


import com.yd.bankonet.domaine.AbstractEntity;
import com.yd.bankonet.domaine.users.Customer;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ydechmi
 */
@Entity
@AttributeOverride(name = "id", column = @Column(name = "CUS_ACC_ID", nullable = false))
@Table(name = "CUSTOMER_ACCOUNT_ASS")
public class AccountEdition extends AbstractEntity<Long> {

    /**
     *
     */
    private static final long serialVersionUID = -7634708444990961846L;

    @Column(name = "CAA_PRINT_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date editionDate;

    @ManyToOne
    @JoinColumn(name = "CAA_ACC_ID", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "CAA_CUS_ID", nullable = false)
    private Customer customer;

    /**
     *
     */
    public AccountEdition() {
        super();
    }

    /**
     *
     * @return the edition date
     */
    public Date getEditionDate() {
        return editionDate;
    }

    /**
     *
     * @param editionDate the edition date to set
     */
    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    /**
     *
     * @return the account
     */
    public Account getAccount() {
        return account;
    }

    /**
     *
     * @param account the account to set
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     *
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
