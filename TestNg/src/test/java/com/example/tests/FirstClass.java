package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass {
	
	  @Test
	    public void testSubtraction() {
	        int a = 10;
	        int b = 5;
	        int expectedDifference = 5;
	        int actualDifference = a - b;
	        Assert.assertEquals(actualDifference, expectedDifference, "Difference should be 5");
	   System.out.println("automation done successfully"); 
	  
	  }

}
