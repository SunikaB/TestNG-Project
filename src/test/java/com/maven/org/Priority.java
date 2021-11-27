package com.maven.org;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=3)
	private void sister() {
		System.out.println("Sister");
	}

	@Test(priority=2)
	private void mother() {
		System.out.println("Mother");
	}
	
	@Test(priority=4)
	private void brother() {
		System.out.println("Brother");
	}
	@Test(priority=1)
	private void father() {
		System.out.println("Father");
	}
}
