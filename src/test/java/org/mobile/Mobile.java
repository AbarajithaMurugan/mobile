package org.mobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Mobile {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Navin");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.aegean.android");
		cap.setCapability("appActivity", "com.aegean.android.activity.MainTabBarActivity");
		URL u=new URL("http://localhost:4723/wd/hub");
		AppiumDriver<WebElement> driver=new AppiumDriver<WebElement>(u, cap);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.aegean.android:id/notification_icon")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.aegean.android:id/notification_icon")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("android.widget.ImageButton")).click();
		
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("android.widget.EditText")).sendKeys("abara");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View[3]/android.view.View/android.view.View[12]/android.widget.EditText\r\n" + 
				"")).sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View[9]/android.widget.Button\r\n" + 
				"")).click();
		
	}

}
