package com.ust.banking.loans.ui;

import com.ust.banking.loans.helper.LoanHelper;



public class LoanUI {

	public static void main(String[] args) {
		System.out.println("This is the Loan UI Class");
		LoanHelper loanHelper = new LoanHelper();
		loanHelper.loanCalculation();

	}

}
