package com.maven.org;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {
	@Test
	@Parameters({"company"})
	private void companyName(String company) {
		System.out.println("Company name is" + company);
	}

}
