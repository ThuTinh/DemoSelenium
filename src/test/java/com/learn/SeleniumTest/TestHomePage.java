package com.learn.SeleniumTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestHomePage extends config {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	public TestHomePage() {	
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		Init();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage= new HomePage();  
		loginPage.login("minhtri2041998@gmail.com", "Thutinh1234");
	}
	
	@Test
	public void verifyHomePageTitleTest() throws InterruptedException{
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM","Home page title not matched");
		
		homePage.calenderLink.click();
		Assert.assertEquals("Calendar", homePage.titleLink.getText());
		Thread.sleep(1000);
		
		homePage.contactsLink.click();
		Assert.assertEquals("Contacts", homePage.titleLink.getText());
		Thread.sleep(1000);
		
		homePage.companiesLink.click();
		Assert.assertEquals("Companies", homePage.titleLink.getText());
		Thread.sleep(1000);
		
		homePage.tasksLink.click();
		Assert.assertEquals("Tasks", homePage.titleLink.getText());
		Thread.sleep(1000);
		contactsPage = homePage.clickOnContactsLink();
		
		homePage.clickOnNewContactLink();
		contactsPage.createNewContact("A", "B", "C", "124h@gmail.com");
		Thread.sleep(1000);
		Assert.assertEquals("A C", contactsPage.getName());		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
