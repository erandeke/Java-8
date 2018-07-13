package com.allaboutlambda;





//Reference to Problem 1


interface AccountableTest
{
	
	void checkFund();
}

public class WithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AccountableTest a1=()->
		{
			System.out.println("I am in lambda");
		};
		a1.checkFund();
	}

}
