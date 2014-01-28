package com.cts.daoservices;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.dao.AuthenticationDAO;
import com.cts.data.AuthModel;

/**
 * Provides the Database driven approach for satisfying the contractual details.
 * @author sumit
 *
 */
public class DataBaseAuthServiceImpl implements AuthService {

	AuthenticationDAO dao;
	
	public AuthenticationDAO getDao() {
		return dao;
	}

	@Autowired
	public void setDao(AuthenticationDAO dao) {
		this.dao = dao;
	}

	@Override
	public void insertNewAuthEntry(String password, String authority) {
		AuthModel newModel = new AuthModel();
		newModel.setAuthority(authority);
		newModel.setPassword(password);
		dao.save(newModel);
	}

	@Override
	public void authenticate(String password, String priv, String authenticationToken) {
		AuthModel existingModel = dao.findByPassWord(password);
		if(existingModel==null)
			throw new RuntimeException("Unable to proceed as the authentication already exists.");

		if(!existingModel.getAuthority().equals(priv))
			throw new RuntimeException("The record does not meet the desired authority.");
		
		authenticationToken = existingModel.getId()+priv;
	}

}
