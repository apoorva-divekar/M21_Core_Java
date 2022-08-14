package com.cg.inheritance;
//program on speed Inheritance
 class Bike
 {
	 public int speed=50;
	 void speed()
	 {
		 System.out.println("The speed of Bike is: "+speed + "km/hr");
	 }
 }
 //Inheritance
 class Pulser extends Bike
 {
	  void average()
	 {
		 System.out.println("Good");
	 }
 }



public class SingleInheritance {

	public static void main(String[] args) {
  Pulser p=new Pulser();
  p.speed();
	p.average();
	}

}
