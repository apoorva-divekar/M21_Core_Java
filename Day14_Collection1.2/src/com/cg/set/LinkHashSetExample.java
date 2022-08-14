package com.cg.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetExample {

	public static void main(String[] args) {
		Set<Object>obj=new LinkedHashSet<Object>();
	     //HashSet/Set is unordered and LinkedHashSet is ordered
	     obj.add("Apoorva");
	     obj.add('r');
	     obj.add(5.0);
	     obj.add(65);
	     System.out.println(obj);
	     Object[] arr=obj.toArray();
	     for(int i=0;i<arr.length;i++)
	     {
	    	 System.out.println(arr[i]);
	     }
	}

}
