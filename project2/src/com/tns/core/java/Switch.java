package com.tns.core.java;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x=10;
		switch(x)
		{
		case 14:
			System.out.println("Happy Women's Day");
			break;
			default:
				System.out.println("Wenesday");
		
	     }*/


int x=10;//variable not constant
final int y=20;//constant //if i not declare as final keyword then i get the error as "case expression must be constant expression
switch(y)
{
case 10:
	System.out.println(10);
	break;
case y:
	System.out.println(20);
	break;
	
}
}
}