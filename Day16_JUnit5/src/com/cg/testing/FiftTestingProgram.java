package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FiftTestingProgram 
{
	@Test
	@Disabled
	void trueAssumption()
	{
		assumeTrue(5>1);
		assertEquals(5+2,7);
		
	}
	@Test
	@Disabled
	void falseAssumption()
	{
		assumeFalse(5<1);
		assertEquals(5+2,7);
		
	}
	@Test
	void assumptionThat()
	{
		String str="Apoorva";
		assumingThat(str.equals("Apoorva"),
		()->assertEquals(2+3,5));
		
	}

}
