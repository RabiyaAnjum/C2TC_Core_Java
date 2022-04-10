package com.tns.core.java;

public class SumOfNaturalNumber1 {


	public static void main(java.lang.String[] args) {

		
		int i, num = 10, sum = 0;  
		//executes until the condition returns true  
		for(i = 1; i <= num; ++i)  
		{  
		//adding the value of i into sum variable  
		sum = sum + i;  
		//sum+=i; i tried something new----- exhausted with old one
		}  
		//prints the sum   
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
		}  
		}  

