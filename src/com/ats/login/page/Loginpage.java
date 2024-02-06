package com.ats.login.page;

import java.awt.Robot;
import java.text.DateFormatSymbols;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthToggleButtonUI;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
//comment in git hub in repo
	Loginpage(WebDriver driver) {

		driver.get("https://sight-spectrum-ats.vercel.app/login");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[3]/div[1]/div[1]/div/div/input"))
				.sendKeys("testing@128.com");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[3]/div[1]/div[3]/div/div/input"))
				.sendKeys("HELLO123");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/button/span")).click();
	}

	static void collapse_icon(WebDriver driver) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"collapseId\"]")).click();
	}

	static void demand_Page(WebDriver driver) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/button"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[2]/button"))
				.click();
		// Entering the Requiremnent
		driver.findElement(By.xpath("//*[@id=\"TextField51\"]")).sendKeys("SQL DEVELOPER");
		// Selecting the Unassigned
		// driver.findElement(By.xpath("//*[@class=\"AddDemandModal_unassigned_title_icon_container__B6e82\"]")).click();
		// Select sel=new
		// Select(driver.findElement(By.xpath("//*[@class=\"AddDemandModal_unassigned_title_icon_container__B6e82\"]")));
		// Select sel=new
		// Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div")));
		// sel.selectByValue("Aravind Baskaran");
		// sel.selectByVisibleText("Aravind Baskaran");
		// int sele=1;
