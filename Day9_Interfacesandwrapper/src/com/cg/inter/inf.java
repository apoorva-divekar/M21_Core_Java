package com.cg.inter;

 interface inf 
 {
//by default its abstract method
	 void display ();
	 }
 class Demo implements inf
 {
	 
	 public void display()
	 {
		 System.out.println("Interface");
	 }
 }
public class Main
{
	public static void main(String arg[])
	{
		Demo d=new Demo();
		d.display();
	}
}