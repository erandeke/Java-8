package com.allaboutlambda;

//Problem 2:

interface Stringable
{
	 String printMessage();
	
}

public class StringLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stringable s1=()->
		{
			return "In String Lambda";
		};
		
		s1.printMessage();
	}

}
