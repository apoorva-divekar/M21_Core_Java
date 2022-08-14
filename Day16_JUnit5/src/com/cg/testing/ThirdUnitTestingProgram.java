package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdUnitTestingProgram {
	@DisplayName("Test is successfully implemented")
	@Test
	void function()
	{
		log,info("hi");
		//System.out.println(" Want to display a name");
		}
	@Test
	@Disabled("Not Implemented")
   void function1()
   {
	   
   }
}
