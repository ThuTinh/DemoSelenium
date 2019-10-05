package com.learn.SeleniumTest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestLoginPage  extends config{
	LoginPage loginPage;
	HomePage homePage;

	
	public TestLoginPage(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		Init();
		loginPage = new LoginPage();	
	}
	
	@Test(priority = 1)
	public void LoginFail(){
		 loginPage.signBtnHome.click();
		 try {
			 
//			System.out.println("start usecase 1");
//			loginPage.loginFail("username", "password");
//			System.out.println("stop usecase 1");
			 
			Thread.sleep(2000);
			System.out.println("start usecase 2");
			loginPage.loginFail("minhtri2041998@gmail.com", "password");
			System.out.println("stop usecase 2");
			
//			Thread.sleep(1000);
//			System.out.println("start usecase 3");
//			loginPage.loginFail("username", "Thutinh1234");
//			System.out.println("stop usecase 3");
			
			} catch (InterruptedException e) {	
			System.out.println("Test1 not pass");
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2)
	public void Login(){
		 try {
			 
			Thread.sleep(1000);
			System.out.println("start usecase 4");
			 loginPage.login("minhtri2041998@gmail.com", "Thutinh1234");
			System.out.println("stop usecase 4");	
			Thread.sleep(5000);
			} catch (InterruptedException e) {	
			System.out.println("Test2 not pass");
			e.printStackTrace();	
		}
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
