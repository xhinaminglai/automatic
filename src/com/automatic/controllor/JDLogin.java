/**
 * 
 */
package com.automatic.controllor;

import com.automatic.views.JDLoginPage;

/**
 * @author Administrator
 * 
 */
public  class JDLogin {

	/*
	 * 用户登录
	 */
	public static void doLogin(String usrName, String pwd) {
		JDLoginPage.usrName().sendKeys(usrName);
		JDLoginPage.loginPwd().sendKeys(pwd);
		JDLoginPage.submitButton().click();
	}
}
