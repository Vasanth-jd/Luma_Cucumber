Feature: Place Order Hoodie
Background: 
Given User Should be on home page
And  User places the mouse on men

@smoke
Scenario: User Order Hoodie 
When User places the mouse on tops
And User places the mouse on hoodie and clicks the hoodie
And User should be navigated to hoodie page and get title "Hoodies & Sweatshirts"
And User clicks Marco Lightweight Active Hoodie on hoodie page
And User clicks medium size hoodie
And User clicks green colour
And User enters quantity "2"
And User clicks add to cart
And User clicks shopping cart
And User clicks proceed to checkout
And User clicks next button
And User clicks place order 
Then User should be get order id 





