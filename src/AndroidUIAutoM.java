import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.HybridBase;

public class AndroidUIAutoM extends HybridBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities("real");
	driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
	
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
	driver.findElementByAndroidUIAutomator("text(\"3D Transition\")").click();
//	System.out.println(driver.findElementById("android:id/list").getText());
	System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());
	
	
	
	
	}

}
