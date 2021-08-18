package com.java8newfeature.lambda;


interface Add
{
	int add(int a, int b, int c);
}

public class AddTest {

	public static void main(String[] args) {
		
		//without return statement
		Add ad1 = (a,b,c) -> (a+b+c); 
			
		System.out.println(ad1.add(12,13,14));
		
		//with return statement
		Add ad = (a,b,c) -> {
			return (a+b+c); 
		};
		System.out.println(ad.add(15,16,17));

	}

}
