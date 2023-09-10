package AndroidIOSTesting.Appium;

import org.testng.annotations.Test;


import Helper.apkTesting;
import io.appium.java_client.AppiumBy;

public class LongPressPractice extends apkTesting {
	
	@Test
	public void longPress() {
		
		driver.findElement(AppiumBy.accessibilityId("views")).click();
		
		
		
	}

}
