package com.iso.ppw.test.ui.common.core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;


/**
 * This abstract class is used by every page object to represent a page in the application.
 */
public abstract class PageBase extends LoadableComponent<PageBase>
{
	/**
	 * <code>pageUrl</code>
	 */
	private String pageUrl;

	/**
	 * This is the default constructor.
	 * 
	 * @param pageUrl The pageUrl to set.
	 * @param driver 
	 * @param domain 
	 */
	public PageBase(String pageUrl, String domain, WebDriver driver)
	{
		this.pageUrl = pageUrl;
	}
	
	/**
	 * This is an alternate constructor.
	 *
	 * @param domain The domain to set.
	 */
	public PageBase(String domain)
	{
		this.pageUrl = pageUrl+domain;
	}
	
	
	
	
	/**
	 * This method retrieve the pageUrl.
	 * 
	 * @return Returns the string.
	 */
	public String getPageUrl() 
	{
		return pageUrl;
	}

	protected void load(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}
	
	public PageBase(WebDriver driver)
	{
		
	}
	public PageBase()
	{
		
	}

	public <T> T get(WebDriver driver) {

	    try {
	      isLoaded();
	      return (T) this;
	    } catch (Error e) {
	      load();
	    }

	    isLoaded();

	    return (T) this;
	  
	}
	
}