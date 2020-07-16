import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.HybridBase;
import resources.base;
import resources.baseChrome;

public class AccessibilityPage extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Accessibility\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Accessibility Node Querying\")").click();
		driver.findElementsByClassName("android.widget.CheckBox").get(2).click();
	}

}
