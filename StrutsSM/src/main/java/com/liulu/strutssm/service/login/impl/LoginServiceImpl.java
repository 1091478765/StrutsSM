package com.liulu.strutssm.service.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liulu.strutssm.condition.UserCondition;
import com.liulu.strutssm.dao.user.UserMapper;
import com.liulu.strutssm.entity.user.User;
import com.liulu.strutssm.service.login.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public void Login(String username, String password) {
		System.out.println(username);
		System.out.println(password+"-----------");
		UserCondition condition = new UserCondition();
		condition.setPasswordEquals(password);
		condition.setUserEquals(username);
		User user = userMapper.login(condition);
		System.out.println(user.toString()+"---------");
	}

}
