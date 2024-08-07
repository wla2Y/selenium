package pageObjects;

import org.openqa.selenium.By;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.aventstack.extentreports.Status;
import support.Constants;
import support.extentReportClass;

public class Assertions extends extentReportClass implements Constants {
	
	
	
	public void checkOrderExist(String message) {
		
		
	Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")).getText(),message);
	
	
	}
	
	
	
	
	
	
	
}