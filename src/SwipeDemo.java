import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element; //needs to import manually
import static io.appium.java_client.touch.LongPressOptions.longPressOptions; //needs to import manually
import static java.time.Duration.ofSeconds; //needs to import manually
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;

public class SwipeDemo extends Base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver <AndroidElement> driver = capabilities(); //call this in every test case

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();   // * any tagname is acceptable
		
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		// swipe action
		// long press on element -> 2 secs -> move to another element ->  release -> perform
		WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement last = driver.findElementByXPath("//*[@content-desc='45']");
		touch.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(last)).release().perform();
		
		

		


	}

}
