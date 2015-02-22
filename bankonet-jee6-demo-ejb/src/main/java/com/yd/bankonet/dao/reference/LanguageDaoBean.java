package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.Language;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class LanguageDaoBean
 */
@Stateless
public class LanguageDaoBean extends AbstractDao<Language,Integer> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public LanguageDaoBean() {
        super();
    }

	/* (non-Javadoc)
	 * @see com.yd.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<Language> getEntityClass() {
		return Language.class;
	}

}
