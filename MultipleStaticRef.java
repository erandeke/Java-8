package com.method.reference;

import java.util.function.BiFunction;

class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
public static float add(int a, float b){  
return a+b;  
}  
public static float add(float a, float b){  
return a+b;  
}  
}  

public class MultipleStaticRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> addr=Arithmetic::add;
		int result=addr.apply(10, 20);
		System.out.println(result);
		
		BiFunction<Integer, Float, Float> addr2=Arithmetic::add;
		float r=addr2.apply(10, 20.0f);
		
		
		
	}

}
