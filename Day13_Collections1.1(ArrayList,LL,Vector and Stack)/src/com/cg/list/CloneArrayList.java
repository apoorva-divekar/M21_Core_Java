package com.cg.list;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
	    obj.add(11);
	    obj.add(12);
	    obj.add(13);
	    System.out.println(obj);
	    Object clonelist;
	    clonelist=obj.clone();
	    System.out.println(clonelist);
	    
	}

}
