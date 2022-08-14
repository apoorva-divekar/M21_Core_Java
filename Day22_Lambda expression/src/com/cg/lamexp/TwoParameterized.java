package com.cg.lamexp;
interface B{
//	OneParameterized expression
	String print(String str,String str1);
	
}

public class TwoParameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	       B obj =(String str,String str1)->{
	    	  return ("str", "str1");
	       };
	       System.out.println(obj.print("Lambda Expression"));
		}

	}

	}

}
