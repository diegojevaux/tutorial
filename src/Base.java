// import java.io.File;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Base {

	/*
	 * public static void main(String[] args) throws MalformedURLException {
	 * capabilities(); }
	 */

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		//File f = new File ("src");
		//File fs = new File (f, "ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		cap.setCapability("clearSystemFiles", true);

		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
		

	}

}
