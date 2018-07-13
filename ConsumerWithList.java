package com.consumer.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerWithList {

	static void addList(List<Integer> list)
	{
		
		int result=list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		Consumer<List<Integer>> consumer1=ConsumerWithList::addList;
		consumer1.accept(numbers);
		
		
		
		
	}

}
