/**
 * 
 */
package com.automatic.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automatic.cases.OkdaiAutomatic;

/**
 * @author Administrator
 * @functions   get page elements
 */
public class OkdaiLoginPage {

	private static WebElement okElement;

	/*
	 * get loginButton
	 */
	public static WebElement loginButton() {
		OkdaiAutomatic.driver.findElement(By.linkText("登录"));
		return okElement;
	}

	/*
	 * get userName
	 */
	public static WebElement userName() {
		OkdaiAutomatic.driver.findElement(By.id("username"));
		return okElement;
	}
	
	/*
	 * get passWord
	 */
	public static WebElement passWord() {
		OkdaiAutomatic.driver.findElement(By.id("password"));
		return okElement;
	}
	
	/*
	 * get loginSubmitButton
	 */
	public static WebElement loginSubmitButton() {
		OkdaiAutomatic.driver.findElement(By.id("login"));
		return okElement;
	}
	
	
	

}
