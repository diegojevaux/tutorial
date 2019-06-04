import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
// import io.appium.java_client.android.AndroidKeyCode; // deprecated
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Misc extends Base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver <AndroidElement> driver = capabilities(); //call this in every test case
		
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext()); //views: Native, hybrid, Webview 
		System.out.println(driver.getOrientation()); //landscape or portrait
		System.out.println(driver.isDeviceLocked());
		// driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
		


	}

}
