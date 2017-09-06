/**
 * 
 */
package com.automatic.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Administrator
 * 
 */
public class OpenBrowers {

	public static WebDriver openBrower(String url) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// 隐式等待
		// 访问目标地址
		driver.get(url);
		// maxmize the window
		driver.manage().window().maximize();

		return driver;
	}

}
