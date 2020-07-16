

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.baseChrome;

public class browserTesting extends baseChrome {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		//driver.get("http://google.com");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get("http://facebook.com");
		 
		driver.findElementByXPath("//*[@id=\"m_login_email\"]").sendKeys("Tufail");
		 
		driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("123456");
	

		driver.hideKeyboard();
		
		Thread.sleep(1000);
		 
		driver.findElementByXPath("//button[@value='Log In']").click();
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
