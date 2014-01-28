package com.cts.daoservices;

/**
 * This service exposes the functionality to provide authentication.
 * To satisfy its contract obligations , a number of service implementations can be created
 * @author sumit
 *
 */
public interface AuthService {
	
	/**
	 * Inserts a new authorisation into the database
	 */
	public void insertNewAuthEntry(String password, String authority);
	
	/**
	 * Authenticates a given authentication signature
	 * @param password the password for the authentication
	 * @param prov Passed authentication details(priviledges).
	 * @param token Generates the token that gets updated with appropriate value once the authentication is done.
	 */
	public void authenticate(String password, String priv, String token);

}
