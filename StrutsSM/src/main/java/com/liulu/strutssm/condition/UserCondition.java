package com.liulu.strutssm.condition;

import java.io.Serializable;

public class UserCondition implements Serializable{
	private static final long serialVersionUID = -6784524164587294227L;
	
	private String userEquals;
	private String passwordEquals;
	public String getUserEquals() {
		return userEquals;
	}
	public void setUserEquals(String userEquals) {
		this.userEquals = userEquals;
	}
	public String getPasswordEquals() {
		return passwordEquals;
	}
	public void setPasswordEquals(String passwordEquals) {
		this.passwordEquals = passwordEquals;
	}
	@Override
	public String toString() {
		return "UserCondition [userEquals=" + userEquals + ", passwordEquals=" + passwordEquals + "]";
	}

}
