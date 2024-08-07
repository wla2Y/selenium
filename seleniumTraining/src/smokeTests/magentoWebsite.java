package smokeTests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.Actions;
import pageObjects.Assertions;


public class magentoWebsite extends Actions {
	Assertions assertion;
	String message = "Thank you for your purchase!";
	
	
@BeforeTest
	public void myBeforetest() {
		openLumaWebsite();
 	 }
	
	
@Test( description = "buying  “Shirt” product")
	public void searchForProduct() throws InterruptedException{
		
		searchForShirt();
		getRandomElement();
		selectProductOption();
		 addElementToCart();
         getShowCart() ;
         fillShippingAdress();
         getPlaceeHolder();
       assertion.checkOrderExist(message);
   }
	
@AfterTest
	public void myafter() {
		closeBrowser();
	}
	
}
