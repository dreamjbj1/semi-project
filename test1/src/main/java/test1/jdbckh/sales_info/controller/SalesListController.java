package test1.jdbckh.sales_info.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test1.jdbckh.sales_info.dao.SalesDAO;
import test1.jdbckh.sales_info.dto.SalesDTO;

/**
 * Servlet implementation class SalesListServlet
 */
@WebServlet("/member/sales")
public class SalesListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			SalesDAO dao = new SalesDAO();
			List<SalesDTO> result = dao.SalesList();
			request.setAttribute("SalesList", result);
			System.out.println("get");
			request.getRequestDispatcher("/WEB-INF/view/member/sales.jsp").forward(request, response);
		
	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
