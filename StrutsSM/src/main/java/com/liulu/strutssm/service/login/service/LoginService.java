package com.liulu.strutssm.service.login.service;

import org.springframework.stereotype.Repository;

/**
 * 
 * @author 刘璐
 *
 */
@Repository
public interface LoginService {
	
	public void Login(String username,String password);

}
