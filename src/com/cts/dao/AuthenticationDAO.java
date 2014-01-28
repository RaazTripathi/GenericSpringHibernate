package com.cts.dao;

import java.io.Serializable;

import com.cts.data.AuthModel;
import com.cts.data.AuthModelId;
import com.trg.dao.jpa.GenericDAO;

public interface AuthenticationDAO extends GenericDAO<AuthModel, Serializable> {

	public boolean isValidAuth(AuthModel inputmodel);

	public AuthModel readById(AuthModelId id);
	
	public AuthModel insertAuth(AuthModel input);

	public AuthModel findByPassWord(String password);
	
}
