package com.iso.ppw.test.navigator;


import org.openqa.selenium.WebDriver;

import com.iso.ppw.test.ui.common.core.PageBase;
import com.iso.ppw.test.ui.common.navigator.Navigator;


public interface PPWNavigator extends Navigator
{
	PageBase switchWindow(PageBase target, String windowName,WebDriver driver);
	//String getCurrentUrl();
	String getCurrentUrl(WebDriver driver);
	String getWindow(int index,WebDriver driver);
	void closeWindow(String windowName,WebDriver driver);
    void sleep(int t) throws InterruptedException;
   
}