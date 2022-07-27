package com.cg.vectors;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
     Vector<Object> v=new Vector<Object>();
   //  v.add(11);
     //v.add("Apoorva");
     //v.add(34.6f);
     v.add(0,"Apoorva");
     v.add(1,'A');
     v.add(2,'3');
     System.out.println(v);
     System.out.println(v.set(1, 'v'));
     System.out.println(v);
     ArrayList<Object> a=new ArrayList<Object>();
     a.addAll(v);
     System.out.println(a);
     a.clear();
     System.out.println(a);

	}

}
