package com.iso.ppw.test.ui.testNg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MapParameters {
	
	
	
List<TestNgAttribute> testNgParameter = new ArrayList<TestNgAttribute>();
	
public MapParameters(String platform, String browser, String version,String url,
		String testcaseName, String environment,String target,String iteration )
{
	List<String> platforms = Arrays.asList(platform.split(";"));
	List<String> browsers = Arrays.asList(browser.split(";"));
	List<String> versions = Arrays.asList(version.split(";"));
	List<String> urls = Arrays.asList(url.split(";"));
	List<String> testcaseNames = Arrays.asList(testcaseName.split(";"));
	List<String> environments = Arrays.asList(environment.split(";"));
	List<String> targets = Arrays.asList(target.split(";"));
	List<String> iterations = Arrays.asList(iteration.split(";"));
	
	
	//for(Iterator<String> i=platforms.iterator();i.hasNext();)
	
	for(int i = 0; i<testcaseNames.size(); i++)
	{
		
		
			List<String> minmaxIteration = Arrays.asList(iterations.get(i).split(","));
			
		
		TestNgAttribute testN = new TestNgAttribute();
	//	testN.setPlatform(platforms.get(i));
	//	testN.setBrowser(browsers.get(i));
	//	testN.setBrowserVersion(versions.get(i));
		testN.setUrl(urls.get(i));
		testN.setTestcaseNm(testcaseNames.get(i));
		testN.setEnvironment(environments.get(i));
		testN.setTargetmachine(targets.get(i));
		
	/*	
		for(int j = 0;j<1; j++)
		{
			
			testN.setIterationMin(minmaxIteration.get(j));
			testN.setIterationMax(minmaxIteration.get(j+1));
			
		}
		*/
		
		testN.setIterationMin(minmaxIteration.get(0));
		testN.setIterationMax(minmaxIteration.get(1));

		
		testNgParameter.add(testN);
		
		minmaxIteration = null;
		

		
	}
	
	
}


public List<TestNgAttribute> getData()
{
	
	return testNgParameter; 

}



}
