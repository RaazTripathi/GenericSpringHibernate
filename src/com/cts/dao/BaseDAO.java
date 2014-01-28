package com.cts.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.trg.dao.jpa.GenericDAOImpl;

/**
 * For the purpose of quickly putting the basic CRUD functionality in place, I've used the generic dao framework 
 * @author sumit
 */
public class BaseDAO<T, ID extends Serializable> extends GenericDAOImpl<T, Serializable>{
	private EntityManager entityManager;
	@Override
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		super.setEntityManager(entityManager);
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

}
