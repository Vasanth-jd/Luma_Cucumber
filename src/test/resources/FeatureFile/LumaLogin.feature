Feature: Luma Application Login Testing 

@smoke
Scenario: User Signin With Email and Password

Given User should be launched browser and url
When User clicks sigin button on homePage
And User enters  email "vasanth97@gmail.com" 
And User enters  password "Vasanth0@21"
And User clicks sigin button
Then User should be successfully sigin with valid credentials "Welcome, vasanth kf!"




