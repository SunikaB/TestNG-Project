package com.maven.org;

import org.testng.annotations.Test;

public class Dependency {
	
	@Test(dependsOnMethods = {"Profession2"})
	public void Profession1() {
		System.out.println("I am a student");
	}
	
	@Test
	public void Profession2() {
		System.out.println("I am a lawyer");
	}
	

}
