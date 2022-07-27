package com.cg.vectors;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
        Stack<Object> s=new Stack<Object>();
        //push method is used to add the elements in stack
        s.push(11);
        s.push(12);
        s.push("Apoorva");
        System.out.println(s);
        //pop method is used to remove the elements from stack
       System.out.println( s.pop());
        System.out.println(s);
        
	}

}
