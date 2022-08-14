package com.cg.array;

public class ComplietimeArray {

	public static void main(String[] args) {
   int arr[]= {11,22,33,44,55};
	System.out.println(arr[4]);
	/*for(int i=0;i<=arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}*/
	//ehanced for loop
	for(int x:arr) {
		System.out.print(x+ "  ");
	}
	}
	}
