package com.maven.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	@Test
	@Parameters("browser")
	private void testing(String browser) {
	if (browser.equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunika\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	}
}
}