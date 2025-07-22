package com.interfaceElements;

public interface Order_Hoodie {
	String men_xpath="(//span[text()='Men'])[1]";
	String top_xpath="(//span[text()='Tops'])[2]";
	String hoodie_xpath="(//span[text()='Hoodies & Sweatshirts'])[2]";
	String validate_css="span[class='base']";
	String macro_xpath="//a[contains(text(),' Marco Lightweight')]";
	String size_xpath="(//div[text()='M'])[1]";
	String colour_xpath="//div[@aria-label='Green']";
	String quantity_id="qty";
	String addToCart_id="product-addtocart-button";
	String shoppingCart_xpath="//a[text()='shopping cart']";
	String checkout_xpath="//span[text()='Proceed to Checkout']";
	String next_xpath="//span[text()='Next']";
	String placeOrder_xpath="//span[text()='Place Order']";
	String orderId_xpath="//a[@class='order-number']";
	
	

}
