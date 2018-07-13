package com.allaboutlambda;

//problem 4

interface addable
{
	int addTheDigits(int a, int b);
}

public class MultipleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		addable a1=(a,b)->(a+b);
		System.out.println(a1.addTheDigits(10, 20));
		
			
		
	}

}
