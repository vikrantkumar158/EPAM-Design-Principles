package com.vikrantkumar158.validator;

public class Validator
{
	private String result;

	public Validator()
	{
		result="";
	}

	public int invalid(String num)
	{
		try
		{
			int flag=0;
			for(int i=0;i<num.length();++i)
			{
				if((num.charAt(i)>='0'&&num.charAt(i)<='9')||(num.charAt(i)=='.'&&flag==0))
				{
					if(num.charAt(i)=='.')
						flag=1;
					continue;
				}
				return 1;
			}
		}
		catch(Exception e)
		{
			System.out.println("1");
		}
		return 0;
	} 

	public String validate(String num1,String num2,String expr)
	{
		try
		{
			if(!(expr.length()==1||expr.equals("+")||expr.equals("-")||expr.equals("/")||expr.equals("*")))
			{
				result="err: invalid operation sign";
			}
			else if(invalid(num1)==1)
			{
				result="err: num1 is not a valid number";
			}
			else if(invalid(num2)==1)
			{
				result="err: num2 is not a valid number";	
			}
			else if(expr.equals("/")&&Double.parseDouble(num2)==0)
			{
				result="err: divide by zero error";
			}
		}
		catch(Exception e)
		{
			System.out.println("2");
		}
		return result;
	}
}