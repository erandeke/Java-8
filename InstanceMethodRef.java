package com.method.reference;

public class InstanceMethodRef {
	
	public void printnMsg(){  
        System.out.println("Hello, this is instance method");  
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread t1=new Thread(new InstanceMethodRef()::printnMsg);
		t1.start();
		
	}

}
