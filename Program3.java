package com.learn.arraylist;

import java.util.ArrayList;

public class Program3 {

	public static void main(String[] args) {
		ArrayList fruitlist= new ArrayList();
		fruitlist.add("Apple");
		fruitlist.add("Banana");
		fruitlist.add("Orange");
		ArrayList veglist= new ArrayList();
		fruitlist.add("brinjal");
		fruitlist.add("ladys finger");
		fruitlist.add("carrot");
		ArrayList grocerylist= new ArrayList();
		grocerylist.addAll(fruitlist);
		grocerylist.addAll(veglist);
		System.out.println(grocerylist);
		
		

	}

}
