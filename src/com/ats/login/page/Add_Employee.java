package com.ats.login.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_Employee {

	public Add_Employee( WebDriver driver) {

		driver.get("https://sight-spectrum-ats.vercel.app/login");
		driver.findElement(By.xpath("//input[@class=\"ms-TextField-field field-160\"]")).sendKeys("testing@128.com");
		driver.findElement(By.xpath("//input[@class=\"ms-TextField-field field-172\"]")).sendKeys("HELLO123");
		driver.findElement(
				By.xpath("//button[@class=\"ms-Button ms-Button--primary Login_login_button__SaZGP root-177\"]"))
				.click();
	}
	
	static void collapse_Button(WebDriver driver) throws Exception {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"collapseId\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"employee\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"employee\"]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[2]/button")).click();
		
	}
	
	

	
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		Add_Employee chorme=new Add_Employee(driver);
		Add_Employee.collapse_Button(driver);
		
		
		
		
		

	}

}
