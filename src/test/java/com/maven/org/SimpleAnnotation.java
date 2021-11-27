package com.maven.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
 @BeforeSuite
 private void setup() {
	 System.out.println("Set up");
 }
 @BeforeTest
 private void browserlaunch() {
 System.out.println("browser launch");
 }
 @BeforeClass
 private void url() {
	 System.out.println("Amazon url");
 }
 @BeforeMethod
 private void login() {
	 System.out.println("Login");
 }
 @Test
 private void searchmobile() {
	 System.out.println("Search Mobiles");
 }
@AfterMethod
private void homepage() {
	System.out.println("Homepage");
}
@AfterClass
private void logout() {
	System.out.println("Logout");
}
@AfterTest
private void close() {
	System.out.println("Close");
}
@AfterSuite
private void cookiesdelete() {
	System.out.println("Cookies delete");
}
}
