package org.excelIntegeration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B extends A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\FirstMaven\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys(getdata(1,0));
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys(getdata(1,1));
}
}
