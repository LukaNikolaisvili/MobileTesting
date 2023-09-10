package AndroidIOSTesting.Appium;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import Helper.BrowserTesting;


public class testingGoogleChrome extends BrowserTesting{
	
	@Test
	public void testChrome() throws MalformedURLException, InterruptedException {
		
		driver.get("https://facebook.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(10000);
		
		driver.close();
	}

}
