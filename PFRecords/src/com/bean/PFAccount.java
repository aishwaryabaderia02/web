package com.bean;

import java.io.Serializable;
import java.sql.Date;

public class PFAccount implements Serializable {

	/* do not change this identifier */
	private static final long serialVersionUID = 6818458717881046720L;

	private String accountNumber;
	private String name;
	private Date dateOfOpening;
	private Date dateOfClosing;
	private double balance;
	private boolean active;
	private double maturityAmount;
	
	public PFAccount() {
		// does nothing
	}
	
	public String getAccountNumber() { return accountNumber; }
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public Date getDateOfOpening() { return dateOfOpening; }
	public void setDateOfOpening(Date dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	public Date getDateOfClosing() { return dateOfClosing; }
	public void setDateOfClosing(Date dateOfClosing) {
		this.dateOfClosing = dateOfClosing;
	}

	public double getBalance() { return balance; }
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActive() { return active; }
	public void setActive(boolean active) {
		this.active = active;
	}

	public double getMaturityAmount() { return maturityAmount; }
	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}
	
	@Override
	public boolean equals(Object value) {
		if(value instanceof PFAccount) {
			if(((PFAccount) value).getAccountNumber().equalsIgnoreCase(getAccountNumber()))
				return true;
		}
		return false;
	}
}
