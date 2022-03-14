package com.stepdefin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager


public class StepDefinfb {
	
	@Given("User launch Facebook Web Application")
	public void user_launch_Facebook_Web_Application() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    throw new cucumber.api.PendingException();
	}

	//@Then("User verify Facebook Login Page is displayed")
	//public void user_verify_Facebook_Login_Page_is_displayed() {
		
	   // throw new cucumber.api.PendingException();
	//}

	@When("User enter valid username and Invalid password")
	public void user_enter_valid_username_and_Invalid_password() {
	
	    throw new cucumber.api.PendingException();
	}

	@When("User clicks Login Button")
	public void user_clicks_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user verify error message is displayed")
	public void user_verify_error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User clicks on create new account button")
	public void user_clicks_on_create_new_account_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User verifies signup text is displayed")
	public void user_verifies_signup_text_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters invalid {string} and {string}")
	public void user_enters_invalid_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
}
