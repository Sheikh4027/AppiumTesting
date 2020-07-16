import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import resources.base;

public class Gestures extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement expands=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		
		TouchAction ta = new TouchAction(driver);
		
		ta.tap(tapOptions().withElement(element(expands))).perform();
		driver.findElementById("android:id/text1").click();
		
		WebElement peoples=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		ta.longPress(longPressOptions().withElement(element(peoples)).withDuration(ofSeconds(2))).release().perform();
		
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
	}

}
