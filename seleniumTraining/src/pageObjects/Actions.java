package pageObjects;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import support.Constants;
import support.extentReportClass;


public class Actions extends extentReportClass implements Constants {
		
	public void maximizeBrowser(){
		driver.manage().window().maximize();
	}
	
	public void openLumaWebsite() { 
		driver.get("https://magento.softwaretestingboard.com/");
	}    
	
	
	
	public void searchForShirt() { 
		  driver.findElement(By.id("search")).sendKeys("shirt");
	      driver.findElement( By.cssSelector("button[type='submit']")).click();
    } 
	
	
	
	public void getRandomElement() { 
		   List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
	        Random random = new Random();
	        WebElement randomProduct = products.get(random.nextInt(products.size()));
	        randomProduct.click();
		
		
	}
	
	public void selectProductOption() { 
		 if (driver.findElements(By.id("option-label-size-143-item-168")).size() > 0) {
	            driver.findElement(By.id("option-label-size-143-item-168")).click();
	       }
	        if (driver.findElements(By.id("option-label-color-93-item-52")).size() > 0) {
	            driver.findElement(By.id("option-label-color-93-item-52")).click();
	        }   
	        
	        if (driver.findElements(By.id("option-label-color-93-item-56")).size() > 0) {
	            driver.findElement(By.id("option-label-color-93-item-56")).click();
	        }  
	}
	
	
	public void addElementToCart() throws InterruptedException { 
		   
		 driver.findElement(By.id("product-addtocart-button")).click(); 
		 Thread.sleep(6000);
		   
		
	}
	
	
	public void getShowCart() { 
		 	
	 driver.findElement(By.className("showcart")).click();  
	  driver.findElement(By.id("top-cart-btn-checkout")).click();
	}
	

	
	public void fillShippingAdress() throws InterruptedException { 
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
	     
		}
		
	
	
	public void getPlaceeHolder() throws InterruptedException { 
		Thread.sleep(5000);
	      
	      driver.findElement(By.className("checkout")).click();
	      Thread.sleep(3000);
	      
	      driver.findElement(By.cssSelector(".order-number")).getText();
		
		}
		
	
	
	public void closeBrowser() {
		driver.close();
	}
	
   

}