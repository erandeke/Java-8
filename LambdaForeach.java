package com.allaboutlambda;

import java.util.ArrayList;
import java.util.List;

//Problem 5

public class LambdaForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> data=new ArrayList<String>();
		
	    data.add("Kedar");
	    data.add("Wox");
	    data.add("Fox");
	    data.add("Trzx");
	    
	    data.forEach(string->System.out.println(string));
	    
	}

}
