package com.learn.treeset;
import java.util.*;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Program1 {

	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<Integer>();
		tr.add(10);
		tr.add(20);
		tr.add(30);
		tr.add(40);
		for(Object x:tr)
		{
			System.out.println(x);
		}
	    Iterator<Integer> itr = tr.iterator();
	    {
	    	while(itr.hasNext())
	    	{
	    		System.out.println(itr.next());
	    	}
	    
	    }
		
		}
}
