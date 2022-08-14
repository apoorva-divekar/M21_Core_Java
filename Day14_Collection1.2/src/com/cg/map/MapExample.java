package com.cg.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
    Map<Integer,String>obj=new LinkedHashMap<Integer,String>();
	obj.put(2, "Apoorva");
	obj.put(4, "Komal");
    System.out.println(obj);
	}

}
