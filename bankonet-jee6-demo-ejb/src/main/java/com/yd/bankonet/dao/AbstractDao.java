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
	 * @param entity the entity to persist
	 */
	public void persist(T entity){
		entityManager.persist(entity);
		entityManager.flush();
	}
	
	/**
	 * @param id the id of entity to remove
	 */
	public void removeById(ID id){
		
	    T entityToRemove=findById(id);
		entityManager.remove(entityToRemove);
		entityManager.flush();
	}
	
	/**
	 * @param entity the entity to update
	 */
	public void update(T entity){
		entityManager.refresh(entity);
		entityManager.flush();
	}
	
	/**
	 * @param id the id of entity to search
	 * @return entity
	 */
	public T findById(ID id){
		
		return entityManager.find(getEntityClass(), id);
	}
	
	/**
	 * @return entity class
	 */
	public abstract Class<T> getEntityClass();

}
