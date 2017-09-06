/**
 * 
 */
package com.automatic.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automatic.cases.JdAutomatic;

/**
 * @author Administrator
 * @functions get page elments
 */
public class JDLoginPage {

	private static  WebElement element;

	/**
	 * @param driver
	 * @return 用户姓名 elment
	 */
	public static  WebElement usrName() {

		element = JdAutomatic.webDriver.findElement(By.name("loginname"));
		return element;
	}
	
	
	/**
	 * @param driver
	 * @return 用户密码 elment
	 */
	public static  WebElement loginPwd() {

		element =  JdAutomatic.webDriver.findElement(By.name("nloginpwd"));
		return element;
	}
	
	
	/**
	 * @param driver
	 * @return 登录按钮 elment
	 */
	public static  WebElement submitButton() {

		element =  JdAutomatic.webDriver.findElement(By.id("loginsubmit"));
		return element;
	}
	
	/**
	 * @param driver
	 * @return 用户别名 elment
	 */
	public static WebElement nickName() {

		element =  JdAutomatic.webDriver.findElement(By.className("nickname"));
		return element;
	}

}
