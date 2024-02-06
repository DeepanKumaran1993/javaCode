package com.ats.login.page;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_Picker {

	
// for selecting Year
	public void selecting_Year(WebDriver driver) throws Exception {
		
		driver.get("https://sight-spectrum-ats.vercel.app/login");
		driver.findElement(By.xpath("//input[@class=\"ms-TextField-field field-160\"]")).sendKeys("testing@128.com");
		driver.findElement(By.xpath("//input[@class=\"ms-TextField-field field-172\"]")).sendKeys("HELLO123");
		driver.findElement(
				By.xpath("//button[@class=\"ms-Button ms-Button--primary Login_login_button__SaZGP root-177\"]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"collapseId\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/button"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[2]/button")).click();
		// Entering the Requiremnent
		driver.findElement(By.xpath("//*[@id=\"TextField51\"]")).sendKeys("SQL DEVELOPER");
		
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SSLTP11355\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Calender_Picker c_picker=new Calender_Picker();
		c_picker.selecting_Year(driver);
		
		
	}
	

}
