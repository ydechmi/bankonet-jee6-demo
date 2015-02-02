/**
 *
 */
package com.yd.bankonet.domaine.accounts;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 * @author ydechmi
 */
@Entity
@DiscriminatorValue("CEP")
public class SavingsAccount extends Account {

    /**
     *
     */
    private static final long serialVersionUID = 7538268885866989987L;

    @Column(name = "ACC_SAVINGS_AMOUNT_MAX")
    private double savingsAmountMax;

    @Column(name = "ACC_SAVINGS_RATE", length = 126)
    private float savingsRate;

    /**
     *
     */
    public SavingsAccount() {
    }

    /**
     *
     * @return
     */
    public double getSavingsAmountMax() {
        return savingsAmountMax;
    }

    /**
     *
     * @param savingsAmountMax
     */
    public void setSavingsAmountMax(double savingsAmountMax) {
        this.savingsAmountMax = savingsAmountMax;
    }

    /**
     *
     * @return
     */
    public float getSavingsRate() {
        return savingsRate;
    }

    /**
     *
     * @param savingsRate
     */
    public void setSavingsRate(float savingsRate) {
        this.savingsRate = savingsRate;
    }
}
