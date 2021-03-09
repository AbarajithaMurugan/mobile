 package org.baseclass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
	public static AppiumDriver driver;
	public TouchAction tc;

	public void getlaunch() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "HUAWEI Y9s");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.aegean.android");
		cap.setCapability("appActivity", "com.aegean.android.activity.HomeActivity");
		URL u = new URL("http://localhost:4723/wd/hub");
		driver = new AppiumDriver(u, cap);
		imp();

	}

	public void imp() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public void type(MobileElement mob, String text) {
		mob.sendKeys(text);

	}

	public void tap(MobileElement mob) {
		mob.click();

	}

	public String getErrorM(MobileElement mob) {
		return mob.getText();

	}

	public void dragDrop(MobileElement start, MobileElement end) {
		TouchAction tc = new TouchAction(driver);
		tc.longPress(ElementOption.element(start)).moveTo(ElementOption.element(end)).release().perform();

	}

	public void swipeup() {
		org.openqa.selenium.Dimension d = driver.manage().window().getSize();
		Double doub = d.getHeight() * 0.8;
		int startpoint = doub.intValue();
		Double doub1 = d.getHeight() * 0.2;
		int endpoint = doub.intValue();
		tc = new TouchAction(driver);
		tc.press(PointOption.point(0, startpoint)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
				.moveTo(PointOption.point(endpoint, 0)).perform().release();

	}

	public void swipeDown() {
		org.openqa.selenium.Dimension d = driver.manage().window().getSize();
		Double doub = d.getHeight() * 0.2;
		int startpoint = doub.intValue();
		Double doub1 = d.getHeight() * 0.8;
		int endpoint = doub.intValue();
		tc = new TouchAction(driver);
		tc.press(PointOption.point(0, startpoint)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
				.moveTo(PointOption.point(endpoint, 0)).perform().release();

	}
}
