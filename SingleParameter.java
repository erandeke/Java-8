package com.allaboutlambda;

//Problem 3


interface Printable
{
	void printMessage(String name);
}

public class SingleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable p1=(name)->
		{
			System.out.println("name is"+name);
		};
		p1.printMessage("Kedar");
		
	}

}
