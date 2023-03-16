package com.org.util;

import java.text.DecimalFormat;

/**
 * All arithmetic calculation will be performed within this class.
 * @author vjreddy
 *
 */
public class Calculator {

	private double firstNumber;
	private double secondNumber;
	private String operator;
	private int output;
	private String outputStr;
	private double result;
	private static DecimalFormat df= new DecimalFormat("0.00");
	/**
	 * Argument constructor 
	 * @param firstNum
	 * @param secondNum
	 * @param operator
	 */
	public Calculator(double firstNum, double secondNum, String operator ) {
		this.firstNumber = firstNum;
		this.secondNumber = secondNum;
		this.operator = operator;
	}
	/**
	 * Main mathematical calculator method will be called from CalculatorTask.
	 * @return
	 */
	public double doCalculation() {
		switch(operator) {
		case "+":
			Double.toString(doAddition());
			break;
		case "-":
			Double.toString(doSubstraction());
			break;
		case "*":
			 Double.toString(doMult());
			break;
		case "/":
			Double.toString(doDiv());
			break;
		case "&":
			output = doBitwiseAnd();
			break;
		case "=":
			outputStr =doComparison();
			break;
		default:
			break;
			}		
		return 0;
	}
	
	/**
	 * Will display the calculated result 
	 */
	public void displayResult() {		
		if(operator.equals("=")){
			System.out.println("Results: " + outputStr);
		} else if (operator.equals("&")){
			System.out.println("Results: "+(int)firstNumber+" "+operator+" "+(int)secondNumber+ " = " + output);
		} else {
			System.out.println("Results: "+firstNumber+" "+operator+" "+secondNumber+ " = "+df.format(result));	
		}		
	}
	
	private double doAddition() {
		result = firstNumber+secondNumber;			
		return result;
	}
	
	private double doSubstraction() {
		result = firstNumber-secondNumber;				
		return result;
	}
	
	private double doMult() {
		result = firstNumber*secondNumber;				
		return result;
	}
	
	private double doDiv() {		
		result = firstNumber/secondNumber;		
		return result;
	}
	
	/**
	 * Please convert double to int using type casting 
	 * e.g int firtNum = (int) this.firstNumber
	 * int value = (int) 45.187;
	 * value will become = 45
	 * @return
	 */
	private int doBitwiseAnd() {
		int result= (int)firstNumber & (int)secondNumber;		
		return result;
	}
	
	/**
	 * Calculation for = operator 
	 * @return String
	 */
	private String doComparison() {
		String result = null;
		String firstNumStr = Double.toString(firstNumber);
		String secondNumStr = Double.toString(secondNumber);
		if(firstNumber==secondNumber) {
			result= firstNumStr + " == " + secondNumStr;
		} else if(firstNumber>secondNumber) {
			result= firstNumStr + " > " + secondNumStr;
		} else {
			result= firstNumStr + " < " + secondNumStr;
		}
		return result;
	}
}
