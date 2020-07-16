import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.base;

public class dropDown extends base {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Animation']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Push']").click();
		driver.findElementByClassName("android.widget.Spinner").click();
		// Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("text(\"Cross fade\")").click();
		// driver.findElementByXPath("//android.widget.TextView[@text='Cross
		// fade']").click();

		System.out.println(driver.findElementByAndroidUIAutomator("text(\"Cross fade\")").getText());

		WebElement crossfade = driver.findElementByAndroidUIAutomator("text(\"Cross fade\")");

		File src = crossfade.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("shot.png"));

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src2 = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src2, new File("wholepage.png"));

	}

}
