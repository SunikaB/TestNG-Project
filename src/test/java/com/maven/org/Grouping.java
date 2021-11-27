package com.maven.org;

import org.testng.annotations.*;

public class Grouping {
	@Test(groups= "Company Details")
	private void companyName() {
		System.out.println("Codemantra");
	}
		@Test(groups= "Company Details")
	private void companyLocation() {
		System.out.println("Perungudi");
	}
	@Test(groups= "Company Details")
	private void sector() {
		System.out.println("IT sector");
	}
	@Test(groups= "Employee Details")
	private void employeeName() {
		System.out.println("Sunika");
	}
	@Test(groups= "Employee Details")
	private void employeeID() {
		System.out.println("1234");
	}
	@Test(groups= "Employee Details")
	private void employeeAddress() {
		System.out.println("Tambaram");
	}
	@Test(groups= "Bank Details")
	private void bankName() {
		System.out.println("Axis Bank");
	}
	@Test(groups= "Bank Details")
	private void bankCode() {
		System.out.println("ABC123");
	}
	@Test
	private void accountNumber() {
		System.out.println("912345678");
	}
}
