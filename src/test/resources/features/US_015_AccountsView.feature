@showAccount
Feature: US015 Account Validation
  Scenario: User can see all account types and balances
    Given user go to "https://gmibank-qa-environment.com/"
    And DUser navigates to sign in page
    Then DUser provide a valid username
    And DUser provide a valid password
    Then User click on the sign in button
    And DUser navigates My Accounts Page
    Then DUser gets the info about Users accounts balance
    #And DUser finds and validates the Account Type webelement on the page
    #Then DUser finds and validates the Balance webelement on the page

