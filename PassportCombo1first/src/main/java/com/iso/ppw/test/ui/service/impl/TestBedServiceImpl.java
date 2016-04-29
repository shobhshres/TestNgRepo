package com.iso.ppw.test.ui.service.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;








import com.iso.ppw.test.ui.dao.TestBedDao;
import com.iso.ppw.test.ui.domain.AplusPropertyTestData;
import com.iso.ppw.test.ui.domain.AplusPropertyTrilliumTestData;
import com.iso.ppw.test.ui.domain.PassportComboTestData;
import com.iso.ppw.test.ui.domain.TestData;
import com.iso.ppw.test.ui.mapper.*;
import com.iso.ppw.test.ui.service.TestBedService;
import com.iso.ppw.test.ui.service.enums.DomainType;




public class TestBedServiceImpl  implements TestBedService 
{
	private TestBedDao dao;
	private TestBedDao dao1;
	private TestBedDao dao2;
	
	public void setDao2(TestBedDao dao2) {
		this.dao2 = dao2;
	}

	public void setDao1(TestBedDao dao1) {
		this.dao1 = dao1;
	}

	public void setDao(TestBedDao dao)
	{
		this.dao = dao;
	}
	
	 public List<TestData> findTestsByEnvironment(String environment) throws Exception 
	{
		String[] parameters = new String[1];
		parameters[0] = environment.toUpperCase();
		
		return dao.findTestsByCriteria(TestBedService.TESTBED_SQL, parameters, new TestDataMapper());
	}
	
	public String findDomainByEnvironmentAndDomainType(String environment, DomainType domainType) throws Exception 
	{
		String[] parameters = new String [2];
		parameters[0] = environment.toUpperCase();
		parameters[1] = domainType.getCode();
		
		return dao.findDomainsByCriteria(TestBedService.DOMAIN_SQL, parameters, new DomainMapper()).get(0);
		
	}

	

	public List<AplusPropertyTestData> findTestsByEnvironmentAndTestCase(String environment, String testCase) throws Exception {
		String[] parameters = new String [2];
		parameters[0] = environment.toUpperCase();
		parameters[1] = testCase.toUpperCase();
		
	return dao.findTestsByAplusPropertyCriteria(TestBedService.APLUS_PROPERTY_SQL, parameters, new TestDataAplusPropertyMapper());

				
		
	}

	public List<PassportComboTestData> findComboTestsByEnvironmentAndTestCase(String environment, String testcase) throws Exception {
		String[] parameters = new String [2];
		parameters[0] = environment.toUpperCase();
		parameters[1] = testcase.toUpperCase()+"%";
		
			return dao.findTestsForPassportCombo(TestBedService.COMBO_SQL, parameters, new ComboTestDataMapper());
			
		
	}

	public List<AplusPropertyTrilliumTestData> findTestsByEnvironmentAndTestCaseforTrillium(String environment, String testCase) throws Exception {
		String[] parameters = new String [2];
		parameters[0] = environment.toUpperCase();
		parameters[1] = testCase.toUpperCase();
		
		return dao.findTestsByAplusPropertyCriteriaforTrillium(TestBedService.APLUS_PROPERTY_SQL_TRILLIUM, parameters, new TestDataAplusAutoTrilliumMapper());
	}
	

	
}