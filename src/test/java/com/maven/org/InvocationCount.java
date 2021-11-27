package com.maven.org;

import org.testng.annotations.*;

public class InvocationCount {

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
		 @Test(invocationCount = 2)
		 private void searchmobile() {
			 System.out.println("Search Mobiles");
		 }
		 
		 @Test(invocationCount = 4)
		 private void searchlaptop() {
			 System.out.println("Search Laptops");
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

