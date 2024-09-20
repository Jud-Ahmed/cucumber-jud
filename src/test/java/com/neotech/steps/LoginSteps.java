package com.neotech.steps;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	LoginPageElements login;
	DashboardPageElements dashboard;

	@Given("I navigated to HRM website")
	public void i_navigated_to_hrm_website() {
		setUp();
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
	}

	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(login.username, ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I click on the submit button")
	public void i_click_on_the_submit_button() {
		click(login.loginBtn);
	}

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();

		if (expected.equals(actual)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed!!!");
		}
	}

	@Then("I quit the browser")
	public void i_quit_the_browser() {
		tearDown();
	}

	@When("I enter an invalid password")
	public void i_enter_an_invalid_password() {
		sendText(login.password, "WrongPassword!");
	}

	@Then("I validate that Invalid Credentials is displayed")
	public void i_validate_that_invalid_credentials_is_displayed() {
		String expected = "Invalid Credentials";
		String actual = login.invalidMsg.getText();

		if (expected.equals(actual)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed!!!");
		}
	}
}
