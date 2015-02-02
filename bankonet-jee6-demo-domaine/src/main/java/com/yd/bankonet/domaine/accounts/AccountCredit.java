/**
 *
 */
package com.yd.bankonet.domaine.accounts;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ydechmi
 */
@Entity
@DiscriminatorValue("CCR")
public class AccountCredit extends Account {

    /**
     *
     */
    @Transient
    private static final long serialVersionUID = 3965808003607135604L;

    @Column(name = "ACC_LOAN_AMOUNT")
    private double montantEmprunte;

    @Column(name = "ACC_LOAN_RATE", length = 126)
    private float taux;

    @Column(name = "ACC_LOAN_BEGIN_DATE")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @Column(name = "ACC_LOAN_END_DATE")
    @Temporal(TemporalType.DATE)
    private Date dateFin;

    @OneToOne
    @JoinColumn(name = "ACC_CPT_DEB_ID", referencedColumnName = "ACC_ID")
    private Account accountDebite;

    @OneToOne
    @JoinColumn(name = "ACC_CPT_DST_ID", referencedColumnName = "ACC_ID")
    private Account accountDestinataire;

    /**
     *
     */
    public AccountCredit() {

    }

    /**
     * @return the montantEmprunte
     */
    public double getMontantEmprunte() {
        return montantEmprunte;
    }

    /**
     * @param montantEmprunte the montantEmprunte to set
     */
    public void setMontantEmprunte(double montantEmprunte) {
        this.montantEmprunte = montantEmprunte;
    }

    /**
     * @return the taux
     */
    public float getTaux() {
        return taux;
    }

    /**
     * @param taux the taux to set
     */
    public void setTaux(float taux) {
        this.taux = taux;
    }

    /**
     * @return the dateDebut
     */
    public Date getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the dateFin
     */
    public Date getDateFin() {
        return dateFin;
    }

    /**
     * @param dateFin the dateFin to set
     */
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * @return the compteDebite
     */
    public Account getAccountDebite() {
        return accountDebite;
    }

    /**
     * @param accountDebite the compteDebite to set
     */
    public void setAccountDebite(Account accountDebite) {
        this.accountDebite = accountDebite;
    }

    /**
     * @return the compteDestinataire
     */
    public Account getAccountDestinataire() {
        return accountDestinataire;
    }

    /**
     * @param accountDestinataire the compteDestinataire to set
     */
    public void setAccountDestinataire(Account accountDestinataire) {
        this.accountDestinataire = accountDestinataire;
    }


}
