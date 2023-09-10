package AndroidIOSTesting.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.apkTesting;
import io.appium.java_client.AppiumBy;

public class testWifiSettings extends apkTesting {

	@Test
	public void testAndroid() {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(
				By.xpath("	\r\n" + "//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout"))
				.click();
		
		String information = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView")).getText();
		String expected = "Example preference dependency";
		
		Assert.assertEquals(information, expected);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
		
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("LukaDato");
		
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		

	}

}
