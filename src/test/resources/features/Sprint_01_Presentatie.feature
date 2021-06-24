@sprintBir
Feature: Money Transfer
  Scenario: User does every step to transfer money
    Given User on the "gmibank_url"
    And User navigates to registration page
    Then User provides a valid ssn
    And User provides a valid firstname
    And User provides a valid lastname
    And User provides a valid address
    And User provides a valid phonenumber
    And User provides a valid username
    And User provides a valid email
    And User provides a valid password
    And User provides a valid password confirmation
    And User clicks Register button
    And User asserts that he could register successfully
    And User on the "gmibank_url"
    And Admin login his account
    And Admin activate customer account
    And Admin log-out his account
    And User on the "gmibank_url"
    And Employee login his account
    And Emloyee entecredet the bank acoount to customer
    And Employee log-out his account
    #Given user go to "https://gmibank-qa-environment.com/"
    And DUser navigates to sign in page
    Then DUser provide a valid username
    And DUser provide a valid password
    Then User click on the sign in button
    And DUser navigates My Accounts Page
    Then DUser gets the info about Users accounts balance
    And DUser navigates to Transfer Money Page
    Then DUser does the money transfer
    And DUser navigates My Accounts Page
    And DUser validates that User s money transferred successfully
    Then Team is successfully