package com.cg.array;

import java.util.Scanner;

public class RunTimeArray {

	public static void main(String[] args) {
   int arr[]=new int[5];
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the value:");
   //to enter the elements the array
   for (int i=0;i<arr.length;i++)
   {
	   System.out.println("Enter" +i+"value");
	   arr[i]=s.nextInt();
   }
   //to print the array value that we gave as a input
	for(int x:arr) {
		System.out.println(x+" ");
	}
	}
}
