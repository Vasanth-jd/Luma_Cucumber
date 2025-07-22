package com.interfaceElements;

public interface Order_Jackets_pant {
	String men_xpath="(//span[text()='Men'])[1]";
	String top_xpath="(//span[text()='Tops'])[2]";
	String jacket_xpath="(//span[text()='Jackets'])[2]";
	String validateJacket_xpath="(//span[text()='Jackets'])[3]";
	String size_xpath="(//div[text()='M'])[1]";
	String colour_xpath="(//div[@aria-label='Black'])[1]";
	String addCart_xpath="(//button[@title='Add to Cart'])[1]";
	String bottom_xpath="(//span[text()='Bottoms'])[2]";
	String pants_xpath="(//span[text()='Pants'])[2]";
	String validatePant_Xpath="(//span[text()='Pants'])[3]";
	String pantSize_xpath="(//div[text()='32'])[1]";
	String pantColor_xpath="(//div[@aria-label='Black'])[1]";
	String cartLogo_xpath="//span[@class='counter-number']";
	String checkout_xpath="//button[text()='Proceed to Checkout']";
	String next_xpath="//span[text()='Next']";
	String placeOrder_xpath="//span[text()='Place Order']";
	String orderId_xpath="//a[@class='order-number']";
	
	
	

}
