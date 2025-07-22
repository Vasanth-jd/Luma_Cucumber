package com.stepDefinitions;

import com.pageObjectManager.PageObjectManager;
import com.pageObjectManager.PageObjectManager;
import com.reusable.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStepDefinitions extends BaseClass {
	
	PageObjectManager page = new PageObjectManager();
	@Given("User should be launched browser and url")
	public void user_should_be_launched_browser_and_url() {
		 launchBrowser(page.getFileData().getProperty("browser"));
		 launchUrl(page.getFileData().getProperty("url"));
	
	   
	}
	@When
	("User clicks sigin button on homePage")
	public void user_clicks_sigin_button_on_home_page() {
		page.getLogin().getHomeSigin();
	
	   
	}
	@When("User enters  email {string}")
	public void user_enters_email(String email) {
		page.getLogin().getEmail(email);
	
	   
	}
	@When("User enters  password {string}")
	public void user_enters_password(String password) {
		page.getLogin().getPassword(password);
	
	   
	}
	@When("User clicks sigin button")
	public void user_clicks_sigin_button() {
		page.getLogin().getSiginButton();
	
	   
	}
	@Then("User should be successfully sigin with valid credentials {string}")
	public void user_should_be_successfully_sigin_with_valid_credentials(String expText) {
		page.getLogin().getValidate(expText);
	
	   
	}




}
