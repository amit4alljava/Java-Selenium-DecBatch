package com.ust.banking.loans.helper;

import com.ust.banking.loans.dao.LoanDAO;

public class LoanHelper {
	
	public void loanCalculation(){
		System.out.println("This contains the logic for Loan Calc...");
		LoanDAO loanDAO = new LoanDAO();
		loanDAO.connectToDB();
	}

}
