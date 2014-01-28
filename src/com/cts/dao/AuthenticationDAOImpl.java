package com.cts.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cts.data.AuthModel;
import com.cts.data.AuthModelId;


public class AuthenticationDAOImpl extends BaseDAO<AuthModel, Serializable> implements AuthenticationDAO {

	@Override
	public boolean isValidAuth(AuthModel inputmodel) {
		EntityManager manager = getEntityManager();
		inputmodel = manager.find(AuthModel.class, inputmodel);
		if(inputmodel!= null)
			return true;
		return false;
	}

	@Override
	public AuthModel readById(AuthModelId id) {
		EntityManager manager = getEntityManager();
		AuthModel model = new AuthModel();
		model.setId(id);
		if(isValidAuth(model)){
			model = manager.find(AuthModel.class, model);
			return model;
		}
		return null;
	}

	@Override
	public AuthModel insertAuth(AuthModel input) {
		EntityManager manager = getEntityManager();
		manager.persist(input);
		return input;
	}

	@Override
	public AuthModel findByPassWord(String password) {
		EntityManager manager = getEntityManager();
		Query query = manager.createNamedQuery("");
		List<AuthModel> results = query.getResultList();
		if(results==null || results.size()<1)
			return null;
		return results.get(0);
	}
	
	

	

}
