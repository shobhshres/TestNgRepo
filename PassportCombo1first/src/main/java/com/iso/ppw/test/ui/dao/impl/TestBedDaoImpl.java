package com.iso.ppw.test.ui.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.iso.ppw.test.ui.dao.TestBedDao;
import com.iso.ppw.test.ui.domain.*;


public class TestBedDaoImpl extends JdbcDaoSupport implements TestBedDao 
{
	public List<TestData> findTestsByCriteria(String sql, Object[] parameters, RowMapper<TestData> rowMapper) throws Exception 
	{
		return getJdbcTemplate().query(sql, parameters, rowMapper);
	}
	
	public List<String> findDomainsByCriteria(String sql, Object[] parameters, RowMapper<String> rowMapper) throws Exception 
	{
		return getJdbcTemplate().query(sql, parameters, rowMapper);
	}

	public List<AplusPropertyTestData> findTestsByAplusPropertyCriteria(String sql, Object[] parameters, RowMapper<AplusPropertyTestData> rowMapper)
			throws Exception {
		return getJdbcTemplate().query(sql, parameters, rowMapper);
	}

	public List<PassportComboTestData> findTestsForPassportCombo(String sql, Object[] parameters, RowMapper<PassportComboTestData> rowMapper)
			throws Exception {
		return getJdbcTemplate().query(sql, parameters, rowMapper);

	}

	public List<AplusPropertyTrilliumTestData> findTestsByAplusPropertyCriteriaforTrillium(String sql, Object[] parameters,RowMapper<AplusPropertyTrilliumTestData> rowMapper)
			throws Exception {
		return getJdbcTemplate().query(sql, parameters, rowMapper);
	}
	
	
}