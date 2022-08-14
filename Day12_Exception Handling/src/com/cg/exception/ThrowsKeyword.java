package com.cg.exception;
//throws keyword is used to declare exception
import java.io.IOException;

public class ThrowsKeyword {
      static void display(int x)throws IOException,ClassNotFoundException
{
	if(x==5)
	{
		throw new IOException("Input-Output Exception");
	}
}


public static void main(String[] args) {
	try
	{
		display(5);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}

	


