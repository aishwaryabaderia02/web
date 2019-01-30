package com.bean;

public class Payslip  {
	private int payslipId;
	private String employeeCode;
	private String month;
	private double basic;
	private double hra;
	private double commutationAllowance;
	private double lta;
	private double performancePay;
	private double upkeepPay;
	
	public Payslip() { /* does nothing */ }
	public Payslip(int payslipId, 
					String employeeCode, 
					String month, 
					double basic, 
					double hra, 
					double commutationAllowance,
					double lta,
					double performancePay,
					double upkeepPay) {
		this.payslipId = payslipId;
		this.employeeCode = employeeCode;
		this.month = month;
		this.basic = basic;
		this.hra = hra;
		this.commutationAllowance = commutationAllowance;
		this.lta = lta;
		this.performancePay = performancePay;
		this.upkeepPay = upkeepPay;
	}
	
	public int getPayslipId() { return payslipId; }
	public void setPayslipId(int payslipId) {
		this.payslipId = payslipId;
	}

	public String getEmployeeCode() { return employeeCode; }
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getMonth() { return month; }
	public void setMonth(String month) { this.month = month; }

	public double getBasic() { return basic; }
	public void setBasic(double basic) { this.basic = basic; }

	public double getHra() { return hra; }
	public void setHra(double hra) { this.hra = hra; }

	public double getCommutationAllowance() { return commutationAllowance; }
	public void setCommutationAllowance(double commutationAllowance) {
		this.commutationAllowance = commutationAllowance;
	}

	public double getLta() { return lta; }
	public void setLta(double lta) { this.lta = lta; }

	public double getPerformancePay() { return performancePay; }
	public void setPerformancePay(double performancePay) {
		this.performancePay = performancePay;
	}

	public double getUpkeepPay() { return upkeepPay; }
	public void setUpkeepPay(double upkeepPay) {
		this.upkeepPay = upkeepPay;
	}
}