//			List< WebElement> drop_Down=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/div[2]"));
//			
//			String option ="5";
//			
//			for(int i=0;i<drop_Down.size();i++) {
//				if(drop_Down.get(i).getText().contains(option)) {
//					drop_Down.get(i).click();
//					break;
//				}
//			}

	}

	public void unAssigned(WebDriver driver) throws Exception {
		// Robot robo = new Robot();
		driver.findElement(By.xpath("//*[@id=\"personaId\"]/div/div[1]")).click();

	
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,300)", "");	
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		List<WebElement> drop_Down = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/div[2]"));

		String option = "2";
		for (WebElement we : drop_Down)
			System.err.println(we.getText());

		for (int i = 0; i < drop_Down.size(); i++) {
			if (drop_Down.get(i).getText().contains(option)) {
				drop_Down.get(i).click();
				break;
			}
		}

	}

	public void status_Check(WebDriver driver) {
		String option = "In Progress";
		driver.findElement(By.xpath("//*[@id=\"Dropdown59-option\"]")).click();
		List<WebElement> status = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		for (WebElement elw : status)
			System.out.println(elw.getText());
		for (int i = 0; i < status.size(); i++) {

			if (status.get(i).getText().equals(option)) {
				status.get(i).click();
			}

		}

	}

	public void Priority(WebDriver driver) {

		driver.findElement(By.xpath("//*[@id=\"Dropdown65-option\"]")).click();
		String select = "Medium";
		List<WebElement> priority = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));
		for (WebElement we : priority) {
			System.err.println(we.getText());
			if (we.getText().equals(select)) {
				System.out.println(we.getText());
				priority.get(2).click();
				break;

			}

//		for(int i=0;i<priority.size();i++) {
//			if(priority.get(i).getText().equals(select)) {
//				priority.get(i).click();
//				break;
//			}

		}
	}

	public void no_Of_Postion(WebDriver driver) {

		// driver.findElement(By.xpath("//*[@id=\"TextField2348\"]")).sendKeys(String.valueOf(2));
		driver.findElement(By.xpath("//*[@id=\"TextField60\"]")).sendKeys("3");
		// String.valueOf(2) For converting the Int from String;
	}

	public void Client(WebDriver driver) {

		driver.findElement(By.xpath("//*[@id=\"TextField66\"]")).sendKeys("infoSys");
	}

	public void calender_Picker(WebDriver driver) throws Exception {

		driver.findElement(By.xpath("//*[@id=\"DatePicker71-label\"]")).click();
		Thread.sleep(1000);
		String expected_Year = "2025";

		String actual_Month = driver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[1]/span"))
				.getText();
		System.out.println(actual_Month);
		// String Sliced_Month[] = Expected_month.split(" ");

		WebElement actual_Year1 = driver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/button"));
		String actual_Year = actual_Year1.getText();
		System.out.println(actual_Year);
		int click_Button = Integer.parseInt(expected_Year) - Integer.parseInt(actual_Year);
		System.out.println(click_Button);
		System.out.println("expected Output" + expected_Year);

		WebElement select_Next_Year = driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/div/button[1]"));
		WebElement select_Prev_Year = driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/div/button[2]"));
		if (click_Button <= 0) {

			for (int i = click_Button; i < 0; i++) {

				select_Next_Year.click();

				if (Integer.parseInt(expected_Year) == Integer.parseInt(actual_Year))
					break;

			}

		}
		if (click_Button >= 0) {

			for (int i = click_Button; i > 0; i--) {

				select_Prev_Year.click();
				if (Integer.parseInt(expected_Year) == Integer.parseInt(actual_Year))
					break;

			}

		}
		System.out.println(" from web page" + ""
				+ driver.findElement(
						By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/button"))
						.getText());

//selecting Month

		String current_Month = driver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[1]/span"))
				.getText();
		String expected_Month = "feb";
		System.err.println(current_Month);
		String get_Month[] = current_Month.split(" ");
		String splited = get_Month[0].substring(0, 3);
		System.err.println(splited);
		List<WebElement> month_Table = driver.findElements(
				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[2]/div/div/button"));
		for (WebElement mont_Ele : month_Table) {
			System.out.println(mont_Ele.getText());
			if (mont_Ele.getText().equalsIgnoreCase(expected_Month)) {
				mont_Ele.click();
				break;
			}
		}

//for selecting dates
		List<WebElement> dates = driver.findElements(
				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td"));
		int count = 0;
		String date_Expected = "10";
		int intial_limit, search_limit, date_Chosser = 1;

		if (Integer.parseInt(date_Expected) > 15) {
			intial_limit = 5;
			search_limit = 8;
		} else {
			intial_limit = 3;
			search_limit = 5;
		}

// for date Search

//System.out.println(intial_limit+"     ------   " +search_limit);
try {
		for (int i = intial_limit; i <= search_limit; i++) {

			for (int j = date_Chosser; j <= 7; j++) {

				System.out.println("this is i value " + i + " this is j value" + j);

				if (date_Expected.equals(driver.findElement(
						By.xpath("html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr[" + i
								+ "]/td[" + j + "]/button"))
						.getText().toString())) {

					System.out.println("it is");
					driver.findElement(
							By.xpath("html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr["
									+ i + "]/td[" + j + "]/button"))
							.click();
					break;
				}
			}
		}
}
catch (Exception e) {
	System.out.println(e);
}
//		for(WebElement date_list:dates) {
//		System.err.println(date_list);
//			if(date_list.getText().equals(date_Expected)) {
//				//System.out.println(date_list.isDisplayed());
//				String current_Month_Test = driver
//						.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[1]/span"))
//						.getText();
//				
//				date_list.click();
//			
//			//System.out.println(date_list.getAccessibleName());
//			System.out.println(current_Month_Test);
//			break;
//			}
//		count++;	 
//		}
//		System.out.println(count);
//		

//		
//		while (Integer.parseInt(expected_Year) <= Integer.parseInt(actual_Year)) {
//			if (Integer.parseInt(expected_Year) == Integer.parseInt(actual_Year)) {
//				break;
//			} else {
//				if (Integer.parseInt(expected_Year) <= Integer.parseInt(actual_Year)) {
//					driver.findElement(By.xpath(
//							"/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/div/button[1]"))
//							.click();
//				}
//			}
//		}
//		while (Integer.parseInt(expected_Year) >= Integer.parseInt(actual_Year)) {
//			if (Integer.parseInt(expected_Year) == Integer.parseInt(actual_Year)) {
//				break;
//			}
//
//			else {
//				if (Integer.parseInt(expected_Year) >= Integer.parseInt(actual_Year)) {
//
//					driver.findElement(By.xpath(
//							"/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/div/button[2]"))
//							.click();
//				}
//			}
//
//		}

//for getting date from WebPage
//		List<WebElement> date = driver.findElements(
//				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td"));
//		for (WebElement we : date) {
//			System.out.println(we.getText());
//		}

//-----------Month Getter From JavaDate Class	
//		List<String> monthsList = new ArrayList<String>();
//		String[] months = new DateFormatSymbols().getMonths();
//		for (int i = 0; i < months.length - 1; i++) {
//			monthsList.add(months[i]);
//		}
//
//		if (Sliced_Month.equals(monthsList)) {
//
//		} else {
//
//		}

//		Map<Integer, String> month_Picker = new HashMap<Integer, String>();
//		// System.out.println(monthsList.toString());
//		for (int i = 0; i <= monthsList.size() - 1; i++) {
//			month_Picker.put(i, monthsList.get(i));
//		}
//		System.out.println(month_Picker.toString());
//
//		
//	System.out.println(Arrays.toString(Sliced_Month));
//	System.out.println(monthsList.contains(Sliced_Month[0]));
//	
//	if(monthsList.contains(Sliced_Month[0])) {
//		
//		System.out.println( monthsList.indexOf(Sliced_Month[0]));
//		
//	}
//		
//
//		WebElement pre_Month = driver.findElement(
//				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/button[1]"));
//		WebElement next_Month = driver.findElement(
//				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/button[2]"));
		// driver.quit();
//		boolean des_Date_Picker=true;
//		while(des_Date_Picker) {
//		if(actual_Month.equals(Expected_month)) {
//			System.out.println("is Entered in the loop");
//		}
//		else  {
//			//for deciding the month changer
//		}
//	}

	}

	public void selecting_Month(WebDriver driver) {
		// For selecting Month

	}

	public void notice_Period(WebDriver driver) {

		driver.findElement(By.xpath("//*[@id=\"Dropdown80-option\"]")).click();

		/*
		 * < 15 Days < 30 Days < 60 Days > 60 Days
		 */
		Map<Integer, String> seletable = new HashMap<Integer, String>();
		seletable.put(0, "< 15 Days");
		seletable.put(1, "< 30 Days");
		seletable.put(2, "< 60 Days");
		seletable.put(3, "> 60 Days");
		String notice_Duration = "> 60 Days";
		System.out.println("-----------");

		System.out.println(seletable.equals(notice_Duration));
		List<WebElement> collection_Noitce = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span"));

//		TreeMap<Integer,WebElement> clone= new TreeMap <Integer, WebElement> ();
//		for(int i=0;i<collection_Noitce.size();i++) {
//			clone.put(clone.isEmpty()?0:clone.lastKey()+1, (WebElement) driver.findElements
//					(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span")));
//		}
//		for(Map.Entry g:clone.entrySet()) {
//			
//		}

		for (WebElement element : collection_Noitce) {
			if (element.getText().equals(notice_Duration)) {

				for (Map.Entry m : seletable.entrySet()) {
					if (element.getText().equals(m.getValue().toString())) {
						System.out.println(collection_Noitce.get((int) m.getKey()).toString());

						collection_Noitce.get((int) m.getKey()).click();

					}
				}
				// collection_Noitce.get(seletable.containsValue(element.getText()))
			}
			// System.out.println(element.getText());
		}

	}

	public void mode_Of_Hire(WebDriver driver) {

		String c2H = "C2H (contract to Hire)";
		driver.findElement(By.xpath("//*[@id=\"Dropdown83-option\"]")).click();
		List<WebElement> element = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span"));
		for (WebElement ele : element) {
			// System.out.println(ele.getText());
			if (ele.getText().equals(c2H)) {
				ele.click();
				break;
			}
		}
	}

	public void minimum_experience(WebDriver driver) {
		String year = "10 years";
		String month = "4 Months";
//		driver.findElement(By.xpath(
//				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div/div/div"))
//				.click();
//
//		List<WebElement> element = driver
//				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span"));
//		List<WebElement> element_Year = driver
//				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));
//		for (WebElement ele : element) {
//			if (ele.getText().equals(year)) {
//				ele.click();
//				driver.findElement(By.xpath(
//						"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div"))
//						.click();
//				
//				for (WebElement we : element_Year)
//					if (we.getText().equals(month)) {
//						we.click();
//						
//					}
//				break;
//			}
//			System.out.println(ele.getText());
//	}
		WebElement click_Month = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div/div/div/span[1]"));
		WebElement click_Year = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/span[1]"));

		click_Month.click();
		List<WebElement> month_List = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));
		for (WebElement data : month_List) {
			if (data.getText().equals(month)) {
				data.click();
				break;
			}
		}

		click_Year.click();
		List<WebElement> year_List = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span"));
		for (WebElement data : year_List) {
			if (data.getText().equals(year)) {
				data.click();
				break;
			}
		}

	}

	public void maximum_Experience(WebDriver driver) {

		String year = "2 years";
		String month = "4 Months";
//		driver.findElement(By.xpath(
//				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div/div/div"))
//				.click();
//		List<WebElement> element = driver
//				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));
//		for (WebElement ele : element) {
//			if (ele.getText().equals(year)) {
//				ele.click();
//				driver.findElement(By.xpath(
//						"/html/body/div[2]/div[1]/div/div/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div/div/div"))
//						.click();
//				List<WebElement> element_month = driver
//						.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));
//				for (WebElement el : element_month)
//					if (el.getText().equals(month)) {
//						System.out.println(el.getText());
//						el.click();
//						break;
//					}
//
//				break;
//			}
//		}

		WebElement select_Month = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div/div/div/span[1]"));
		WebElement select_Year = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div/div/div/span[1]"));

		select_Month.click();
		List<WebElement> month_List = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));
		for (WebElement data : month_List) {
			if (data.getText().equals(month)) {
				data.click();
				break;
			}
		}

		select_Year.click();
		List<WebElement> year_List = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span"));
		for (WebElement data : year_List) {
			if (data.getText().equals(year)) {
				data.click();
				break;
			}
		}

	}

	public void vendor_Name(WebDriver driver) {

		driver.findElement(By.xpath("//*[@id=\"TextField84\"]")).sendKeys("SightSpectrum Technology");
	}

	public void point_Of_Contact(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"TextField89\"]")).sendKeys("Ganeshan");
	}

	public void job_Rr_Id(WebDriver driver) {

		driver.findElement(By.xpath("//*[@id=\"TextField94\"]")).sendKeys("10727");

	}

	public void job_Discription(WebDriver driver) {

		String description = "Ensure mangae the entire project";
		driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div"))
				.sendKeys(description);

	}

	public void additional_Information(WebDriver driver) {

		String description = "have good communication skill and excellent educational qulalification";
		WebElement find = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div"));
		find.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/img[1]"))
				.click();
		find.sendKeys(description);
	}

	public void primary_Skill_Set(WebDriver driver) {

		driver.findElement(By.xpath("//*[@id=\"TextField102\"]")).sendKeys("Machine Learning");
	}

	public void releavent_Skill_Experience(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"TextField112\"]")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"TextField107\"]")).sendKeys("0");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/i"))
				.click();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SSLTP11355\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Loginpage firefox = new Loginpage(driver);
		Loginpage.collapse_icon(driver);
		Loginpage.demand_Page(driver);
		firefox.unAssigned(driver);
		firefox.status_Check(driver);
		firefox.Priority(driver);
		firefox.no_Of_Postion(driver);
		firefox.Client(driver);
		firefox.calender_Picker(driver);
		firefox.selecting_Month(driver);
		firefox.notice_Period(driver);
		firefox.mode_Of_Hire(driver);
		firefox.minimum_experience(driver);
		firefox.maximum_Experience(driver);
		firefox.vendor_Name(driver);
		firefox.point_Of_Contact(driver);
		firefox.job_Rr_Id(driver);
		firefox.job_Discription(driver);
		firefox.additional_Information(driver);
		firefox.primary_Skill_Set(driver);
		firefox.releavent_Skill_Experience(driver);
//		driver.quit();

	}

}
