package com.cg.para;
class B 
{
	public int x;
	//parameterized Constructor
	B(int a)
	{
		System.out.println("The value of a is :"+a);
	}
}

public class Example2 {

	public static void main(String[] args) {
		B obj=new B(15);

	} 

}
