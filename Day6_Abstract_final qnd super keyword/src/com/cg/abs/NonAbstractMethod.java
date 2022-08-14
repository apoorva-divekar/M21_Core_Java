package com.cg.abs;
abstract class A
{
	void print()
	{
		System.out.println("Non-abstract Method");
	}
}
class B extends A
{
	
}

public class NonAbstractMethod {

	public static void main(String[] args) {
  A a=new B();
  a.print();
	}

}
