package com.iso.ppw.test.common.pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import com.iso.ppw.test.ui.common.driver.BrowserDriver;

public class Header extends LoadableComponent<Header> 
{
	@FindBy(how=How.ID, using ="mainMenu")
	private WebElement isonetProduct;
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Logout")
	private WebElement logout;

	//private WebDriver driver;
	
	public Header()
	{
		//this.driver = BrowserDriver.getDriver();
		//PageFactory.initElements(driver, this);
	}
	
	public Header(WebDriver driver)
	{
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void isLoaded() throws Error 
	{
		assertTrue(isonetProduct != null);
		assertTrue(logout != null);
	}

	@Override
	protected void load() 
	{
		
	}
	
	public void selectProduct(String product)
	{
		new Select(isonetProduct).selectByVisibleText(product);
	}
	
	public void logout(WebDriver driver) 
	{
		load();
		logout.click();
		
	}
}