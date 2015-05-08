/**
 *
 */
package com.yd.bankonet.domaine.users;

import com.yd.bankonet.domaine.AbstractEntity;
import com.yd.bankonet.domaine.reference.Language;
import com.yd.bankonet.domaine.reference.Role;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author ydechmi
 */
@Entity
@Table(name = "USERS")
@NamedQueries({
        @NamedQuery(name="findByLogin", query="SELECT user FROM User user where user.login=:login")
})
@AttributeOverride(name = "id", column = @Column(name = "USE_ID", nullable = false))
public class User extends AbstractEntity<Long> {

    /**
     *
     */
    private static final long serialVersionUID = -5337552856714674802L;

    @Column(name = "USE_FIRST_NAME", length = 100, nullable = false)
    private String firstName;

    @Column(name = "USE_LAST_NAME", length = 100, nullable = false)
    private String lastName;

    @Column(name = "USE_ALERT_MODIF")
    private boolean alertUpdate;

    @Column(name = "USE_EMAIL", length = 250, unique = true)
    private String email;

    @Column(name = "USE_LAST_CONNEXION")
    @Temporal(TemporalType.DATE)
    private Date lastConnexion;

    @Column(name = "USE_LOGIN", length = 50, nullable = false, unique = true)
    private String login;

    @Column(name = "USE_PASSWORD", length = 50, nullable = false, unique = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "USE_CUS_ID", referencedColumnName = "CUS_ID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "USE_LGE_ID")
    private Language language;


    @ManyToMany
    @JoinTable(name = "USER_ROLE_ASS",
            joinColumns = @JoinColumn(name = "URA_USE_ID", referencedColumnName = "USE_ID"),
            inverseJoinColumns = @JoinColumn(name = "URA_ROL_ID", referencedColumnName = "ROL_ID")
    )
    private List<Role> roles = new ArrayList<>();


    /**
     *
     */
    public User() {
        super();

    }

    /**
     *
     * @return
     */
    public boolean isAlertUpdate() {
        return alertUpdate;
    }

    /**
     *
     * @param alertUpdate
     */
    public void setAlertUpdate(boolean alertUpdate) {
        this.alertUpdate = alertUpdate;
    }

    /**
     *
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public Language getLanguage() {
        return language;
    }

    /**
     *
     * @param language
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     *
     * @return
     */
    public Date getLastConnexion() {
        return lastConnexion;
    }

    /**
     *
     * @param lastConnexion
     */
    public void setLastConnexion(Date lastConnexion) {
        this.lastConnexion = lastConnexion;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the roles
     */
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
