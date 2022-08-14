package com.cg.lamexp;

interface B{
//	OneParameterized expression
	String print(String str);
	
}

public class OneParameterizedFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B obj =(String str)->{
    	  return str;
       };
       System.out.println(obj.print("Lambda Expression"));
	}

}
