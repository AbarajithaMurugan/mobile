package com.pages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ClickablePages extends BaseClass {
	public ClickablePages() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
private MobileElement locaccess;
//	@AndroidFindBy(id="com.aegean.android:id/notification_icon")
//	private MobileElement close;
//	@AndroidFindBy(id="com.aegean.android:id/notification_icon")
//	private MobileElement close2;
	public MobileElement getLocaccess() {
		return locaccess;
	}
//	public MobileElement getClose() {
//		return close;
//	}
//	public MobileElement getClose2() {
//		return close2;
//	}
	public void click() {
	tap(getLocaccess());
	//tap(getClose());
	//tap(getClose2());
	

	}
}


