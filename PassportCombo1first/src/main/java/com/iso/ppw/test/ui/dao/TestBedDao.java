package com.iso.ppw.test.ui.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.iso.ppw.test.ui.domain.*;
import com.iso.ppw.test.ui.mapper.TestDataAplusPropertyMapper;


public interface TestBedDao 
{
	List<TestData> findTestsByCriteria(String sql, Object[] parameters, RowMapper<TestData> rowMapper) throws Exception;
	List<String> findDomainsByCriteria(String sql, Object[] parameters, RowMapper<String> rowMapper) throws Exception;
	List<AplusPropertyTestData> findTestsByAplusPropertyCriteria(String sql, Object[] parameters, RowMapper<AplusPropertyTestData> rowMapper) throws Exception;
	List<PassportComboTestData> findTestsForPassportCombo(String sql, Object[] parameters, RowMapper<PassportComboTestData> rowMapper) throws Exception;
	List<AplusPropertyTrilliumTestData> findTestsByAplusPropertyCriteriaforTrillium(String sql, Object[] parameters, RowMapper<AplusPropertyTrilliumTestData> rowMapper) throws Exception;
	
}