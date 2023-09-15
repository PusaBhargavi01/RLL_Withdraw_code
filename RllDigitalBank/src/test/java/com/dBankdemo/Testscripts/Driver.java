package com.dBankdemo.Testscripts;

import java.util.concurrent.TimeUnit;



import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;


import com.dBankdemo.Pages.CreatingSavingsAccountPage;
import com.dBankdemo.Pages.SignInPage;
import com.dBankdemo.Pages.WithdrawFromAccount;
import com.dBankdemo.Pages.logout;

public class Driver extends Tools {
	
	protected static SignInPage signinpage;
	protected static CreatingSavingsAccountPage creatingsavingsaccountpage;
	protected static WithdrawFromAccount withdrawfromaccount;
	protected static logout Logout;
	public static Logger logger;
	
	public static void init() {
		
		logger = Logger.getLogger("Withdrawl");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/bank/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		signinpage = new SignInPage(driver);
		creatingsavingsaccountpage = new CreatingSavingsAccountPage(driver);
		withdrawfromaccount = new WithdrawFromAccount(driver);
		Logout = new logout(driver);
		
		
		
	}

	

}
