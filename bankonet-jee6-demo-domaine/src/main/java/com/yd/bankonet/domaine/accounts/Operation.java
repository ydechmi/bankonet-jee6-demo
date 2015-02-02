/**
 *
 */
package com.yd.bankonet.domaine.accounts;

import com.yd.bankonet.domaine.AbstractEntity;
import com.yd.bankonet.domaine.reference.OperationType;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ydechmi
 */
@Entity
@Table(name = "OPERATIONS")
@AttributeOverride(name = "id", column = @Column(name = "OPE_ID"))
public class Operation extends AbstractEntity<Long> {


    /**
     *
     */
    private static final long serialVersionUID = 905829556156780998L;

    @Column(name = "OPE_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date operationDate;

    @Column(name = "OPE_AMOUNT", length = 128, nullable = false)
    private double operationAmount;

    @ManyToOne
    @JoinColumn(name = "OPE_OPT_ID", nullable = false)
    private OperationType operationType;

    @ManyToOne
    @JoinColumn(name = "OPE_CD_ID", nullable = false)
    private Account accountDebit;

    @ManyToOne
    @JoinColumn(name = "OPE_CC_ID", nullable = false)
    private Account accountCredit;

    /**
     *
     */
    public Operation() {
    }

    public double getOperationAmount() {
        return operationAmount;
    }

    public void setOperationAmount(double operationAmount) {
        this.operationAmount = operationAmount;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Account getAccountCredit() {
        return accountCredit;
    }

    public void setAccountCredit(Account accountCredit) {
        this.accountCredit = accountCredit;
    }

    public Account getAccountDebit() {
        return accountDebit;
    }

    public void setAccountDebit(Account accountDebit) {
        this.accountDebit = accountDebit;
    }
}
