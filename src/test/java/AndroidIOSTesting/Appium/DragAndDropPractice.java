package AndroidIOSTesting.Appium;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.apkTesting;
import io.appium.java_client.AppiumBy;

public class DragAndDropPractice extends apkTesting{
	
	
	@Test
	public void testDragAndDrop() {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		WebElement firstDot = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement secondDot = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));
		dragAndDrop(firstDot,830,720);
		
		WebElement result = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text"));
		String actualResult = result.getText();
		System.out.println(actualResult);
		
		Assert.assertEquals(actualResult,"Dropped!");
		
	}

}
