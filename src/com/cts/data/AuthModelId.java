package com.cts.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AuthModelId implements Serializable{

	private int Id;

	@Column(name="auth_id")
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
}
