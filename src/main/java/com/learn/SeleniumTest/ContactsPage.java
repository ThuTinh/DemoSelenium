package com.learn.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage extends config {
	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[1]")
	WebElement labName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(name = "middle_name")
	WebElement middleName;
	
	@FindBy(xpath ="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div/div[1]/input")
	WebElement email;
	
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement saveBtn;
	
	
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsLabel(){
		return contactsLabel.isDisplayed();
	}
	
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}
	
	public String getName() {
		return labName.getText();
	}
	
	public void createNewContact( String ftName,String midName , String ltName, String email){
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		middleName.sendKeys(midName);
		this.email.sendKeys(email);
		saveBtn.click();
		
		
		
	}

}
