package com.learn.SeleniumTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  extends config{
	@FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[2]/span[1]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[3]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a")
	WebElement newContactLink;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[2]/span")
	WebElement calenderLink;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[4]/span")
	WebElement companiesLink ;
	
	@FindBy (xpath = "//*[@id=\"main-nav\"]/a[5]/span")
	WebElement dealsLink ;
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[1]")
	WebElement titleLink;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[6]")
	WebElement tasksLink;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName() {
		System.out.print("User name: "+userNameLabel.getText());
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink(){
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink(){
		newContactLink.click();
		
	}
	
}
