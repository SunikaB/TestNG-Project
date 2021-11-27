package com.maven.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	
	@Test
	private void openGoogle() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunika\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.co.in");
	driver.quit();
	}

	@Test
	private void openFirefox() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mozilla.org");
		}
		
	}


