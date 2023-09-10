package AndroidIOSTesting.Appium;


import java.net.MalformedURLException;



import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import Helper.apkTesting;

public class AppiumBasics extends apkTesting {

	@Test
	public void WifiSettingsName() throws MalformedURLException {
		// code to start server
		// AndroidDriver , IOSDriver
		// Appium code - > Appium Server -> Mobile
		// Actual automation
		// Xpath, id, accessibilityId, classname, androidUIAutomator

		// tagName[@attribute='value'] -> //tagName
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//a ndroid.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Rahul Wifi");

		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

		// set wifi name

	}

//	@Test
//	public void AppiumTest() throws MalformedURLException {
////Starting the server using the Automated Scripting
////		AppiumDriverLocalService service = new AppiumServiceBuilder()
////				.withAppiumJS(new File("C:\\Users\\N1ko\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
////				.withIPAddress("127.0.0.1").usingPort(4723).build();
////		service.start();
//
////		StartHelper helper = new StartHelper();
////				UiAutomator2Options options = new UiAutomator2Options();
////		options.setDeviceName("LukaEmulator");
////		options.setApp("C:\\Users\\N1ko\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
//
//		// Start service till here using the IP Address and the port of the local
//		// machine
////		options.setDeviceName("LukaEmulator");
////		options.setApp("C:\\Users\\N1ko\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
//
//		WebElement element = driver.findElement(AppiumBy.accessibilityId("Preference"));
//		element.click();
//
//	}

}
