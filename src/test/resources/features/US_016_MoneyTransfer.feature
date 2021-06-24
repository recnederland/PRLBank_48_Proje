@MoneyTransfer
Feature: US016 Money Transfer
  Scenario: User does every step to transfer money between user's accounts
    Given user go to "https://gmibank-qa-environment.com/"
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