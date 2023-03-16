# CalculatorTask
Simple calculator to perform Arithmatic operators.
User defined constants will be defined within AppConstant,java file.
All arithmetic calculation will be performed within Calculator class
User input validations available in Validator class.

Sample output should be like below.

Example-1:
Please enter 1st number: 10
Please enter 2nd number: abc
Please select the operation you want to perform [+,-,*,/,&,=] :v
[Your input has error, please correct]
NumberFromatException: 2nd Number - Please enter numeric only
InvalidOperator: operator - Please select a valid operator


example-2
Please enter 1st number: aa
Please enter 2nd number: bb
Please select the operation you want to perform [+,-,*,/,&,=] :ii
[Your input has error, please correct]
NumberFromatException: 1st Number - Please enter numeric only
NumberFromatException: 2nd Number - Please enter numeric only
InvalidOperator: operator - Please select a valid operator

example-3
Please enter 1st number: 400
Please enter 2nd number: 100
Please select the operation you want to perform [+,-,*,/,&,=] :/
Results: 400.0 / 100.0 = 4.00
