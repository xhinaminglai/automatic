/**
 * 
 */
package com.automatic.controllor;

import org.openqa.selenium.By;

import com.automatic.cases.JdAutomatic;

/**
 * @author Administrator
 * @functions 页面跳转
 */
public class Redirect {

	
/*
 * 登录页
 */
	public static void searchLogin() {
		JdAutomatic.webDriver.findElement(By.linkText("你好，请登录")).click();
		JdAutomatic.webDriver.findElement(By.linkText("账户登录")).click();
	}
}
