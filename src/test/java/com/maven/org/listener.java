package com.maven.org;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener{
	
	public void onTestStart (ITestResult result) {
		System.out.println("Test is going to execute");
}
	public void onTestSuccess (ITestResult result) {
		System.out.println("Test case passed");
}
	public void onTestFailure (ITestResult result) {
		System.out.println("Test case failed");
}
	public void onTestSkipped (ITestResult result) {
		System.out.println("Test skipped");
}
	public void onStart (ITestContext context) {
		System.out.println("Before test case");
}
	public void onFinish (ITestContext context) {
		System.out.println("After test case");
}
}