package com.yd.bankonet.dao.reference;

import com.yd.bankonet.dao.AbstractDao;
import com.yd.bankonet.domaine.reference.Langage;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class LangageDaoBean
 */
@Stateless
@LocalBean
public class LangageDaoBean extends AbstractDao<Langage,Integer> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public LangageDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<Langage> getEntityClass() {
		// TODO Auto-generated method stub
		return Langage.class;
	}
    
    

}
