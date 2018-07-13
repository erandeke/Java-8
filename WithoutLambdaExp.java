package com.allaboutlambda;

//Problem 1
interface Accountable
{
	void checkFund();
	
	
	
}
public class WithoutLambdaExp {

	 public static void main(String[] args) {  
		 
		 
		 Accountable a1=new Accountable() {
			
			@Override
			public void checkFund() {
				System.out.println("Hey all I am without Lambda");	
			}
		};
		 a1.checkFund();
	 }
}
