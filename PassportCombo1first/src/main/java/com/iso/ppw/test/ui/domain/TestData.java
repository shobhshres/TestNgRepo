/**
 * 
 */
package com.iso.ppw.test.ui.domain;

import java.io.Serializable;

public class TestData implements Serializable 
{
	private static final long serialVersionUID = 5430973123058111301L;
	private String environment;
	private String url;
	private String userid;
	private String userPassword;
	private String manualType;
	private String category;
	private String lob;
	private String state;
	private String serviceType;
	private String manuals;
	private String entitled;
	
	//  manualType, category, lob, state, serviceType, manuals, entitled
	
	public TestData() 
	{
		this.environment = "";
		this.url = "";
		this.userid = "";
		this.userPassword = "";
		this.manualType = "";
		this.category = "";
		this.lob = "";
		this.state = "";
		this.serviceType = "";
		this.manuals = "";
		this.entitled = "";
	}

	public String getEnvironment() 
	{
		return environment;
	}

	public void setEnvironment(String environment) 
	{
		this.environment = environment;
	}

	public String getUrl() 
	{
		return url;
	}

	public void setUrl(String url) 
	{
		this.url = url;
	}

	public String getUserid() 
	{
		return userid;
	}

	public void setUserid(String userid) 
	{
		this.userid = userid;
	}

	public String getUserPassword() 
	{
		return userPassword;
	}

	public void setUserPassword(String userPassword) 
	{
		this.userPassword = userPassword;
	}

	public String getManualType() 
	{
		return manualType;
	}

	public void setManualType(String manualType) 
	{
		this.manualType = manualType;
	}

	public String getCategory() 
	{
		return category;
	}

	public void setCategory(String category) 
	{
		this.category = category;
	}

	public String getLob() 
	{
		return lob;
	}

	public void setLob(String lob) 
	{
		this.lob = lob;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getServiceType() 
	{
		return serviceType;
	}

	public void setServiceType(String serviceType) 
	{
		this.serviceType = serviceType;
	}

	public String getManuals() 
	{
		return manuals;
	}

	public void setManuals(String manuals) 
	{
		this.manuals = manuals;
	}

	public String getEntitled() 
	{
		return entitled;
	}

	public void setEntitled(String entitled) 
	{
		this.entitled = entitled;
	}
}