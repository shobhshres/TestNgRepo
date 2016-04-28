package com.iso.ppw.test.ui.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowMapper;

import com.iso.ppw.test.ui.domain.TestData;

public class TestDataMapper implements RowMapper<TestData> 
{
	public TestData mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		TestData testData = new TestData();
		
		testData.setUserid(StringUtils.trim(rs.getString("userid")));
		testData.setUserPassword(StringUtils.trim(rs.getString("userPassword")));
		testData.setUrl(StringUtils.trim(rs.getString("url")));
		testData.setManualType(StringUtils.trim(rs.getString("manualType")));
		testData.setCategory(StringUtils.trim(rs.getString("category")));
		testData.setManuals(StringUtils.trim(rs.getString("manuals")));
		testData.setLob(StringUtils.trim(rs.getString("lob")));
		testData.setState(StringUtils.trim(rs.getString("state")));
		testData.setServiceType(StringUtils.trim(rs.getString("serviceType")));
		testData.setEntitled(StringUtils.trim(rs.getString("entitled")));
		
		return testData;
	}
}