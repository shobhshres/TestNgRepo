package com.iso.ppw.test.ui.mapper;

import java.sql.ResultSet
;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowMapper;

public class DomainMapper implements RowMapper<String> 
{
	public String mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		return StringUtils.trim(rs.getString("domain"));
	}
}