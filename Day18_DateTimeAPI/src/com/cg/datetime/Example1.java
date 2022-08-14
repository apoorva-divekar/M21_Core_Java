package com.cg.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Example1 {

	public static void main(String[] args) {
		LocalDate l= LocalDate.now();
		LocalTime t= LocalTime.now();
		LocalDate lt= LocalDate.of(1998,Month.OCTOBER , 26);
		System.out.println(l);
		System.out.println(t);
		System.out.println(lt);
	}

}