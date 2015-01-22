/**
 * 
 */
package com.yd.bankonet.domaine.reference;

import com.yd.bankonet.domaine.AbstractReference;

import javax.persistence.*;

/**
 * @author ydechmi
 *
 */
@Entity
@Table(name="LANGUAGES")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="LGE_ID")),
	@AttributeOverride(name="code", column=@Column(name="LGE_CODE",unique=true)),
	@AttributeOverride(name="libelle", column=@Column(name="LGE_NAME",unique=true))
})
public class Langage extends AbstractReference {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3215580822027595301L;
	

	/**
	 * Constructeur par défaut
	 */
	public Langage() {
		
	}

    /**
     * Constructeur avec paramètres
     *
     * @param code    code du langage
     * @param libelle libelle du langage
     */
    public Langage(String code, String libelle) {
        super(code, libelle);
    }
}
