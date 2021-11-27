package com.maven.org;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	@Test
	public void testing() {
		String expected = "Sunika";
		String actual = "Sunika";
	//  String actual = "Sony"; //throws error wen actual is not equal to expected in hard assert 
		                      //in soft assert need to give object.assertAll to check the actual result
		                           
		//Hard Assert
		
		//Assert.assertEquals(actual, expected);
		//Assert.assertNull(actual, expected);
		//Assert.assertNotNull(actual, expected);
		//Assert.assertTrue(1==1);
		
		//Soft Assert
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(actual, expected);  //runs and passes the program even if actual and exp are not same
		sa.assertAll();     //checks whether both conditions are true and gives the expected result
		
	}

}



