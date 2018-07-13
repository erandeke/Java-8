package com.allaboutlambda;

//problem 5

interface addableTest
{
	int addTest(int a,int b);
}

public class WithReturnKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addableTest a1=(a,b)->
		{
			return a+b;
		};
		System.out.println(a1.addTest(10, 20));
	}

}
