import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.HybridBase;

public class Scrolling extends HybridBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		AndroidDriver<AndroidElement> driver=Capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		
		driver.findElementByAndroidUIAutomator("text(\"WebView\")").click();

		 driver.findElementByClassName("android.view.ViewGroup").click();
			
	System.out.println(driver.findElementByAndroidUIAutomator("text(\"This page is a Selenium sandbox\")").getText());
	
	
	
	}

}
