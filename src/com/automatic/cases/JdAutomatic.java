/**
 * 
 */
package com.automatic.cases;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.automatic.controllor.JDLogin;
import com.automatic.controllor.Redirect;
import com.automatic.modules.OpenBrowers;
import com.automatic.views.JDLoginPage;

/**
 * @author Administrator
 * 
 */
public class JdAutomatic {

	static String loginTag;
	public static String command = "taskkill /f /im geckodriver.exe";

	public static WebDriver webDriver;
	public static Logger logger;

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void main(String[] args) throws InterruptedException,
			IOException {

		// launch the browser,visit target site
		webDriver = OpenBrowers.openBrower("https://www.jd.com");
		// logger.info("launch firefox success!");

		// 用户登录
		Redirect.searchLogin();
		JDLogin.doLogin("15608019959", "xml410379277");
		// logger.info("15608019959  logined!");

		loginTag = JDLoginPage.nickName().getText();
		// 判断用例是否执行成功
		if (loginTag.contains("西蜀风云")) {
			System.out.println("This case is passed!");
		} else {
			System.out.println("Thsi case is failed!");
		}

		webDriver.close();
		// 结束geckodriver进程
		Runtime.getRuntime().exec(command);

	}
}
