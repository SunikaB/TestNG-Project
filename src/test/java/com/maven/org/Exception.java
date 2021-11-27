package com.maven.org;

import org.testng.annotations.Test;

public class Exception {
	
	@Test
	private void add() {
		int i=5;
		int j=5;
		System.out.println("Added value:"+ (i+j));
	}
	
	@Test (expectedExceptions = ArithmeticException.class)
	private void div() {
		int a= 20;
		int b= 0;
		System.out.println("division value:"+ (a/b));
	}
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	private void array() {
		int [] s= new int[5];
		s[0]=1;
		s[1]=2;
		s[2]=3;
		s[3]=4;
		s[4]=5;
		s[5]=6;
		int length =s.length;
		System.out.println("Array length:"+ length);
		for (int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
