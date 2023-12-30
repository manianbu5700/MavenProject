package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_1 {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\selinumconcept\\driver\\chromedriver.exe");
 	WebDriver auto=new ChromeDriver();
 	auto.get("https://adactinhotelapp.com/");
 	Options manage = auto.manage();	         								 	 	 
 	Window window = manage.window();
 	window.maximize();
 	WebElement username = auto.findElement(By.xpath("//input[@name='username']"));
 	username.sendKeys("ManikandanA5700");
 	WebElement password = auto.findElement(By.xpath("//input[@id='password']")); 
 	password.sendKeys("mani_12345@");
 	WebElement login = auto.findElement(By.xpath("//input[@name='login']"));
 	login.click();
 	WebElement multiple = auto.findElement(By.xpath("//select[@id= 'location']"));
 	Select s=new Select(multiple);
 	s.selectByIndex(6);
 	Thread.sleep(1000);
 	
 	WebElement hotel = auto.findElement(By.xpath("//select[@name='hotels']"));
 	Select s1=new Select(hotel);
 	s1.selectByIndex(2);
 	Thread.sleep(1000);
 	
 	WebElement roomtype = auto.findElement(By.xpath("//select[@id='room_type']"));
 	Select s2=new Select(roomtype);
 	s2.selectByValue("Deluxe");
 	Thread.sleep(1000);
 	
 	WebElement roomnos = auto.findElement(By.xpath("//select[@name='room_nos']"));
 	Select s3=new Select(roomnos);
 	s3.selectByVisibleText("3 - Three");
 	Thread.sleep(1000);
 	
 	WebElement datepic = auto.findElement(By.xpath("//input[@id='datepick_in']"));
 	datepic.sendKeys("");
 	Thread.sleep(1000);
 	
 	WebElement datepickout = auto.findElement(By.xpath("//input[@id='datepick_out']"));
 	datepickout.sendKeys("");
 	Thread.sleep(1000);
 	
 	WebElement comobox = auto.findElement(By.xpath("//select[@id='adult_room']"));
 	Select s4=new Select(comobox);
 	s4.selectByVisibleText("4 - Four");
 	Thread.sleep(1000);
 	
 	WebElement childroom = auto.findElement(By.xpath("//select[@name='child_room']"));
	Select s5=new Select(childroom);
	s5.selectByIndex(3);
	Thread.sleep(1000);
	
	s5.selectByValue("1");
	Thread.sleep(1000);
	
	s5.selectByVisibleText("3 - Three");
	Thread.sleep(1000);
	
	WebElement search = auto.findElement(By.xpath("//input[@value='Search']"));
	search.click();
	WebElement radio = auto.findElement(By.xpath("//input[@type='radio']"));
	radio.click();
	WebElement continued = auto.findElement(By.xpath("//input[@name='continue']"));
	continued.click();
	auto.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Manikandan");
	auto.findElement(By.xpath("//input[@name='last_name']")).sendKeys("A");
	Thread.sleep(1000);
	
	WebElement address = auto.findElement(By.xpath("//textarea[@name='address']"));
	address.sendKeys("No/19nerustreat,thiruvannamalai");
	Thread.sleep(1000);
	
	WebElement input = auto.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
	input.sendKeys("6353645364123463");
	Thread.sleep(1000);
	
	WebElement find = auto.findElement(By.xpath("//select[@id='cc_type']"));
	Select s9=new Select(find);
	s9.selectByVisibleText("Master Card");
	Thread.sleep(1000);
	
	WebElement month = auto.findElement(By.xpath("//select[@id='cc_exp_month']"));
	Select s7=new Select(month);
	s7.selectByValue("1");
	Thread.sleep(1000);
	
	WebElement year = auto.findElement(By.xpath("//select[@name='cc_exp_year']"));
	Select s8=new Select(year);
	s8.selectByVisibleText("2022");
	Thread.sleep(1000);
	
	WebElement number = auto.findElement(By.xpath("//input[@name='cc_cvv']"));
	number.sendKeys("2000");
	Thread.sleep(1000);
	
	WebElement ok = auto.findElement(By.xpath("//input[@value='Book Now']"));
	ok.click();
	Thread.sleep(5000);
	
	WebElement my = auto.findElement(By.xpath("//input[@name='my_itinerary']"));
	my.click();
	Thread.sleep(5000);
	
	WebElement logout = auto.findElement(By.xpath("//input[@value='Logout']"));
	logout.click();
	Thread.sleep(1000);
	
	Navigation navi = auto.navigate();
	navi.back();
	auto.quit();
	          		
	}

}


