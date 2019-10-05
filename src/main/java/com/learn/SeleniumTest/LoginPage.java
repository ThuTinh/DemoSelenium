package com.learn.SeleniumTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends config {

		@FindBy(name="email")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
		WebElement loginBtn;
		
		
		@FindBy(xpath = "/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")
		WebElement signBtnHome;
		
		@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]/div")
		WebElement labLoginFail;
		
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		public void loginFail(String un, String pwd) throws InterruptedException{
			username.sendKeys(un);
			Thread.sleep(2000);
			password.sendKeys(pwd);
			loginBtn.click();	
			username.clear();
			password.clear();	
			Assert.assertEquals("Something went wrong...", labLoginFail.getText());
			Thread.sleep(1000);		
		}
		
		public void login(String un, String pwd) throws InterruptedException{
			
			signBtnHome.click();
			username.sendKeys(un);
			Thread.sleep(1000);
			password.sendKeys(pwd);
			loginBtn.click();	
			username.clear();
			password.clear();	
					
		}
			

}
