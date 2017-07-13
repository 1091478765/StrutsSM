package com.liulu.strutssm.dao.user;

import com.liulu.strutssm.condition.UserCondition;
import com.liulu.strutssm.entity.user.User;

public interface UserMapper {
	
	public User login(UserCondition userCondition);

}
