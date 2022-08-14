package com.cg.lamexp;

interface A
{
	void show();
}

public class FunctionalInterface {

	public static void main(String[] args) {
		A obj=()->
		{
			System.out.println("Program on to implement Functional interface using lambda expression");
		};
		obj.show();
	}

}
