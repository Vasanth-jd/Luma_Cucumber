package com.stepDefinitions;

import com.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderJacketPantStepDef {
	PageObjectManager page = new PageObjectManager();
	@When("User places mouse on jackets and clicks jackets")
	public void user_places_mouse_on_jackets_and_clicks_jackets() {
	   page.getJacketPant().getJacket();
	   
	}
	@When("User should be navigated to jackets pagae {string}")
	public void user_should_be_navigated_to_jackets_pagae(String jacket) {
		page.getJacketPant().getValidateJacket(jacket);
	   
	   
	}
	@When("User clicks medium size proteus fitness jackshirt")
	public void user_clicks_medium_size_proteus_fitness_jackshirt() {
		page.getJacketPant().getJacketSize();
		
	   
	   
	}
	@When("User clicks black colour")
	public void user_clicks_black_colour() {
		page.getJacketPant().getJacketColour();
	   
	   
	}
	@When("User clicks add to cart jacket")
	public void user_clicks_add_to_cart_jacket() {
		page.getJacketPant().getAddToCart();
	   
	   
	}
	@When("User places mouse on bottom")
	public void user_places_mouse_on_bottom() {
		page.getJacketPant().getBottom();
	   
	   
	}
	@When("User places mouse on pants and click")
	public void user_places_mouse_on_pants_and_click() {
		page.getJacketPant().getPants();
	   
	   
	}
	@When("User clicks  size")
	public void user_clicks_size() {
		page.getJacketPant().getPantSize();
	   
	   
	}
	@When("User clicks add to cart pant")
	public void user_clicks_add_to_cart_pant() {
		page.getJacketPant().getAddToCart1();
	   
	   
	}
	@When("User clicks cart symbol on top right carner")
	public void user_clicks_cart_symbol_on_top_right_carner() {
		page.getJacketPant().getCartLogo();
	   
	   
	}
	@When("User should be view procced to checkout button and click")
	public void user_should_be_view_procced_to_checkout_button_and_click() {
		page.getJacketPant().getPeoceedToCheckout();
	   
	   
	}
	
	@When("User clicks  next button of jacket and pant")
	public void user_clicks_next_button_of_jacket_and_pant() {
		page.getJacketPant().getNext();
	  
	  
	}
	@When("User clicks place order  jacket and pant")
	public void user_clicks_place_order_jacket_and_pant() {
		page.getJacketPant().getPlaceOrder();
	  
	}
	@Then("User should be get order id of jacket pant")
	public void user_should_be_get_order_id_of_jacket_pant() {
		page.getJacketPant().getOrderId();
	  
	}







}
