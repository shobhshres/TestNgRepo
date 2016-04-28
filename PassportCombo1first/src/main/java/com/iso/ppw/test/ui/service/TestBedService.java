package com.iso.ppw.test.ui.service;

import java.util.List;

import com.iso.ppw.test.ui.dao.TestBedDao;
import com.iso.ppw.test.ui.domain.AplusPropertyTestData;
import com.iso.ppw.test.ui.domain.AplusPropertyTrilliumTestData;
import com.iso.ppw.test.ui.domain.PassportComboTestData;
import com.iso.ppw.test.ui.domain.TestData;
import com.iso.ppw.test.ui.service.enums.DomainType;



public interface TestBedService 
{
	String TESTBED_SQL = "select userid, url, userPassword,  manualType, category, lob, state, serviceType, manuals, entitled from dbo.test where environment = ?";
	String APLUS_PROPERTY_SQL =" select  userid,userPassword,orderName, company, businessName,accountNumber,firstName1,middleInitial1,lastName1,dob1,ssn1,currentHouseNumber,currentAddress,currentCity,currentState,currentZip,vinNumber,phoneNumber,expectResult from dbo.testaplusproperty where environment= ? and testcase = ?";
	String DOMAIN_SQL = "select domain from dbo.domain where environment = ? and domaintype = ?";
	
	String COMBO_SQL ="SELECT ENVIRONMENT,TESTCASE,USERNAME,PASSWORD,REQUESTNAME,COMPANY,APLUSAUTO,APLUSPROPERTY,FLOOD,BCEGS,HOMEWORK,CVAUTO,CVPROPERTY,CABRUSHFIRE,CRIME,PROTECTIONCODE,FUTUREEFFPPC,FIRELINE,NATHAZARD,PREMIUMTAXSERV,WINDSTORM,LATLONG,AUTOTERRITORY,TUPROPERTY,TUAUTO,ACXIOM,MVR,CADOI,PREFLIGHT,SYMBOLS,RISKANALYZER,ACCOUNTNUMBER,FIRSTNAME1,MIDDLEINITIAL1,LASTNAME1,DOB1,SSN1,DLSTATE1,DLNUMBER1,PHONENUMBER,VIN1,FIRSTNAME2,LASTNAME2,SSN2,FIRSTNAME3,LASTNAME3,SSN3,FIRSTNAME4,LASTNAME4,SSN4,FIRSTNAME5,LASTNAME5,SSN5,FIRSTINSFIRSTNAME,FIRSTINSLASTNAME,FIRSTINSSSN,FIRSTINSDOB,SECONDINSFIRSTNAME,SECONDINSLASTNAME,SECONDINSSSN,THIRDINSFIRSTNAME,THIRDINSLASTNAME,THIRDINSSSN,FOURTHINSFIRSTNAME,FOURTHINSLASTNAME,FOURTHINSSSN,FIFTHINSFIRSTNAME,FIFTHINSLASTNAME,FIFTHINSSSN,CURHOUSENUM1,CURADDRESS1,CURCITY1,CURSTATE1,CURZIP1,POLICYID,WRKADDRESS1,WRKCITY1,WRKSTATE1,WRKZIP1,RISKHOUSENUM1,RISKSTREETNAME1,RISKCITY1,RISKSTATE1,RISKZIPCODE1,EXPECTEDRESULT,HAZREPORT,NATCAT FROM dbo.TESTPASSPORTCOMBO where environment=? and testcase like ?";

	String APLUS_PROPERTY_SQL_TRILLIUM =" select * from dbo.testAplusPropertyTrillium where environment= ? and testcase = ?";
	
	List<TestData> findTestsByEnvironment(String environment) throws Exception;
	
	List<AplusPropertyTestData> findTestsByEnvironmentAndTestCase(String environment, String testCase) throws Exception;

	List<PassportComboTestData> findComboTestsByEnvironmentAndTestCase(String environment, String testcase) throws Exception;

	String findDomainByEnvironmentAndDomainType(String environment, DomainType domainType) throws Exception;
	
	List<AplusPropertyTrilliumTestData> findTestsByEnvironmentAndTestCaseforTrillium(String environment, String testCase) throws Exception;

}