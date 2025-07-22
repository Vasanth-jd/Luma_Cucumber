package com.stepDefinitions;

import com.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderHoodieStepDef {
	PageObjectManager page = new PageObjectManager();
	@Given("User Should be on home page")
	public void user_should_be_on_home_page() {
		
	  
	   
	}
	@Given("User places the mouse on men")
	public void user_places_the_mouse_on_men() {
		page.getHoodiePage().getMen();
	  
	   
	}
	@When("User places the mouse on tops")
	public void user_places_the_mouse_on_tops() {
		page.getHoodiePage().getTops();
	  
	   
	}
	@When("User places the mouse on hoodie and clicks the hoodie")
	public void user_places_the_mouse_on_hoodie_and_clicks_the_hoodie() {
		page.getHoodiePage().getHoodie();
	  
	   
	}
	@When("User should be navigated to hoodie page and get title {string}")
	public void user_should_be_navigated_to_hoodie_page_and_get_title(String expText) {
		page.getHoodiePage().getValidate(expText);
	  
	   
	}
	@When("User clicks Marco Lightweight Active Hoodie on hoodie page")
	public void user_clicks_marco_lightweight_active_hoodie_on_hoodie_page() {
		page.getHoodiePage().getMacroHoodie();
	  
	   
	}
	@When("User clicks medium size hoodie")
	public void user_clicks_medium_size_hoodie() {
		page.getHoodiePage().getSize();
	  
	   
	}
	@When("User clicks green colour")
	public void user_clicks_green_colour() {
		page.getHoodiePage().getColour();
	  
	   
	}
	@When("User enters quantity {string}")
	public void user_enters_quantity(String quantity) {
		page.getHoodiePage().getQauntity(quantity);
	  
	   
	}
	@When("User clicks add to cart")
	public void user_clicks_add_to_cart() {
		page.getHoodiePage().getAddToCart();
	  
	   
	}
	@When("User clicks shopping cart")
	public void user_clicks_shopping_cart() {
		
		page.getHoodiePage().getShoppingCart();
	  
	   
	}
	@When("User clicks proceed to checkout")
	public void user_clicks_proceed_to_checkout() {
		page.getHoodiePage().getCheckout();
	  
	   
	}
	@When("User clicks next button")
	public void user_clicks_next_button() {
		page.getHoodiePage().getNext();
		
	  
	   
	}
	@When("User clicks place order")
	public void user_clicks_place_order() {
		page.getHoodiePage().getPlaceOrder();
		
	  
	   
	}
	@Then("User should be get order id")
	public void user_should_be_get_order_id() {
		page.getHoodiePage().getOrderId();
	
	  
	   
	}



}
