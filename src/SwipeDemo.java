import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.HybridBase;

public class SwipeDemo extends HybridBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities("real");
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.findElementByXPath("(//android.widget.TextView[@text='Date Widgets'])").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		TouchAction ta= new TouchAction(driver);
		
		WebElement minutes=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement Secondminutes=driver.findElementByXPath("//*[@content-desc='45']");
		
		ta.longPress(longPressOptions().withElement(element(minutes)).withDuration(ofSeconds(2))).moveTo(element(Secondminutes)).release().perform();
		
	
	
	}

}
