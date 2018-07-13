package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Product
{
	
	int product_id;
	String product_name;
	int product_price;
	public Product(int product_id, String product_name, int product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}
	
	
	
	
	
}

public class StreamFiltering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> listOfProducts=new ArrayList<Product>();
		listOfProducts.add(new Product(10,"AAp",100));
		listOfProducts.add(new Product(10,"AAp",200));
		listOfProducts.add(new Product(10,"AAp",300));
		
		List<Product> listOfProducts2=listOfProducts.stream().filter(p->p.product_price>300)
			   .collect(Collectors.toList());
		
		//Iteration..
		
		listOfProducts.stream().filter(p->p.product_price<300).forEach(product->System.out.println(product.product_name));
		
		
		
		//Find Max and Min
		
		/*   Maximum  */
		Product prod=listOfProducts.stream().max((product1, product2)->   
        product1.product_price > product2.product_price ? 1: -1).get(); 
		System.out.println(prod.product_price);
		
		
		Product productList=listOfProducts.stream().max((product1,product2)->
		  product1.product_price < product2.product_price ? 1: -1).get(); 
		System.out.println(prod.product_price);
		
		
		
		
		
	}

}
