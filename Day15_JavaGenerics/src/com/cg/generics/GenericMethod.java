package com.cg.generics;

public class GenericMethod {
//E is a element
	public static void main(String[] args) {
		Integer arr[]= {11,22,32};
		Character ch[]= {'K','A','R'};
		
		System.out.println("Integer Array: ");
		print(arr);
		
		System.out.println("Chatacter Array: ");
		print(ch);
	}
		
		//Generic Method
		//E is a Element
        public static <E>void print(E[] elements)
        {
        	for(E elem:elements)
        	{
        		System.out.println(elem);
        	}
        }
        
	}



