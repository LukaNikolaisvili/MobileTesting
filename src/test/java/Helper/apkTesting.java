package Helper;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class apkTesting {
	
	public static  AndroidDriver driver;
	public static AppiumDriverLocalService service;
	
	
	
	@BeforeClass
	public static void startServer() throws MalformedURLException {
		 service = new AppiumServiceBuilder()
				.withAppiumJS(new File("C:\\Users\\N1ko\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();

		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("LukaEmulator");
		options.setApp("C:\\Users\\N1ko\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
//		options.setChromedriverExecutable("C:\\Users\\N1ko\\Documents\\chromedriver.exe");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void longPressAction(WebElement ele,int duration) {
		driver.executeScript("mobile: LongClickGesture",
				ImmutableMap.of("elementid", ((RemoteWebElement) ele).getId(), "duration", duration));
	}

	public void swipeAction(WebElement ele,String direction,double percentage)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", percentage
			));
	}
	
	public void dragAndDrop(WebElement element,int x,int y) {
	// Java
	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
	    "elementId", ((RemoteWebElement) element).getId(),
	    "endX", x,
	    "endY", y
	));
	}
	
	
	@AfterClass
	public static void stopServer() {
		 driver.quit();
		 service.stop();
		 
	}


}
