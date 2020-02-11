package com.vikrantkumar158;

import java.util.*;
import com.vikrantkumar158.calculator.*;

public class App
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String num1,num2,expr;
        System.out.print("Enter First Number : ");
        num1=sc.nextLine();
        System.out.print("Enter Second Number : ");
        num2=sc.nextLine();
        System.out.print("Enter operation(+,-,*,/) to perform : ");
        expr=sc.nextLine();
        Calculator calculator=new Calculator();
        calculator.calculate(num1,num2,expr);
    }
}
