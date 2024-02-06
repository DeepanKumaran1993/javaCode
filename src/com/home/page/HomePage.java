package com.home.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

	void date_Picker(WebDriver driver) {
		
		
		
		String button_Up_Year = "button.navigationButton-335";
		String button_Down_Year = "button.navigationButton-335";
		String year_Finder = "button.currentItemButton-342";
		String req_Date = "//*[@title=\"Go to previous year 2020\"]";

		String current_Year = driver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/button"))
				.getText();
		
		Date dat = new Date();
		dat.getMonth();
		String[] month_Calender = { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		String expect_Year = "2021";
		String expect_Month = month_Calender[1] + " " + expect_Year;
		System.out.println(current_Year.equals(expect_Year));
		while (true) {

			current_Year = driver
					.findElement(
							By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/button"))
					.getText();
			if (current_Year.equals(expect_Year)) {
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[1]"))
						.getText();
				String actual_month = driver
						.findElement(
								By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[1]"))
						.getText();
				System.out.println(actual_month);
				break;
//				if(expect_Month.equals(actual_month)) {
//					System.out.println("acutal month"+ actual_month);
//					
//					break;
//					
//				}
//				else {
//					
//				}
			} else {
				driver.findElement(By.cssSelector(button_Down_Year)).click();
			}

		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String nana = "vedi kundu";
//		for(int i=nana.length()-1;i>=0;i--)
//			System.out.println(nana.charAt(i));
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SSLTP11355\\Downloads\\geckodriver64.exe");
		WebDriver driver = new FirefoxDriver();

//		if(driver.getTitle().contains("Google")) {
//				
//			System.out.println("hai");
//		
//		}
//		

		String url = "https://sight-spectrum-ats.vercel.app/login";
		driver.get(url);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("TextField3")).sendKeys("testing@128.com");
		driver.findElement(By.id("TextField8")).sendKeys("HELLO123");
		driver.findElement(By.id("id__13")).click();
		Thread.sleep(2000);
		// For opening the navigation bar
		driver.findElement(By.className("Sidebar_collapse_icon_container__L4Y7u")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"demand\"]/button/span/div")).click();

		driver.findElement(By.xpath("//*[@class=\"ms-Button ms-Button--primary root-177\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"TextField57\"]")).sendKeys("enter pannu");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("i.ms-DatePicker-event--without-label ")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/div/button[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[2]/div/div[2]/button[3]")).click();
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr[5]/td[4]/button")).click();

//		String error_User = driver.findElement(By.className("Login_error__p7r5K")).getText();

		// System.out.println(error_User);
		HomePage calender=new HomePage();
		calender.date_Picker(driver);
	

	

		// String incorrect_Email = "Invalid Email";
		// String incorrect_PassWord = "Invalid Password";

//		if (error_User.equals(incorrect_Email)) {
//			driver.findElement(By.id("TextField3")).clear();
//			driver.findElement(By.id("TextField3")).sendKeys("testing@128.com");
//			driver.findElement(By.id("id__13")).click();
//
//		}

	}

}

//String error_Pass = driver.findElement(By.className("Login_error__p7r5K")).getText();
////Thread.sleep(2000);
//System.out.println(error_Pass);
//System.out.println("after the username");
//if (error_Pass.equals(incorrect_PassWord)) {
//	driver.findElement(By.id("TextField8")).clear();
//	driver.findElement(By.id("TextField8")).sendKeys("HELLO123");
//	driver.findElement(By.id("id__13")).click();
//}
