Feature: Validation of Login Page in Facebook Web Application

Background:
Given User launch Facebook Web Application
Then User verify Facebook Login Page is displayed


Scenario: TC01_Validation of Login Page with invalid credentials
When User enter valid username and Invalid password
And User clicks Login Button
Then user verify error message is displayed

Scenario: Tc02_Validaton of Sign Up Text
When User clicks on create new account button
Then User verifies signup text is displayed

Scenario Outline: TC03_Validation of Login Page with multiple invalid datas 
Given User launch Facebook Web Application
When User enters invalid "<userName>" and "<passWord>"
And User clicks Login Button
Then user verify error message is displayed

Examples:
|username|password|
|Rama|Sam@123|
|sam|Ram@123|





