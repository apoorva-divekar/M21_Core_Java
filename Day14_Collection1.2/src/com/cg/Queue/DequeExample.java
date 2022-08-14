package com.cg.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
     Deque<Object> d=new ArrayDeque<Object>();
     d.add(11);
     d.addFirst(13);
     d.addLast(7);
     d.add("Apoorva");
     d.add("Rahul");
     System.out.println(d);
     d.removeFirst();
     d.removeLast();
     System.out.println(d);
     System.out.println(d.peek());

     
	}

}
