package com.learn.linkedlist;

import java.util.LinkedList;

public class Program2 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(40);
		ll.add(90);
		System.out.println(ll);
		ll.add(1,true);
		System.out.println(ll);
	}

}
