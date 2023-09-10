package AndroidIOSTesting.Appium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.apkTesting;
import io.appium.java_client.AppiumBy;

public class SwipeTest extends apkTesting{
	
	
	@Test
	public void testing() {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();;
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	
		//Swipe
		
		//WebElement locator for the second image or any image you wish in this case its 2 starting from 0
		WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		//getting the attribute focuse (Boolean) true when focused 
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
		//Casting the method called swipe customized
		swipeAction(firstImage, "left",0.75);
		//then checking if the focusable has became false after not focused to the same element 
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");
		
		//then the after the method class going to be executed to close the App coming from the apkTesting 
		
		
	}

}
