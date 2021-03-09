package com.pages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

//	@AndroidFindBy(className = "android.widget.ImageButton")
//	private MobileElement icon;
//	@AndroidFindBy(className = "android.view.View")
//	private MobileElement deny;
	@AndroidFindBy(id = "com.aegean.android:id/nag_screen_member_id")
	private MobileElement user;
	@AndroidFindBy(id = "com.aegean.android:id/nag_screen_password")
	private MobileElement pwd;
	@AndroidFindBy(id ="com.aegean.android:id/nag_screen_login_button")
private MobileElement login;
//
//	public MobileElement getIcon() {
//		return icon;
//	}
//
//	public MobileElement getDeny() {
//		return deny;
//	}

	public MobileElement getUser() {
		return user;
	}

	public MobileElement getPwd() {
		return pwd;
	}

	public MobileElement getLogin() {
		return login;
	}

	public void login(String ussername, String password) {
//		tap(getIcon());
//		tap(getDeny());
		type(getUser(), ussername);
		type(getPwd(), password);
		tap(getLogin());

	}
}
