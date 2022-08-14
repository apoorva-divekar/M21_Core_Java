package com.cg.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//ArrayDeque will print the elements of queue in same insertion order
    Queue<Object> q=new ArrayDeque<Object>();
    q.offer(11); 
    q.add(12); 
    q.add(17); 
    System.out.println(q);
    System.out.println(q.peek());
    // PriorityQueue will print the elements using priority of the elements
    Queue<Object> q1=new PriorityQueue<Object>();
    q.offer(5); 
    q.add(7); 
    q.add(10); 
    System.out.println(q1);
    System.out.println(q1.peek());
	}

}
