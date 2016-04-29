package com.iso.ppw.test.ui.testNg;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:definition/main/application-context.xml" })
@TestExecutionListeners
public class PassportTestNg extends AbstractTransactionalTestNGSpringContextTests
{
//	WebDriver driver1 =null;
	List<TestNgAttribute>  testNg   ;
	List<WebDriver> setDriver = new ArrayList<WebDriver>();
	
	private StringBuffer verificationErrors = new StringBuffer();
	DesiredCapabilities caps = new DesiredCapabilities();
	String localPlatform="";
	String localBrowser ="";
	String localVersion="";

	@Parameters({"platform", "browser", "version", "url","testcaseName","environment", "target","iteration" })
	@BeforeTest(alwaysRun = true)
	public void setup(String platform, String browser, String version,String url,String testcaseName, String environment,String target,String iteration) throws MalformedURLException {

		localPlatform = platform;
		localBrowser = browser;
		localVersion = version;
		
		MapParameters mapP = new MapParameters(platform, browser, version,url,testcaseName, environment,target,iteration);
		testNg   = mapP.getData();
					
	}

	@Test(description = "FirstTest")
	public void FirstTest() throws InterruptedException {
		
		for(int i =0; i<testNg.size(); i++)
		{
			
			if(testNg.get(i).getTestcaseNm().equals("FirstTest"))
			{
				
					WebDriver driver = driverHandle();
					
					setDriver.add(driver);
				
				
				for(int j = 1; j<20;j++)
				{
					System.out.println("frst test url get =="+testNg.get(i).getUrl());
					driver.navigate().to(testNg.get(i).getUrl());
				
				}
			}
			
		}
		
	}
	
	@Test(description = "SecondTests")
	public void SecondTest() throws InterruptedException {
		for(int i =0; i<testNg.size(); i++ )
		{
			
			if(testNg.get(i).getTestcaseNm().equals("SecondTests"))
			{
			
				WebDriver driver = driverHandle();
				setDriver.add(driver);
			
				for(int j = 1; j<20; j++ )
				{
					
					System.out.println("get url second test func == "+testNg.get(i).getUrl());
					//Thread.sleep(1000);
					driver.navigate().to(testNg.get(i).getUrl());
					
				}
				
			}
			
		}
		}
	
	@Test(description = "ThirdTest")
	public void ThirdTest() throws InterruptedException {
		WebDriver	driver3 = null;
		for(int i =0; i<testNg.size(); i++)
		{
			
			if(testNg.get(i).getTestcaseNm().equals("ThirdTest"))
			{
				WebDriver driver = driverHandle();
				setDriver.add(driver);
				for(int j = 1; j<20; j++ )
				{
				System.out.println("thirsd getting url =="+testNg.get(i).getUrl());
				driver.navigate().to(testNg.get(i).getUrl());
				}	
			}
		}
	}
	
	
	
	@AfterTest
	public void afterTest() {
		// Close the browser
		for(int i = 0; i<setDriver.size(); i++)
		{
			setDriver.get(i).quit();
			
		}

		System.out.println("AFTER TEST ");
		
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
		}

	}
	
public WebDriver driverHandle()
{
	WebDriver driver = null;
	try {
		driver = new RemoteWebDriver(new URL(testNg.get(1).getTargetmachine()),caps);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return driver;
}

public void configureDriver()
{
	Map<String, org.openqa.selenium.Platform> platforms = new HashMap<String, org.openqa.selenium.Platform>();
	  platforms.put("Windows",org.openqa.selenium.Platform.WINDOWS);
	  platforms.put("MAC",org.openqa.selenium.Platform.MAC);
	  platforms.put("ANDROID",org.openqa.selenium.Platform.ANDROID);
	  platforms.put("VISTA",org.openqa.selenium.Platform.VISTA);
	  caps.setPlatform(platforms.get(localPlatform));
	

	  Map<String, DesiredCapabilities> browsers = new HashMap<String, DesiredCapabilities>();
	  browsers.put("FIREFOX", DesiredCapabilities.firefox());
	  browsers.put("CHROME", DesiredCapabilities.chrome());
	  browsers.put("INTERNET EXPLORER", DesiredCapabilities.internetExplorer());
	  browsers.put("ANDROID", DesiredCapabilities.android());
	  
	  caps = browsers.get(localBrowser);
		caps.setVersion(localVersion);


}


	
}
