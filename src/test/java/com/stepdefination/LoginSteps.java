package com.stepdefination;

import java.net.MalformedURLException;

import org.baseclass.BaseClass;

import com.pages.ClickablePages;
import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseClass {
	public ClickablePages cp;
	public LoginPage lp;

	@Given("user click the my profile icon on home page")
	public void user_click_the_my_profile_icon_on_home_page() throws MalformedURLException {
		getlaunch();
		cp = new ClickablePages();
		cp.click();
	}

	@When("User give the {string} and {string}")
	public void user_give_the_and(String string, String string2) throws InterruptedException {
		Thread.sleep(2000);
		lp = new LoginPage();
		lp.login(string, string2);

	}

	@Then("Verify the error message")
	public void verify_the_error_message() {

	}

}
