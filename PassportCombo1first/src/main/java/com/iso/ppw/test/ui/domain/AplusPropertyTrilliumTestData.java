package com.iso.ppw.test.ui.domain;

import java.io.Serializable;

public class AplusPropertyTrilliumTestData implements Serializable 
{
	private static final long serialVersionUID = 5430973123058111301L;
	private String environment;
	private String testcase;
	private String accountNumber;
	private String userid;
	private String userPassword;
	private String orderName;
	private String company;
	private String firstName1;

	private String lastName1;
	
	private String currentHouseNumber;
	private String currentAddress;
	private String currentCity;
	private String currentState;
	private String currentZip;
	private String expectResult;
	
	
	
	
	public AplusPropertyTrilliumTestData() 
	{
		this.environment = "";
		this.userid = "";
		this.userPassword = "";
		this.orderName="";
		this.company="";
		this.firstName1="";
		
		this.lastName1="";
		
		this.currentHouseNumber="";
		this.currentAddress="";
		this.currentCity="";
		this.currentState="";
		this.currentZip="";
		this.expectResult="";
		
	}



	/**
	 * @return the environment
	 */
	public String getEnvironment() {
		return environment;
	}



	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}



	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}



	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}



	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}



	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	/**
	 * @return the orderName
	 */
	public String getOrderName() {
		return orderName;
	}



	/**
	 * @param orderName the orderName to set
	 */
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}



	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}



	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}



	/**
	 * @return the firstName1
	 */
	public String getFirstName1() {
		return firstName1;
	}



	/**
	 * @param firstName1 the firstName1 to set
	 */
	public void setFirstName1(String firstName1) {
		this.firstName1 = firstName1;
	}



	



	/**
	 * @return the lastName1
	 */
	public String getLastName1() {
		return lastName1;
	}



	/**
	 * @param lastName1 the lastName1 to set
	 */
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}



	


	


	


	



	/**
	 * @return the currentHouseNumber
	 */
	public String getCurrentHouseNumber() {
		return currentHouseNumber;
	}



	/**
	 * @param currentHouseNumber the currentHouseNumber to set
	 */
	public void setCurrentHouseNumber(String currentHouseNumber) {
		this.currentHouseNumber = currentHouseNumber;
	}



	/**
	 * @return the currentAddress
	 */
	public String getCurrentAddress() {
		return currentAddress;
	}



	/**
	 * @param currentAddress the currentAddress to set
	 */
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}



	/**
	 * @return the currentCity
	 */
	public String getCurrentCity() {
		return currentCity;
	}



	/**
	 * @param currentCity the currentCity to set
	 */
	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}



	/**
	 * @return the currentState
	 */
	public String getCurrentState() {
		return currentState;
	}



	/**
	 * @param currentState the currentState to set
	 */
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}



	/**
	 * @return the currentZip
	 */
	public String getCurrentZip() {
		return currentZip;
	}



	/**
	 * @param currentZip the currentZip to set
	 */
	public void setCurrentZip(String currentZip) {
		this.currentZip = currentZip;
	}



	/**
	 * @return the expectResult
	 */
	public String getExpectResult() {
		return expectResult;
	}



	/**
	 * @param expectResult the expectResult to set
	 */
	public void setExpectResult(String expectResult) {
		this.expectResult = expectResult;
	}



	/**
	 * @return the testcase
	 */
	public String getTestcase() {
		return testcase;
	}



	/**
	 * @param testcase the testcase to set
	 */
	public void setTestcase(String testcase) {
		this.testcase = testcase;
	}



	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}



	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


}