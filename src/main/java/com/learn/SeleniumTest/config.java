package com.learn.SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class config {
	public static WebDriver driver;
	public  static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;
	
	public  static void Init() {
		
		System.setProperty("webdriver.chrome.driver", "D:/ChomeDriver/chromedriver.exe");
		driver = new ChromeDriver(); 
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebDriverEventListener() {
			
			public void onException(Throwable throwable, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeSwitchToWindow(String windowName, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeScript(String script, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeNavigateTo(String url, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeNavigateRefresh(WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeNavigateForward(WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeNavigateBack(WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeGetText(WebElement element, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public <X> void beforeGetScreenshotAs(OutputType<X> target) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeFindBy(By by, WebElement element, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeClickOn(WebElement element, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeAlertDismiss(WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeAlertAccept(WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterSwitchToWindow(String windowName, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterScript(String script, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterNavigateTo(String url, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterNavigateRefresh(WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterNavigateForward(WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterNavigateBack(WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterGetText(WebElement element, WebDriver driver, String text) {
				// TODO Auto-generated method stub
				
			}
			
			public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterFindBy(By by, WebElement element, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterClickOn(WebElement element, WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterAlertDismiss(WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterAlertAccept(WebDriver driver) {
				// TODO Auto-generated method stub
				
			}
		};
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		
	}
	
}

