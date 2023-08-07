package test1.jdbckh.sales_info.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test1.jdbckh.sales_info.dto.SalesDTO;

import static test1.jdbckh.common.jdbc.JdbcTemplate.*;

public class SalesDAO {	
	public List<SalesDTO> SalesList() {
		List<SalesDTO> result = null;
		String query = "select * from SALES";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			result = new ArrayList<SalesDTO>();
			while(rs.next() == true) {
				SalesDTO dto = new SalesDTO();
				dto.setCustNo(rs.getInt("custNo"));
				dto.setCustName(rs.getString("custName"));
				dto.setGrade(rs.getString("Grade"));
				dto.setSales(rs.getInt("Sales"));
				
				result.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(rs);
		}
		System.out.println(result);
		return result;
	}
}
