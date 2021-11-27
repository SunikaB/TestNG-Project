package com.maven.org;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	String [][]data= {
			{"username", "password"},
			{"username", "pass"},
			{"user", "password"},
			{"user", "pass"},
	                 };
	@org.testng.annotations.DataProvider(name="logindata")
	public String [][] logindataprovider(){
		return data;
	}
	
	@Test(dataProvider="logindata")
	private void login(String uname, String pass) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunika\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
           driver.get("https://www.facebook.com/");
           
           WebElement email = driver.findElement(By.name("email"));
           email.sendKeys("username");
           
           driver.findElement(By.id("pass")).sendKeys("pass");
           driver.findElement(By.name("login")).click();
           
	}

}
