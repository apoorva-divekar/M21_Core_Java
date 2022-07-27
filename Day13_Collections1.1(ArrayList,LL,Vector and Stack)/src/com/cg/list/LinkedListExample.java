package com.cg.list;

import java.awt.List;
import java.util.LinkedList;

public class LinkedListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList obj=new LinkedList();
		obj.add(1);
		obj.add("Hello");
		obj.add('a');
		obj.add(2);
		obj.add(13.4f);
		
	    System.out.println(obj);
	    System.out.println(obj.size());
	    System.out.println(obj.contains(13));
	    System.out.println(obj.indexOf(13.4f));
	    System.out.println(obj.lastIndexOf('a'));


	}

}
