package com.maven.org;

import org.testng.annotations.Test;

public class Dependency1 extends Dependency{
	@Test(dependsOnMethods = {"Profession1"})
	public void Profession3() {
		System.out.println("I am a professor");
	}
	@Test
	public void Profession4() {
		System.out.println("I am a doctor");
	}

	
}
