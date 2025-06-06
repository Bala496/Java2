package com.morning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "B:\\Bala\\Project1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.cssSelector("#email"));   //id 
		username.sendKeys("Shama");
		Thread.sleep(3000);
//		username.clear();
		
//		driver.findElement(By.cssSelector(".inputtext")).sendKeys("123455");   //.
        
//		driver.findElement(By.cssSelector("[value='1']")).click();
		
		driver.findElement(By.cssSelector("[data-testid^='op']")).click();
		
		driver.findElement(By.cssSelector("[aria-label$=' password']")).sendKeys("Thara");
		
		driver.findElement(By.cssSelector("[name*=\"reg_email__\"]")).sendKeys("Shama");

	}

}
