package com.consumer.pkg;

import java.util.function.Consumer;

public class ConsumerExample {
	
	static void print(String message)
	{
		System.out.println(message);
	}
	
	void print(Integer val)
	{
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> consumer1=ConsumerExample::print;
		consumer1.accept("Kedar");
		
		Consumer<Integer> consumer2=new ConsumerExample()::print;
		consumer2.accept(11);
		
		
		
	}

}
