package com.maven.org;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestRetry {
 @Test
 private void tester1() {
	 Reporter.log("Inside method1", true);
 }
 @Test(retryAnalyzer=com.maven.org.IRetry.class)
 private void tester2() {
	 Reporter.log("Inside method2", false);
	 Assert.assertEquals(false, true);
 }
}
