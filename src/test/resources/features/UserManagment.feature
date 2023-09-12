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
@userManagment
Feature: User management / access management

@validLogin  @smokeTest
  Scenario: User should be able to login with valid credentials
    Given As a user, I am on the login page
    When I enter valid useremail and valid password
    And Click on the login button
    Then I should be logged in
    
    
# cucumber reuses the steps that are already implemente  .example: "Click on the login button"
# if there are same steps 2 steaps ,cucumber only generats one step defintion and reuses that step difintionbetween that 2 steps



@invalidEmailLogin
  Scenario: Invalid email login attempts
    Given As a user, I am on the login page
    When I enter invalid useremail  and password 
    And  Click on login button
    Then I should see an error message "These credentials do not match our records." displays
    And I should not be logged in
    
    
    
    
    
    @createItem
  Scenario: As a user, I am able to create an item or a service
    Given As an entity user, I am logged in
    And I navigate to Items tab
    When I click on the Add Item button
    And I should be on item input page
    When I provide item information name "Coffee mug", price "1800", unit "pc", and description "very nice coffee mug"
    And I click Save Item button
    Then The Item is added to the Item list table
    And I delete the item
    
    
    
    
