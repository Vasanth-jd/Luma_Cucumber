package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.Login_Page;
import com.reusable.BaseClass;
import com.utility.FileReadManager;

public class Login_Page_Model extends BaseClass implements  Login_Page {
	
	@FindBy(xpath=homeSigin_xpath)
	private WebElement homesiginButton;
	
	@FindBy(id = email_id)
	private WebElement emailField;
	
	@FindBy(id = password_id)
	private WebElement passwordBox;
	
	@FindBy(xpath = sigin_xpath)
	private WebElement sigin;
	
	@FindBy(xpath =validate_xpath)
	private WebElement validate;
	
	public Login_Page_Model() {
		PageFactory.initElements(driver, this);
		
	}
	
		public void getHomeSigin() {
			elementClick(homesiginButton);
			
		}
		
		public void getEmail(String email) {
			sendKeys(emailField, email);
			
		}
		public void getPassword(String password) {
			
			sendKeys(passwordBox, password);
			
		}
		
		public void getSiginButton() {
			elementClick(sigin);
			
		}
		
		public void getValidate(String expectedText) {
			explicitlyWait(validate, "visiblity", 10);
			validation(validate, expectedText);
			
		}
		
	}

	


