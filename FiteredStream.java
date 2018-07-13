package com.allaboutlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Problem 7

class Product


{
	
	private int product_id;
	private String product_name;
	
	Product(int product_id,String product_name)
	{
		this.product_id=product_id;
		this.product_name=product_name;
		
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	
	
	
	
	
}



public class FiteredStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		List<Product> productData=new ArrayList<Product>();
		productData.add(new Product(1, "Soap"));
		productData.add(new Product(10, "ABS "));
		productData.add(new Product(2, "Dail"));
		
		//Before 
		
		for(Product p:productData)
		{
			System.out.println(p.getProduct_id()+""+p.getProduct_name());
		}
		
		
	Collections.sort(productData, (p1,p2)->{
		return p1.getProduct_name().compareTo(p2.getProduct_name());
	});
		

	for(Product p:productData)
	{
		System.out.println(p.getProduct_id()+""+p.getProduct_name());
	}
	
	
	List<Product> filter_data=productData.stream().filter(p1->p1.getProduct_name().equals("ABS")).collect(Collectors.toList());

	}
  
}
