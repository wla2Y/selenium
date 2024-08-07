package smokeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

import pageObjects.Actions;
import pageObjects.Assertions;

public class magentoWebsite extends Actions {
	Assertions assertion;

	@BeforeTest
	public void myBeforetest() {
		openLumaWebsite();
 	 }
	
	
	@Test( description = "Search for “Shirt” product")
	public void searchForProduct() throws InterruptedException{
		
		
		extentTest = extentReport.createTest("check Functionality","to check  functionality");
	    extentTest.log(Status.INFO, "Test Start");
		
		// search for shirt
	    driver.findElement(By.id("search")).sendKeys("shirt");
        driver.findElement( By.cssSelector("button[type='submit']")).click();
        
        
        // get random element
        List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
        Random random = new Random();
        WebElement randomProduct = products.get(random.nextInt(products.size()));
        randomProduct.click();
        
        
        // select the product options like size and color 
        
        if (driver.findElements(By.id("option-label-size-143-item-168")).size() > 0) {
            driver.findElement(By.id("option-label-size-143-item-168")).click();
       }
        if (driver.findElements(By.id("option-label-color-93-item-52")).size() > 0) {
            driver.findElement(By.id("option-label-color-93-item-52")).click();
        }   
        
        if (driver.findElements(By.id("option-label-color-93-item-56")).size() > 0) {
            driver.findElement(By.id("option-label-color-93-item-56")).click();
        }   
        
        
    //Click Add to Cart button.    
    driver.findElement(By.id("product-addtocart-button")).click(); 
    
    
    
    
      Thread.sleep(6000);
     driver.findElement(By.className("showcart")).click();
  
     
//     click on Proceed to Checkout button.
     driver.findElement(By.id("top-cart-btn-checkout")).click();
     
     
     
     //fill in all the required fields.
     Thread.sleep(3000);
     driver.findElement(By.id("customer-email")).sendKeys("CypressUser11@gmail.com");
     driver.findElement(By.name("firstname")).sendKeys("walaa");
     driver.findElement(By.name("lastname")).sendKeys("nazzal");
     driver.findElement(By.name("street[0]")).sendKeys("batra street");
     driver.findElement(By.name("street[1]")).sendKeys("batra street");
     driver.findElement(By.name("street[2]")).sendKeys("batra street");
     Select se = new Select(driver.findElement(By.name("region_id")));
     se.selectByIndex(3); 
     driver.findElement(By.name("city")).sendKeys("jubail");
     driver.findElement(By.name("company")).sendKeys("QA Comcany");
     driver.findElement(By.name("postcode")).sendKeys("000012345667");
     driver.findElement(By.name("telephone")).sendKeys("050097677");
       Thread.sleep(4000);
     driver.findElement(By.id("label_method_bestway_tablerate")).click();
     driver.findElement(By.className("button")).click();
     
     
     
     // place order 
     
      Thread.sleep(5000);
      
      driver.findElement(By.className("checkout")).click();
      Thread.sleep(3000);
      driver.findElement(By.cssSelector(".order-number span")).getText();
	}
	
	
	
//	@AfterTest
//	public void myafter() {
//		closeBrowser();
//	}
	
}
