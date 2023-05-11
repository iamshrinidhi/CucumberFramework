#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Register Feature
As a user you need to open an account in ecoders website

  

  @tag1
  Scenario: Validate the registration process
    Given The user has to be in register page 
    When the user enters the username
    And the user enters a new password
    And the user clicks on register button
    Then the user should be navigated to the login a page of ecoders website
    
    
    
	Scenario: Checking Login functionality with valid credentials
    Given User should be login page of the ecoders applications
    When the user enter valid username into username text field
    And the user enter valid password into password text field
    And the user clicks on sign in buttons
    Then the user should be navigated to the dashboard page of ecoders applications
    
    
    
    
 	Scenario: Checking Login functionality with invalid credentials
    Given User should be login page of the ecoders application 
    When the user enter invalid username into username text field
    And the user enter invalid password into password text field
    And the user clicks on sign in button
    Then the user should be navigated to the login page of ecoders application
   