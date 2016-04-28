package com.iso.ppw.test.ui.common.driver;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.iso.ppw.test.ui.common.enums.BrowserType;


/**
 * This class drives the browser.
 */
public  class BrowserDriver 
{
	/**
	 * <code>BROWSER_KEY</code>
	 */
	public static final String BROWSER_KEY = "selenium.browser";
	
	/**
	 * <code>IMPLICIT_WAIT_TIME_KEY</code>
	 */
	public static final String IMPLICIT_WAIT_TIME_KEY = "selenium.implicitWaitTime";
	
	/**
	 * <code>PAGE_LOAD_TIME_KEY</code>
	 */
	public static final String PAGE_LOAD_TIME_KEY = "selenium.pageLoadWaitTime";
	
	/**
	 * <code>AJAX_LOAD_TIME_KEY</code>
	 */
	public static final String AJAX_LOAD_TIME_KEY = "selenium.ajaxLoadWaitTime";
	
	private static final String REMOTE_URL = System.getProperty("RemoteUrl");
	
	/**
	 * <code>implicitWaitDefaultTime</code>
	 */
	private static int implicitWaitDefaultTime = 30;
	
	/**
	 * <code>pageLoadWaitDefaultTime</code>
	 */
	private static int pageLoadWaitDefaultTime = 60;
	
	/**
	 * <code>ajaxWaitDefaultTime</code>
	 */
	private static int ajaxWaitDefaultTime = 60;
	
	/**
	 * <code>webdriver</code>
	 */
//	private static WebDriver webdriver = null;
	
	/**
	 * <code>waitPageLoad</code>
	 */
	private static WebDriverWait waitPageLoad;
	
	/**
	 * <code>waitAjaxLoad</code>
	 */
	private static WebDriverWait waitAjaxLoad;
	
	/**
	 * <code>javaScriptExecutor</code>
	 */
	private static JavascriptExecutor javaScriptExecutor;
	
	/**
	 * This is the default constructor.
	 */
	/*private BrowserDriver()
	{
		
	}*/
	
	/*public BrowserDriver(WebDriver driver)
	{
		this.webdriver = driver;
	}*/
	
	/**
	 * This method retrieves the current window handle.
	 * 
	 * @return Returns the string.
	 */
	public static String getCurrentWindowHandle(WebDriver driver)
	{
		return driver.getWindowHandle();
	}
	
	/**
	 * This method retrieves the page source.
	 * 
	 * @return Returns the string.
	 */
	public static String getPageSource(WebDriver driver)
	{
		return driver.getPageSource();
	}
	
	/**
	 * This method retrieves the title.
	 * 
	 * @return Returns the string.
	 */
	public static String getTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	
	/**
	 * This method returns the url.
	 * @param driver 
	 * 
	 * @return Returns the string.
	 */
	public static String getUrl(WebDriver driver)
	{
		return driver.getCurrentUrl();
	}
	
	/**
	 * This method retrieves all window handles.
	 * 
	 * @return Returns the set.
	 */
	public static Set<String> getWindowHandles(WebDriver driver)
	{
		return driver.getWindowHandles();
	}
	
	/**
	 * This method launches the driver.
	 * 
	 * @return Returns the webdriver.
	 */
	private static WebDriver launchDriver(WebDriver driver)
	{
		switch (getBrowserType())
		{
			case InternetExplorer:
			{
				driver = launchInternetExplorer();
				break;
			}
			case Chrome:
			{
				driver = launchChrome();
				break;
			}
			
			default:
			{
				driver = launchFirefox();
				break;	
			}
		}
		
		driver.manage().timeouts().implicitlyWait(getImplicitWaitTime(), TimeUnit.SECONDS);
		waitPageLoad = new WebDriverWait(driver, getPageLoadWaitTime());
		waitAjaxLoad = new WebDriverWait(driver, getAjaxLoadWaitTime());
		javaScriptExecutor = (JavascriptExecutor) driver;
		
		return driver;
	}
	
	/**
	 * This method launches Firefox.
	 * 
	 * @return Returns the webdriver.
	 */
	private static WebDriver launchFirefox()
	{
		if (REMOTE_URL != null && !REMOTE_URL.equals("")) {
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			try {

				return new RemoteWebDriver(new URL(System.getProperty("RemoteUrl")), capabilities);
			}


			catch (MalformedURLException e) {

				e.printStackTrace();
				return null;
			}
		}

		else
		{
			FirefoxProfile profile = new FirefoxProfile();
			profile.setAcceptUntrustedCertificates(true);

			return new FirefoxDriver(profile);

		}


	}
	
