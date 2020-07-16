import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.HybridBase;

public class Basic extends HybridBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver=Capabilities("emulator");
		
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		//Thread.sleep(1000);
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();    // using index for locating.
		driver.findElementByClassName("android.widget.EditText").sendKeys("1234");
		//driver.findElementsByClassName("android.widget.Button").get(1).click();   // if there is no ecxact locator.
		
		driver.findElementById("android:id/button1").click();                      // by ID
		
	
	
	
	
	
	
	
	}

}
