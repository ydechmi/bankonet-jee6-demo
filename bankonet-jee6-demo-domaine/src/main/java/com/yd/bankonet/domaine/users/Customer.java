/**
 *
 */
package com.yd.bankonet.domaine.users;

import com.yd.bankonet.domaine.AbstractEntity;
import com.yd.bankonet.domaine.accounts.Account;
import com.yd.bankonet.domaine.accounts.AccountEdition;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ydechmi
 */
@Entity
@Table(name = "CUSTOMERS")
@AttributeOverride(name = "id", column = @Column(name = "CUS_ID", nullable = false))
public class Customer extends AbstractEntity<Long> {

    /**
     *
     */
    private static final long serialVersionUID = -6040893909478020478L;

    @Column(name = "CUS_ADDRESS", length = 250)
    private String address;

    @Column(name = "CUS_POSTAL_CODE", length = 50)
    private String zipCode;

    @Column(name = "CUS_COUNTRY", length = 50)
    private String country;

    @Column(name = "CUS_PHONE", length = 50)
    private String phone;

    @Column(name = "CUS_TOWN", length = 50)
    private String city;

    @OneToMany(mappedBy = "customer")
    private List<Account> accounts = new ArrayList<>();

    @OneToMany(mappedBy = "customer")
    private List<AccountEdition> accountsEdition = new ArrayList<>();

    @OneToOne(mappedBy = "customer")
    private User user;

    /**
     *
     */
    public Customer() {

    }

    /**
     *
     * @return list of account
     */
    public List<Account> getAccounts() {
        return accounts;
    }

    /**
     * Set list of account
     * @param accounts list of account
     */
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    /**
     *
     * @return  list of account edition
     */
    public List<AccountEdition> getAccountsEdition() {
        return accountsEdition;
    }

    /**
     *
     * @param accountsEdition list of account edition to set
     */
    public void setAccountsEdition(List<AccountEdition> accountsEdition) {
        this.accountsEdition = accountsEdition;
    }

    /**
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }


}
