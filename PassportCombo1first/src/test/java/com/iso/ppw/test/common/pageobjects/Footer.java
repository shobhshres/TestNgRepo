package com.iso.ppw.test.common.pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.iso.ppw.test.ui.common.driver.BrowserDriver;

public class Footer extends LoadableComponent<Footer> 
{
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div/a")
	private WebElement isoCorporateHome;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div/a[2]")
	private WebElement termsAndConditions;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div/a[3]")
	private WebElement privacyAndSecurityPolicy;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div/a[4]")
	private WebElement contactISOnet;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div/a[5]")
	private WebElement salesInfo;

	private WebDriver driver;
	
	public Footer()
	{
		//this.driver = BrowserDriver.getDriver();
		PageFactory.initElements(driver, this);
	}

	
	public Footer(WebDriver driver)
	{
		//this.driver = BrowserDriver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@Override
	protected void isLoaded() throws Error 
	{
		assertTrue(isoCorporateHome != null);
		assertTrue(termsAndConditions != null);
		assertTrue(privacyAndSecurityPolicy != null);
		assertTrue(contactISOnet != null);
		assertTrue(salesInfo != null);
	}

	@Override
	protected void load() 
	{
		
	}
}