@US_18
Feature: System should allow Manager to manage a customer

  Background:
    Given User access to main page
    And User click to icon
    And User click to Sign in button
    And User provides a valid username
    And User provides a valid  password
    And User click on sign in button

  Scenario: TC01 All customers should show up on manage customers module populating the account information of the customer "First Name,  Last Name,  Middle Initial,  Email,  Mobile Phone Number,  Phone Number,  Address,  Create Date "
    Then User should be able to click My Operations button
    And User should be able to click Manage Customers button
    And User should be able to see all customers information
    And User should be verify to necessary information

  Scenario: TC02 There should be a View option where customer can be navigated to all customer info and see edit button there
    Then User should be able to see View option
    And User should be able to click on View button of customer
    And User should be able to see all information of customer
    And User should be able to see edit button
    And User should be click home page button

    Then User should be able to click My Operations button
    And User should be able to click Manage Customers button

  Scenario: TC03 There should be an Edit button where all customer information can be populated
    Then User should be able to see Edit option
    And User should be able to click on Edit button of customer
    And User should be able to see all information of customer

  Scenario: TC04 The Edit portal can allow user to create or update the user info
    Then User should be able to create or edit information of customer
    And User should be able to click on Save button
    And User should be click home page button
    Then User should be able to click My Operations button
    And User should be able to click Manage Customers button


  Scenario: TC05 User can delete a customer, but seeing a message if the user is sure about deletion
    Then User should be able to see Delete option
    And User should be able to click on Delete button of customer
    And User should be able to see confirm delete message
    And User should be able to click cancel or delete buttons
    And User should be click home page button
    And User click on user icon
    And User click on sign out button