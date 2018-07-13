package com.method.reference;

//Problem 1

interface Callable{
	
	void call();
	
}

public class ReferenceStatic {

	public static void getDone()
	{
		System.out.println("Static method Reference");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Callable c=ReferenceStatic::getDone;
	c.call();
	
	}

}