	/**
	 * This method launches Internet Explorer.
	 * 
	 * @return Returns the webdriver.
	 */
	private static WebDriver launchInternetExplorer()
	{
		if (REMOTE_URL != null && !REMOTE_URL.equals("")) {
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			try {

				return new RemoteWebDriver(new URL(System.getProperty("RemoteUrl")), capabilities);
			}


			catch (MalformedURLException e) {

				e.printStackTrace();
				return null;
			}
		}

		else
		{
		URL IEDriverURL = BrowserDriver.class.getResource("/drivers/IEDriverServer.exe");
		File file = new File(IEDriverURL.getFile()); 
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, file.getAbsolutePath());
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		return new InternetExplorerDriver(capabilities);
		}
	
		
	}
	
	/**
	 * This method launches Chrome.
	 * 
	 * @return returns the webdriver.
	 */
	private static WebDriver launchChrome()
	{
		if (REMOTE_URL != null && !REMOTE_URL.equals("")) {
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			try {

				return new RemoteWebDriver(new URL(System.getProperty("RemoteUrl")), capabilities);
			}


			catch (MalformedURLException e) {

				e.printStackTrace();
				return null;
			}
		}

		else
		{
		URL chromeDriverURL = BrowserDriver.class.getResource("/drivers/chromedriver.exe");
		File file = new File(chromeDriverURL.getFile()); 
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, file.getAbsolutePath());
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		
		return new ChromeDriver(options);
		}
	}
	
	/**
	 * This method launches Chrome.
	 * 
	 * @return returns the webdriver.
	 */
	private static WebDriver launchRemoteDriver()
	{
		

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		try {
			if (REMOTE_URL != null && !REMOTE_URL.equals("")) {
				return new RemoteWebDriver(new URL(System.getProperty("RemoteUrl")), capabilities);
			}
			else
				return new InternetExplorerDriver();
		} catch (MalformedURLException e) {

			e.printStackTrace();
			return null;
		}
		
		
	}
	/**
	 * This method retrieves the browserType from the environment variables.
	 * 
	 * @return Returns the string.
	 */
	private static BrowserType getBrowserType()
	{
		String browserType = System.getProperty(BROWSER_KEY);
		if (browserType == null || browserType.isEmpty())
		{ 
			return BrowserType.Firefox;
		}
		else
		{
			int type = Integer.parseInt(browserType);
			
			if (BrowserType.InternetExplorer.getCode() == type)
			{
				return BrowserType.InternetExplorer;
			}
			else if (BrowserType.Chrome.getCode() == type)
			{
				return BrowserType.Chrome;
			}
			
			else
			{
				return BrowserType.Firefox;
			}
			
		}
	}
	
	/**
	 * This method retrieves the implicit wait time from the environment variables.
	 * 
	 * @return Returns the integer.
	 */
	private static int getImplicitWaitTime()
	{
		String implicitWaitTime = System.getProperty(IMPLICIT_WAIT_TIME_KEY);
		
		if (implicitWaitTime == null || implicitWaitTime.isEmpty())
		{ 
			return implicitWaitDefaultTime; 
		}
		else
		{
			return Integer.parseInt(implicitWaitTime);
		}
	}
	
	/**
	 * This method retrieves the page load wait time from the environment variables.
	 * 
	 * @return Returns the integer.
	 */
	private static int getPageLoadWaitTime()
	{
		String pageLoadWaitTime = System.getProperty(PAGE_LOAD_TIME_KEY);
		
		if (pageLoadWaitTime == null || pageLoadWaitTime.isEmpty())
		{ 
			return pageLoadWaitDefaultTime;
		}
		else
		{
			return Integer.parseInt(pageLoadWaitTime);
		}
	}
	
	/**
	 * This method retrieves the ajax load wait time from the environment variables.
	 * 
	 * @return Returns the integer.
	 */
	private static int getAjaxLoadWaitTime()
	{
		String ajaxLoadWaitTime = System.getProperty(AJAX_LOAD_TIME_KEY);
		
		if (ajaxLoadWaitTime == null || ajaxLoadWaitTime.isEmpty())
		{ 
			return ajaxWaitDefaultTime;
		}
		else
		{
			return Integer.parseInt(ajaxLoadWaitTime);
		}
	}
	
	/**
	 * This method starts the browser.
	 * @param driver 
	 */
	public static void start(WebDriver driver)
	{
	/*	if (driver == null)
		{
			driver = launchDriver(driver);
		}
	*/
		driver = launchDriver(driver);
		
	}
	
	/**
	 * This method open the browser according to specified url.
	 * 
	 * @param url The url to set.
	 */
	public static void open(String url,WebDriver driver)
	{
		driver.navigate().to(url);
	}
	
	/**
	 * This method refreshes the browser.
	 */
	public static void reload(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	
	/**
	 * This method navigates the browser back to the previous page. 
	 */
	public static void back(WebDriver driver)
	{
		driver.navigate().back();
	}
	
	/**
	 * This method navigates the browser forward to the next page.
	 */
	public static void forward(WebDriver driver)
	{
		driver.navigate().forward();
	}
	
	/**
	 * This method retrieves the text in the alert.
	 * 
	 * @return Returns the string.
	 */
	public static String getAlert(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	
	/**
	 * This method clicks on the OK button of the alert.
	 */
	public static void clickOkOnAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method clicks on the Cancel button of the alert.
	 */
	public static void clickCancelOnAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method tells you whether the element you are looking for exists or not. 
	 * 
	 * @param select The select to set.
	 * @param selector The selector to set.
	 * @return Returns true/false
	 */
	public static boolean isElementPresent(By selector,WebDriver driver)
	{
		try
		{
			driver.findElement(selector);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}
	

	/**
	 * This method waits for the page to load.
	 * @param driver 
	 * @throws InterruptedException 
	 */
	public static void waitForPageToLoad(WebDriver driver) throws InterruptedException
	{
		
		Thread.sleep(2000);
		//waitPageLoad.until(executeJavaScript("return document.readyState;", "complete"));
	}
	
	
	/**
	 * This method executes javascript.
	 * 
	 * @param javascript The javascript to set.
	 * @param expectedString The expectedString to set.
	 * @return Returns true/false.
	 */
	private static ExpectedCondition<Boolean> executeJavaScript(final String javascript, final String expectedString) 
	{
		return new ExpectedCondition<Boolean>() 
				{
					/**
					 * This method executes the string (javascript).
					 * 
					 * @param driver The driver to set.
					 * @return Returns true/false.
					 */
					public Boolean apply(WebDriver driver) 
					{
						try
						{
							return expectedString.equalsIgnoreCase(javaScriptExecutor.executeScript(javascript).toString());
						}
						catch (Exception e)
						{
							return false;
						}
					}
				};
	}
	
	/**
	 * This method will wait for the element to be available on the screen.
	 * 
	 * @param select The select to set.
	 * @param selector The selector to set.
	 * @param seconds The seconds to set.
	 * @return Returns the webelement
	 */
	public static WebElement waitForElement(WebElement we, int seconds,WebDriver driver) 
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);

		return wait.until(waitForElementToBeDisplayed(we));
	}

	/**
	 * This method will wait until the element is available.
	 * 
	 * @param select The select to set.
	 * @param selector The selector to set.
	 * @return Returns the webelement
	 */
	private static ExpectedCondition<WebElement> waitForElementToBeDisplayed(final WebElement we) 
	{
		return new ExpectedCondition<WebElement>() 
				{
					/**
					 * This method will retrieve the element.
					 * 
					 * @param driver The driver to set.
					 * @return Returns the webelement.
					 */
					public WebElement apply(WebDriver driver) 
					{
						if(we.isDisplayed()){

							return we;

							}

							return null;

					}
				};
	}
	
	/**
	 * This method maximizes the browser.
	 * @param driver 
	 */
	public static void maximizeWindow(WebDriver driver)
	{
		int width = ((Long) javaScriptExecutor.executeScript("return screen.width;")).intValue();
        int height = ((Long) javaScriptExecutor.executeScript("return screen.height;")).intValue();

        switch (getBrowserType())
        {
        	case Firefox:
            {
            	maximizeFirefoxWindow(width, height,driver);
                break;
            }
            
            case InternetExplorer:
            {
            	maximizeInternetExplorerWindow(width, height);
                break;
            }
        }
	}
	
	/**
	 * This method maximizes Firefox.
	 * 
	 * @param screenWidth The screenWidth to set.
	 * @param screenHeight The screenHeight to set.
	 */
	private static void maximizeFirefoxWindow(int screenWidth, int screenHeight,WebDriver driver)
    {
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().setSize(new Dimension(screenWidth, screenHeight));
    }

	/**
	 * This method maximizes Internet Explorer.
	 * 
	 * @param screenWidth The screenWidth to set.
	 * @param screenHeight The screenHeight to set.
	 */
    private static void maximizeInternetExplorerWindow(int screenWidth, int screenHeight)
    {
        javaScriptExecutor.executeScript("return window.moveTo(0, 0)");
        javaScriptExecutor.executeScript("return window.resizeTo(" + Integer.toString(screenWidth) + ", " + Integer.toString(screenHeight) + ")");
    }
    
    /**
     * This method switches to appropriate window.
     * 
     * @param windowName The windowName to set.
     * @param driver 
     */
	public static void switchWindow(String windowName, WebDriver driver)
	{
		driver.switchTo().window(windowName);
	}
	
	/**
	 * This method closes the appropriate window.
	 * 
	 * @param windowName The windowName to set.
	 */
	public static void closeWindow(String windowName,WebDriver driver)
	{
		driver.switchTo().window(windowName).close();
	}
	
	/**
	 * This method stops the browser.
	 * @param driver 
	 */
	public static void stop(WebDriver driver)
	{
		if (driver != null)
		{
			driver.quit();
			
			driver = null;
		}
	}
	
	/**
	 * 
	 * @return current WebDriver instance
	 */
	
/*	public static WebDriver  getDriver()
	{
	//	return webdriver;
	}*/
	
	public static Alert waitForAlert(int seconds,WebDriver driver) {
		FluentWait<WebDriver> wait = new WebDriverWait(driver, seconds).ignoring(NullPointerException.class);
		Alert A = wait.until(waitforAlertPresent(driver));

		if (A!=null){

			return A;
		}
		else
		{

			return null;
		}

	}


	public static ExpectedCondition<Alert> waitforAlertPresent(final WebDriver driver){

		return new ExpectedCondition<Alert>() {

			public Alert apply(WebDriver d) {

				Alert alert = driver.switchTo().alert();
				alert.getText();
				return alert;

			}
		};
	}
	
}