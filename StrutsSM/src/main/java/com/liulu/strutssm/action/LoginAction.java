package com.liulu.strutssm.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.liulu.strutssm.service.login.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

@Scope("prototype")//支持多例  
@ParentPackage("struts-default")  //表示继承的父包  
@Namespace(value="/") //表示当前Action所在命名空间  
public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = 2789984708757167977L;

	@Autowired
	private LoginService loginService;
	
	private String username;
	private String password;
	
	    @Action(value="login",results={
			@Result(name = "index",location="/index.jsp")})
		public String login(){
			System.out.println(username);
			System.out.println(password);
			loginService.Login(username, password);
			return "index";
		}

	
	//--------------------------------------------------------------------------//
	
	//--------------第二次修改--------------------------------------------------//
	
	//________这是第三次修改----------------//
	
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
	

}
