package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.Order_Hoodie;
import com.reusable.BaseClass;

public class Order_Hoodie_Page extends BaseClass implements Order_Hoodie{
	@FindBy(xpath = men_xpath)
	private WebElement men;
	
	@FindBy(xpath = top_xpath)
	private WebElement top;
	
	@FindBy(xpath = hoodie_xpath)
	private WebElement hoodie;
	
	@FindBy(css = validate_css)
	private WebElement validate;
	
	@FindBy(xpath =macro_xpath)
	private WebElement macro;
	
	@FindBy(xpath = size_xpath)
	private WebElement size;
	
	@FindBy(xpath = colour_xpath)
	private WebElement color;
	
	@FindBy(id = quantity_id)
	private WebElement qnty;
	
	@FindBy(id = addToCart_id)
	private WebElement addTo;
	
	@FindBy(xpath = shoppingCart_xpath)
	private WebElement shopping;
	
    @FindBy(xpath = checkout_xpath)
	private WebElement checkout;
	
	@FindBy(xpath = next_xpath)
	private WebElement next;
	
	@FindBy(xpath = placeOrder_xpath)
	private WebElement placeOrder;
	
	@FindBy(xpath = orderId_xpath)
	private WebElement orderId;
	
	public Order_Hoodie_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void getMen() {
		action_Class(men, "moveToElement");
	
	}
	
	public void getTops() {
		action_Class(top, "moveToElement");
	}
	
	public void getHoodie() {
	    action_Class(hoodie, "moveToElement");
	    elementClick(hoodie);
	}
	
	public void getValidate(String expText) {
		implicitlyWait(validate_css, 10);
		validation(validate, expText);
	}
	
	public void getMacroHoodie() {
		implicitlyWait(macro_xpath, 10);
		elementClick(macro);
	}
	
	public void getSize() {
		javascriptClick(size);
	}
	
	public void getColour() {
		javascriptClick(color);
	}
	
	public void getQauntity(String quantity) {
		implicitlyWait("seconds", 0);
		clear(qnty);
		sendKeys(qnty, quantity );
	}
	
	public void getAddToCart() {
		elementClick(addTo);
	}
	
	public void getShoppingCart() {
		implicitlyWait("seconds", 20);
		elementClick(shopping);
	}
	
	public void getCheckout() {
		implicitlyWait("seconds", 0);
		 elementClick(checkout);
	}
	
	public void getNext() {
		javascriptClick(next);
		
	}
	
	public void getPlaceOrder() {
		javascriptClick(placeOrder);
	}
	
	public void getOrderId() {
		getText(orderId);
	}
	
	

}
