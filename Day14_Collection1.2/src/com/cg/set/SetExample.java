package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
    // Set<Integer>obj=new HashSet<Integer>();
		Set<Object>obj=new HashSet<Object>();
     //Set is unordered
     obj.add("Apoorva");
     obj.add('k');
     obj.add(5.0);
     obj.add(65);
     System.out.println(obj);
	}

}
