package com.maven.org;

import org.testng.annotations.*;

public class Ignore {
	
	@Test
	private void url() {
		System.out.println("url");
	}
	@Test
	private void login() {
		System.out.println("login");
	}
	@Test (enabled=false)
	private void mobile() {
		System.out.println("mobile");
	}
	@Test
	private void laptop() {
		System.out.println("laptop");
	}
	@Test
	private void logout() {
		System.out.println("logout");
	}

}
