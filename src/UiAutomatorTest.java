import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomatorTest extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver <AndroidElement> driver = capabilities(); //call this in every test case
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByAndroidUIAutomator("attribute("value")") - ATTENTION THIS IS FOR ATTRIBUTES
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//validate clickable feature for all options - ATTETION THIS IS FOR PROPERTIES (stuff with true/false)
		//driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		

		
		
		
	}

}
