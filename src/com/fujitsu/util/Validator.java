package com.fujitsu.util;

import java.util.ArrayList;
import java.util.List;

import com.fujitsu.app.AppConst;

/**
 * User input validator class
 * 
 * @author vjreddy
 *
 */
public class Validator {

	private String firstNumber;
	private String secondNumber;
	private String operatorStr;
	private List<String> validatonErrors = null;
	private double firstNum;
	private double secondNum;

	public Validator(String firstnumStr, String secondNumStr, String operatorStr) {
		this.firstNumber = firstnumStr;
		this.secondNumber = secondNumStr;
		this.operatorStr = operatorStr;
		validatonErrors = new ArrayList<String>();
	}

	/**
	 * Check all user input
	 * 
	 * @return
	 */
	public boolean isValidInput(String firstnumStr, String secondNumStr, String operatorStr) {
		// If Validation failed, store all validation error messages in the
		// validatonErrors list
		validatonErrors.add("[Your input has error, please correct]");
		boolean isValid = true;
		try {
			firstNum = Double.parseDouble(firstnumStr);
		} catch (Exception e) {
			validatonErrors.add("NumberFromatException: 1st Number - Please enter numeric only");
			isValid = false;
		}
		try {
			// System.out.print("Check1");
			secondNum = Double.parseDouble(secondNumStr);
		} catch (Exception e) {
			validatonErrors.add("NumberFromatException: 2nd Number - Please enter numeric only");
			isValid = false;
		}

		if (AppConst.allowedOperators.contains(operatorStr)) {
			if (secondNum == 0 && operatorStr.equals("/")) {				
				validatonErrors.add("DivisonByZero: You can't divide by zero!!!");
				isValid = false;
			}
		} else {
			validatonErrors.add("InvalidOperator: operator - Please select a valid operator");
			isValid = false;
		}
		return isValid;
	}

	public void displayValidatonErrors() {
		// Loop through validatonErrors arrayList and display the messages
		for (String validationError : validatonErrors) {
			System.out.println(validationError);
		}		
	}

	public double getFirstNumber() {
		return this.firstNum;
	}

	public void setFirstNumber() {
		firstNum = Double.parseDouble(firstNumber);
	}

	public double getSecondNumber() {
		return this.secondNum;
	}

	public void setSecondNumber() {
		secondNum = Double.parseDouble(secondNumber);
	}
}
