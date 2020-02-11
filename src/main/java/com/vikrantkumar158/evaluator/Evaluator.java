package com.vikrantkumar158.evaluator;

import com.vikrantkumar158.validator.*;

public class Evaluator
{
	private String result;
	private Validator v;

	public Evaluator()
	{
		result="";
		v=new Validator();
	}
	  
	public void evaluate(String num1,String num2,String expr)
  	{
  		result=v.validate(num1,num2,expr);
  		if(result.equals(""))
  		{
  			char ch=expr.charAt(0);
	      	switch(ch)
			{
				case '+':result=Double.toString(Double.parseDouble(num1)+Double.parseDouble(num2));break;
	          	case '-':result=Double.toString(Double.parseDouble(num1)-Double.parseDouble(num2));break;
				case '*':result=Double.toString(Double.parseDouble(num1)*Double.parseDouble(num2));break;
				case '/':result=Double.toString(Double.parseDouble(num1)/Double.parseDouble(num2));break;
				default:break;
			}
		}
  	}

	public void displayResult(String num1,String num2,String expr)
  	{
  		if(result.startsWith("err")==true)
  			System.out.println(result);
  		else	
      		System.out.println("Result to the expression "+num1+" "+expr+" "+num2+" is : "+result);
  	}
}
