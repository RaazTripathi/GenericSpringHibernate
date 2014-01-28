package com.cts.data;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="AUTH")
/**
 * Provides the model for the authentication
 */
public class AuthModel {
	private AuthModelId id;
	private String password;
	private String authority;
	private boolean valid;
	@EmbeddedId
	public AuthModelId getId() {
		return id;
	}
	public void setId(AuthModelId id) {
		this.id = id;
	}
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="authority")
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Column(name="valid")
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}

}
