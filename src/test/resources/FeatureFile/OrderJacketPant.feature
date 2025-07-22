Feature: Place Order Jacket and Pant

Background:
 
Given User Should be on home page
And  User places the mouse on men
@smoke
Scenario: User order jackets and pants
When  User places the mouse on tops
And User places mouse on jackets and clicks jackets
And User should be navigated to jackets pagae "Jackets" 
And User clicks medium size proteus fitness jackshirt
And User clicks black colour 
And User clicks add to cart jacket
And User places the mouse on men
And User places mouse on bottom 
And User places mouse on pants and click
And User clicks  size 
And User clicks black colour 
And User clicks add to cart pant
And User clicks cart symbol on top right carner
And User should be view procced to checkout button and click
And User clicks  next button of jacket and pant 
And User clicks place order  jacket and pant 
Then User should be get order id of jacket pant


