package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.Order_Jackets_pant;
import com.reusable.BaseClass;

public class Order_Jacket_Pants_Page extends BaseClass implements Order_Jackets_pant {
	@FindBy(xpath = men_xpath)
	private WebElement men;
	
	@FindBy(xpath = top_xpath)
	private WebElement top;
	
	@FindBy(xpath = jacket_xpath)
	private WebElement jacket;
	
	@FindBy(xpath = validateJacket_xpath)
	private WebElement validateJacket;
	
	@FindBy(xpath = size_xpath)
	private WebElement size;
	
	@FindBy(xpath = colour_xpath)
	private WebElement color;
	
	@FindBy(xpath = addCart_xpath)
	private WebElement addto;
	
	@FindBy(xpath = bottom_xpath)
	private WebElement bottom;
	
	@FindBy(xpath = pants_xpath)
	private WebElement pants;
	
	@FindBy(xpath = validatePant_Xpath)
	private WebElement validatePant;
	
	@FindBy(xpath = pantSize_xpath)
	private WebElement pantSize;
	
	@FindBy(xpath = pantColor_xpath)
	private WebElement pantColor;
	
	@FindBy(xpath = cartLogo_xpath)
	private WebElement cartLogo;
	
	@FindBy(xpath = checkout_xpath)
	private WebElement checkout;
	
	@FindBy(xpath = next_xpath)
	private WebElement next;
	
	@FindBy(xpath=placeOrder_xpath)
	private WebElement placeOrder;
	
	@FindBy(xpath = orderId_xpath)
	private WebElement orderId;
	
	public Order_Jacket_Pants_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void getMen() {
		implicitlyWait("seconds", 10);
	action_Class(men, "moveToElement");
	}
	
	public void getTop() {
		action_Class(top, "moveToElement" );
	}
	
	public void getJacket() {
		action_Class(jacket,  "moveToElement");
		elementClick(jacket);
	}
	
	public void getValidateJacket(String expText) {
		implicitlyWait("seconds", 20);
		validation(validateJacket, expText);
	}
	
	public void getJacketSize() {
		elementClick(size);
	}
	
	public void getJacketColour() {
		elementClick(color);
	}
	
	public void getAddToCart() {
		implicitlyWait("seconds", 10);
		javascriptClick(addto);
	}
	
	public void getmen1() {
		implicitlyWait("seconds", 10);
		 action_Class(men, "moveToElement");
	}
	public void getBottom() {
		action_Class(bottom,"moveToElement");
		
	}
	
	public void getPants() {
		action_Class(pants,"moveToElement");
	elementClick(pants);
	}
	
	public void getPantSize() {
	javascriptClick(pantSize);
	}
	
	public void getPantColour() {
		javascriptClick(pantColor);
	}
	
	public void getAddToCart1() {
		
	javascriptClick(addto);
	}
	
	public void getCartLogo()  {
		explicitlyWait(cartLogo, "element", 20);
		javascriptClick(cartLogo);
	}
	
	public void getPeoceedToCheckout() {
		elementClick(checkout);;
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
