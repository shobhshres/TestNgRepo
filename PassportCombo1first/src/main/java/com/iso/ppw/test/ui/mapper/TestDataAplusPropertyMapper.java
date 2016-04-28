package com.iso.ppw.test.ui.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowMapper;

import com.iso.ppw.test.ui.domain.AplusPropertyTestData;



public class TestDataAplusPropertyMapper implements RowMapper<AplusPropertyTestData> 
{
	public AplusPropertyTestData mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		AplusPropertyTestData testData = new AplusPropertyTestData();

		testData.setUserid(StringUtils.trim(rs.getString("userid")));
		testData.setUserPassword(StringUtils.trim(rs.getString("userPassword")));
		testData.setOrderName(StringUtils.trim(rs.getString("orderName")));
		testData.setCompany(StringUtils.trim(rs.getString("company")));
		testData.setAccountNumber(StringUtils.trim(rs.getString("accountNumber")));
		testData.setFirstName1(StringUtils.trim(rs.getString("firstName1")));
		testData.setMiddleInitial1(StringUtils.trim(rs.getString("middleInitial1")));
		testData.setLastName1(StringUtils.trim(rs.getString("lastName1")));
		testData.setDob1(StringUtils.trim(rs.getString("dob1")));
		testData.setSsn1(StringUtils.trim(rs.getString("ssn1")));
		testData.setCurrentHouseNumber(StringUtils.trim(rs.getString("currentHouseNumber")));
		testData.setCurrentAddress(StringUtils.trim(rs.getString("currentAddress")));
		testData.setCurrentCity(StringUtils.trim(rs.getString("currentCity")));
		testData.setCurrentState(StringUtils.trim(rs.getString("currentState")));
		testData.setCurrentZip(StringUtils.trim(rs.getString("currentZip")));
		testData.setExpectResult(StringUtils.trim(rs.getString("expectResult")));
		testData.setBusinessName(StringUtils.trim(rs.getString("businessName")));
		testData.setVinNumber(StringUtils.trim(rs.getString("vinNumber")));
		testData.setPhoneNumber(StringUtils.trim(rs.getString("phoneNumber")));
		
		return testData;
	}
}