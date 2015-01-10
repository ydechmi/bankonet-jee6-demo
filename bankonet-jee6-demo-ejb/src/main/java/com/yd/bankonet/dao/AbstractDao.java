/**
 * 
 */
package com.yd.bankonet.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author ydechmi
 *
 */
public abstract class AbstractDao<T,ID> {
	
	
	/**
	 * 
	 */
	private EntityManager entityManager;

	/**
	 * 
	 */
	public AbstractDao() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * @param entityManager the entityManager to set
	 */
	@PersistenceContext(unitName="bankonet")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * @param entity
	 */
	public void persist(T entity){
		entityManager.persist(entity);
		entityManager.flush();
	}
	
	/**
	 * @param id
	 */
	public void removeById(ID id){
		
	    T entityToRemove=findById(id);
		entityManager.remove(entityToRemove);
		entityManager.flush();
	}
	
	/**
	 * @param entity
	 */
	public void update(T entity){
		entityManager.refresh(entity);
		entityManager.flush();
	}
	
	/**
	 * @param id
	 * @return
	 */
	public T findById(ID id){
		
		return entityManager.find(getEntityClass(), id);
	}
	
	/**
	 * @return
	 */
	public abstract Class<T> getEntityClass();

}
