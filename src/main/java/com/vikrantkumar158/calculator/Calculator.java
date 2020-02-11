package com.vikrantkumar158.calculator;

import com.vikrantkumar158.evaluator.*;

public class Calculator
{
	private Evaluator evaluator;

	public Calculator()
	{
      	evaluator=new Evaluator();
  	}

	public void calculate(String num1,String num2,String expr) 
	{
      	evaluator.evaluate(num1, num2, expr);
		evaluator.displayResult(num1, num2, expr);
  	}
}
