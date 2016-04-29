package com.iso.ppw.test.ui.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowMapper;

import com.iso.ppw.test.ui.domain.AplusPropertyTrilliumTestData;



public class TestDataAplusAutoTrilliumMapper implements RowMapper<AplusPropertyTrilliumTestData> 
{
	public AplusPropertyTrilliumTestData mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		AplusPropertyTrilliumTestData testData = new AplusPropertyTrilliumTestData();

		testData.setUserid(StringUtils.trim(rs.getString("userid")));
		testData.setUserPassword(StringUtils.trim(rs.getString("userPassword")));
		testData.setOrderName(StringUtils.trim(rs.getString("orderName")));
		testData.setCompany(StringUtils.trim(rs.getString("company")));
		testData.setFirstName1(StringUtils.trim(rs.getString("firstName1")));
		testData.setLastName1(StringUtils.trim(rs.getString("lastName1")));
		testData.setCurrentHouseNumber(StringUtils.trim(rs.getString("currentHouseNumber")));
		testData.setCurrentAddress(StringUtils.trim(rs.getString("currentAddress")));
		testData.setCurrentCity(StringUtils.trim(rs.getString("currentCity")));
		testData.setCurrentState(StringUtils.trim(rs.getString("currentState")));
		testData.setCurrentZip(StringUtils.trim(rs.getString("currentZip")));
		testData.setExpectResult(StringUtils.trim(rs.getString("expectResult")));
		
		
		return testData;
	}
}