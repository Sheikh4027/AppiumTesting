import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.base;

public class DragandDrop extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		TouchAction ta= new TouchAction(driver);
		
		WebElement drag=driver.findElementsByClassName("android.view.View").get(0);
		WebElement drop=driver.findElementsByClassName("android.view.View").get(2);
		
		//ta.longPress(longPressOptions().withElement(element(drag)).withDuration(ofSeconds(2))).moveTo(element(drop)).release().perform();
		
		ta.longPress(element(drag)).moveTo(element(drop)).release().perform();
	
	
	}

}
