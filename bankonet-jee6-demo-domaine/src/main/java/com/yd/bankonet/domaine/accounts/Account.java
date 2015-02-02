package com.yd.bankonet.domaine.accounts;


import com.yd.bankonet.domaine.AbstractEntity;
import com.yd.bankonet.domaine.reference.AccountManagementType;
import com.yd.bankonet.domaine.reference.AccountStatus;
import com.yd.bankonet.domaine.users.Customer;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ydechmi
 */
@Entity
@Table(name = "ACCOUNTS")
@AttributeOverride(name = "id", column = @Column(name = "ACC_ID", nullable = false))
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ACC_TYPE", discriminatorType = DiscriminatorType.STRING, length = 5)
public abstract class Account extends AbstractEntity<Long> {

    /**
     *
     */
    @Transient
    private static final long serialVersionUID = -3528045097937757822L;

    @Column(name = "ACC_CODE_BANK", nullable = false, length = 5)
    private String codeBank;

    @Column(name = "ACC_CODE_CASH_DESK", nullable = false, length = 5)
    private String codeCashDesk;

    @Column(name = "ACC_NUMBER", nullable = false)
    private long number;

    @Column(name = "ACC_KEY", nullable = false)
    private String key;

    @Column(name = "ACC_NAME", nullable = false, unique = true)
    @NotNull
    private String label;

    @ManyToOne
    @JoinColumn(name = "ACC_AST_ID", nullable = false)
    private AccountStatus status;

    @ManyToOne
    @JoinColumn(name = "ACC_AMT_ID", nullable = false)
    private AccountManagementType managementType;

    @ManyToOne
    @JoinColumn(name = "ACC_CUS_ID", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "accountDebit")
    private List<Operation> operationsDebit = new ArrayList<>();

    @OneToMany(mappedBy = "accountCredit")
    private List<Operation> operationsCredit = new ArrayList<>();

    /**
     * Default Constructor
     */
    public Account() {
    }


    /**
     * @return the operationsDebit
     */
    public List<Operation> getOperationsDebit() {
        return operationsDebit;
    }


    /**
     * @param operationsDebit the operationsDebit to set
     */
    public void setOperationsDebit(List<Operation> operationsDebit) {
        this.operationsDebit = operationsDebit;
    }


    /**
     * @return the operationsCredit
     */
    public List<Operation> getOperationsCredit() {
        return operationsCredit;
    }


    /**
     * @param operationsCredit the operationsCredit to set
     */
    public void setOperationsCredit(List<Operation> operationsCredit) {
        this.operationsCredit = operationsCredit;
    }


    public String getCodeBank() {
        return codeBank;
    }

    public void setCodeBank(String codeBank) {
        this.codeBank = codeBank;
    }

    public String getCodeCashDesk() {
        return codeCashDesk;
    }

    public void setCodeCashDesk(String codeCashDesk) {
        this.codeCashDesk = codeCashDesk;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public AccountManagementType getManagementType() {
        return managementType;
    }

    public void setManagementType(AccountManagementType managementType) {
        this.managementType = managementType;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
