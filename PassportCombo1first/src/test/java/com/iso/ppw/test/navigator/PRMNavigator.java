package com.iso.ppw.test.navigator;


import com.iso.ppw.test.ui.common.core.PageBase;
import com.iso.ppw.test.ui.common.navigator.Navigator;


public interface PRMNavigator extends Navigator
{
	PageBase switchWindow(PageBase target, String windowName);
	String getCurrentUrl();
	String getWindow(int index);
	void closeWindow(String windowName);
    void sleep(int t) throws InterruptedException;
   
}