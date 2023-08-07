package test1.jdbckh.sales_info.service;

import java.sql.Connection;
import java.util.List;

import test1.jdbckh.sales_info.dao.SalesDAO;
import test1.jdbckh.sales_info.dto.SalesDTO;

import static test1.jdbckh.common.jdbc.JdbcTemplate.*;

public class SalesService {
	private SalesDAO dao = new SalesDAO();
	
	public List<SalesDTO> SalesList() {
		Connection conn = getConnection(); 
		List<SalesDTO> result = dao.SalesList();
		close(conn);
		return result;
	}
}
