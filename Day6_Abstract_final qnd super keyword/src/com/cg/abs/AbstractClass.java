package com.cg.abs;
//program for abstract class
abstract class Fruit
{
	abstract void display();
}

class Apple
{
	void display()
	{
		System.out.println("Apple is good for our brain");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
       Apple f=new Apple();
       f.display();
	}

}
