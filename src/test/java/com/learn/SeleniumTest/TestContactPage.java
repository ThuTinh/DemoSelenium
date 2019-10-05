package com.learn.SeleniumTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestContactPage extends config {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	String sheetName = "contacts";
	
	   
	public TestContactPage(){
			super();
			
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Init();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void validateCreateNewContact( ) throws InterruptedException{
		loginPage.login("minhtri2041998@gmail.com", "Thutinh1234");
		homePage.clickOnContactsLink();
		Thread.sleep(2000);
		homePage.clickOnNewContactLink();
		contactsPage.createNewContact("A", "B", "C", "124h@gmail.com");
		Thread.sleep(5000);
		Assert.assertEquals("A C", contactsPage.getName());		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
