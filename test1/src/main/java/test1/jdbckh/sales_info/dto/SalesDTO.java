package test1.jdbckh.sales_info.dto;

public class SalesDTO {
	private int CustNo;
	private String CustName;
	private String Grade;
	private int Sales;
	
	public SalesDTO() {
	}

	public SalesDTO(int custNo, String custName, String grade, int sales) {
		
		this.CustNo = custNo;
		this.CustName = custName;
		this.Grade = grade;
		this.Sales = sales;
	}

	@Override
	public String toString() {
		return "SalesDTO [CustNo=" + CustNo + ", CustName=" + CustName + ", Grade=" + Grade + ", Sales=" + Sales + "]";
	}

	public int getCustNo() {
		return CustNo;
	}

	public void setCustNo(int custNo) {
		CustNo = custNo;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public int getSales() {
		return Sales;
	}

	public void setSales(int sales) {
		Sales = sales;
	}
	
	
	
	
	
}
