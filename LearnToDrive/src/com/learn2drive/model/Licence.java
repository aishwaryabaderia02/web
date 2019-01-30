package com.learn2drive.model;

import java.util.Date;

public class Licence {
	
	private String number , isIssueingRTO;
	private Date expiryDate;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getIsIssueingRTO() {
		return isIssueingRTO;
	}
	public void setIsIssueingRTO(String isIssueingRTO) {
		this.isIssueingRTO = isIssueingRTO;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
