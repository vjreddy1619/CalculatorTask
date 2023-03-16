package com.fujitsu.app;

import java.util.Scanner;

import com.fujitsu.util.Calculator;
import com.fujitsu.util.Validator;

/**
 * Simple calculator
 * 
 * @author vjreddy
 *
 */
public class CalculatorTask {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 1st number: ");
		String firstNumber = input.next();
		System.out.print("Please enter 2nd number: ");
		String secondNumber = input.next();
		System.out.print("Please select the operation you want to perform [+,-,*,/,&,=] :");
		String operator = input.next();

		Validator validator = new Validator(firstNumber, secondNumber, operator);
		if(validator.isValidInput(firstNumber, secondNumber, operator)) {			
			Calculator calculator= new Calculator(validator.getFirstNumber(), validator.getSecondNumber(), operator);
			calculator.doCalculation();
			calculator.displayResult();
		} else {
			// show validation messages
			validator.displayValidatonErrors();
		}			
		input.close();					
	}
}
