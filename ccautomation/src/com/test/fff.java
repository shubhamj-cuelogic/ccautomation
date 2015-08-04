package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fff {
	  @Test
	  public void f() {
			{
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.co.in/");
				driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("shubham");;
			}
	  }
}
