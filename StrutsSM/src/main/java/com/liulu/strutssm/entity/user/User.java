package com.liulu.strutssm.entity.user;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 刘璐
 */
public class User implements Serializable{
	private static final long serialVersionUID = -3374270926064118008L;
	
	private String username;
	private String password;
	private int age;
	private String gender;
	private Date birthday;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + ", gender=" + gender
				+ ", birthday=" + birthday + "]";
	}
}
