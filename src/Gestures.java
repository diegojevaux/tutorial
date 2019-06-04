import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions; //needs to import manually
import static io.appium.java_client.touch.offset.ElementOption.element; //needs to import manually
import static io.appium.java_client.touch.LongPressOptions.longPressOptions; //needs to import manually
import static java.time.Duration.ofSeconds; //needs to import manually
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;

public class Gestures extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver <AndroidElement> driver = capabilities(); //call this in every test case
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Tap command
		// TouchAction t = new TouchAction(driver); USE AndroidTouchAction OR IOSTouchAction 
		
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		touch.tap(tapOptions().withElement(element(expandList))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");

		touch.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElementById("android:id/title").isDisplayed());

		
		
		
	}

}
