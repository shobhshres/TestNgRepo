package com.iso.ppw.test.ui.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowMapper;

import com.iso.ppw.test.ui.domain.PassportComboTestData;
import com.iso.ppw.test.ui.domain.TestData;

public class ComboTestDataMapper implements RowMapper<PassportComboTestData> 
{
	public PassportComboTestData mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		PassportComboTestData testData = new PassportComboTestData();
		
		testData.setEnvironment(StringUtils.trim(rs.getString("environment")));
		testData.setTestcase(StringUtils.trim(rs.getString("testcase")));
		testData.setUsername(StringUtils.trim(rs.getString("username")));
		testData.setPassword(StringUtils.trim(rs.getString("password")));
		testData.setRequestname(StringUtils.trim(rs.getString("requestname")));
		testData.setCompany(StringUtils.trim(rs.getString("company")));
		testData.setAplusauto(StringUtils.trim(rs.getString("aplusauto")));
		testData.setAplusproperty(StringUtils.trim(rs.getString("aplusproperty")));
		testData.setFlood(StringUtils.trim(rs.getString("flood")));
		testData.setBcegs(StringUtils.trim(rs.getString("bcegs")));
		testData.setHomework(StringUtils.trim(rs.getString("homework")));
		testData.setCvauto(StringUtils.trim(rs.getString("cvauto")));
		testData.setCvproperty(StringUtils.trim(rs.getString("cvproperty")));
		testData.setCabrushfire(StringUtils.trim(rs.getString("cabrushfire")));
		testData.setCrime(StringUtils.trim(rs.getString("crime")));
		testData.setProtectioncode(StringUtils.trim(rs.getString("protectioncode")));
		testData.setFutureeffppc(StringUtils.trim(rs.getString("futureeffppc")));
		testData.setFireline(StringUtils.trim(rs.getString("fireline")));
		testData.setNathazard(StringUtils.trim(rs.getString("nathazard")));
		testData.setPremiumtaxserv(StringUtils.trim(rs.getString("premiumtaxserv")));
		testData.setWindstorm(StringUtils.trim(rs.getString("windstorm")));
		testData.setLatlong(StringUtils.trim(rs.getString("latlong")));
		testData.setAutoterritory(StringUtils.trim(rs.getString("autoterritory")));
		testData.setTuproperty(StringUtils.trim(rs.getString("tuproperty")));
		testData.setTuauto(StringUtils.trim(rs.getString("tuauto")));
		testData.setAcxiom(StringUtils.trim(rs.getString("acxiom")));
		testData.setMvr(StringUtils.trim(rs.getString("mvr")));
		testData.setCadoi(StringUtils.trim(rs.getString("cadoi")));
		testData.setPreflight(StringUtils.trim(rs.getString("preflight")));
		testData.setSymbols(StringUtils.trim(rs.getString("symbols")));
		testData.setRiskanalyzer(StringUtils.trim(rs.getString("riskanalyzer")));
		testData.setAccountnumber(StringUtils.trim(rs.getString("accountnumber")));
		testData.setFirstname1(StringUtils.trim(rs.getString("firstname1")));
		testData.setMiddleinitial1(StringUtils.trim(rs.getString("middleinitial1")));
		testData.setLastname1(StringUtils.trim(rs.getString("lastname1")));
		testData.setDob1(StringUtils.trim(rs.getString("dob1")));
		testData.setSsn1(StringUtils.trim(rs.getString("ssn1")));
		testData.setDlstate1(StringUtils.trim(rs.getString("dlstate1")));
		testData.setDlnumber1(StringUtils.trim(rs.getString("dlnumber1")));
		testData.setPhonenumber(StringUtils.trim(rs.getString("phonenumber")));
		testData.setVin1(StringUtils.trim(rs.getString("vin1")));
		testData.setFirstname2(StringUtils.trim(rs.getString("firstname2")));
		testData.setLastname2(StringUtils.trim(rs.getString("lastname2")));
		testData.setSsn2(StringUtils.trim(rs.getString("ssn2")));
		testData.setFirstname3(StringUtils.trim(rs.getString("firstname3")));
		testData.setLastname3(StringUtils.trim(rs.getString("lastname3")));
		testData.setSsn3(StringUtils.trim(rs.getString("ssn3")));
		testData.setFirstname4(StringUtils.trim(rs.getString("firstname4")));
		testData.setLastname4(StringUtils.trim(rs.getString("lastname4")));
		testData.setSsn4(StringUtils.trim(rs.getString("ssn4")));
		testData.setFirstname5(StringUtils.trim(rs.getString("firstname5")));
		testData.setLastname5(StringUtils.trim(rs.getString("lastname5")));
		testData.setSsn5(StringUtils.trim(rs.getString("ssn5")));
		testData.setFirstinsfirstname(StringUtils.trim(rs.getString("firstinsfirstname")));
		testData.setFirstinslastname(StringUtils.trim(rs.getString("firstinslastname")));
		testData.setFirstinsssn(StringUtils.trim(rs.getString("firstinsssn")));
		testData.setFirstinsdob(StringUtils.trim(rs.getString("firstinsdob")));
		testData.setSecondinsfirstname(StringUtils.trim(rs.getString("secondinsfirstname")));
		testData.setSecondinslastname(StringUtils.trim(rs.getString("secondinslastname")));
		testData.setSecondinsssn(StringUtils.trim(rs.getString("secondinsssn")));
		testData.setThirdinsfirstname(StringUtils.trim(rs.getString("thirdinsfirstname")));
		testData.setThirdinslastname(StringUtils.trim(rs.getString("thirdinslastname")));
		testData.setThirdinsssn(StringUtils.trim(rs.getString("thirdinsssn")));
		testData.setFourthinsfirstname(StringUtils.trim(rs.getString("fourthinsfirstname")));
		testData.setFourthinslastname(StringUtils.trim(rs.getString("fourthinslastname")));
		testData.setFourthinsssn(StringUtils.trim(rs.getString("fourthinsssn")));
		testData.setFifthinsfirstname(StringUtils.trim(rs.getString("fifthinsfirstname")));
		testData.setFifthinslastname(StringUtils.trim(rs.getString("fifthinslastname")));
		testData.setFifthinsssn(StringUtils.trim(rs.getString("fifthinsssn")));
		testData.setCurhousenum1(StringUtils.trim(rs.getString("curhousenum1")));
		testData.setCuraddress1(StringUtils.trim(rs.getString("curaddress1")));
		testData.setCurcity1(StringUtils.trim(rs.getString("curcity1")));
		testData.setCurstate1(StringUtils.trim(rs.getString("curstate1")));
		testData.setCurzip1(StringUtils.trim(rs.getString("curzip1")));
		testData.setPolicyid(StringUtils.trim(rs.getString("policyid")));
		testData.setWrkaddress1(StringUtils.trim(rs.getString("wrkaddress1")));
		testData.setWrkcity1(StringUtils.trim(rs.getString("wrkcity1")));
		testData.setWrkstate1(StringUtils.trim(rs.getString("wrkstate1")));
		testData.setWrkzip1(StringUtils.trim(rs.getString("wrkzip1")));
		testData.setRiskhousenum1(StringUtils.trim(rs.getString("riskhousenum1")));
		testData.setRiskstreetname1(StringUtils.trim(rs.getString("riskstreetname1")));
		testData.setRiskcity1(StringUtils.trim(rs.getString("riskcity1")));
		testData.setRiskstate1(StringUtils.trim(rs.getString("riskstate1")));
		testData.setRiskzipcode1(StringUtils.trim(rs.getString("riskzipcode1")));
		testData.setExpectedresult(StringUtils.trim(rs.getString("expectedresult")));
		testData.setHazreport(StringUtils.trim(rs.getString("hazreport")));
		testData.setNatcat(StringUtils.trim(rs.getString("natcat")));
		
		return testData;
	}
}