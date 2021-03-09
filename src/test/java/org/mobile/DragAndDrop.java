package org.mobile;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.types.resources.Touchable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DragAndDrop {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Realme");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.navigation.MainActivity");
		URL u=new URL("http://localhost:4723/wd/hub");
		AppiumDriver<WebElement> driver=new AppiumDriver<WebElement>(u, cap);
		Thread.sleep(200000);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("com.aegean.android:id/book_a_flight_button")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("com.aegean.android:id/notification_icon")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("com.aegean.android:id/teaser_background")).click();
		
		driver.findElement(By.className("android.view.View")).click();
		//driver.findElement(By.id("android.view.View")).click();
		
      org.openqa.selenium.Dimension size= driver.manage().window().getSize();
     Double start= size.getHeight()*0.5;
   int swipestart=  start.intValue();
   Double end=size.getHeight()*0.2;
   int swipeend=end.intValue();
   
   TouchAction tc=new TouchAction(driver);
   Thread.sleep(2000);
   tc.press(PointOption.point(0, swipestart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4))).moveTo(PointOption.point(0, swipeend)).release().perform();
   
     
     
	}

}
