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

public class BrowserTesting {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {

		service = new AppiumServiceBuilder().withAppiumJS(new File(
				"C:\\\\Users\\\\N1ko\\\\AppData\\\\Roaming\\\\npm\\\\node_modules\\\\appium\\\\build\\\\lib\\\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("RahulPhone");
		options.setChromedriverExecutable("C:\\Users\\N1ko\\Documents\\chromedriver.exe");
		options.setCapability("browserName", "Chrome");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public Double getFormattedAmount(String amount) {
		Double price = Double.parseDouble(amount.substring(1));
		return price;

	}

	public void longPressAction(WebElement ele,int duration) {
		driver.executeScript("mobile: LongClickGesture",
				ImmutableMap.of("elementid", ((RemoteWebElement) ele).getId(), "duration", duration));
	}

	public void Swipe(WebElement firstImage,String direction,int percent) {
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementid", ((RemoteWebElement) firstImage).getId(),
				"direction",direction,
				"percent",percent
				));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}

}
