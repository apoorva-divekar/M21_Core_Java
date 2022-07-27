package com.cg.list;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
    //List<Integer>obj=new ArrayList<> ();
    ArrayList obj=new ArrayList();
    obj.add(11);
    obj.add(12);
    obj.add(13);
    System.out.println("ArrayList elements are:"+obj);
    System.out.println(obj.size());
    System.out.println(obj.contains(13));
    System.out.println(obj.indexOf(13));
    System.out.println(obj.lastIndexOf(13));
    System.out.println(obj.set(1,'S'));
    System.out.println(obj);
	}

}
