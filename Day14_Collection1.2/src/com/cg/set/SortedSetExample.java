package com.cg.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
//it will sort the string in ascending order
	public static void main(String[] args) {
     SortedSet<String> s=new TreeSet<String>();
     s.add("Apoorvaa");
     s.add("Allows");
     s.add("Apoorva");
     System.out.println(s);
	}

}
