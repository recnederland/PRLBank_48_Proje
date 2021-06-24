@US-10

Feature: Create a new customer

  Background:

    And   click on  My Operations
    And   click on Manage Customers
    Then  click on Create a new Customer


  @US10-TC1

  Scenario: Address as street and number should be provided and cannot be left blank
    And given value in the Address field
    Then the system should not give an error message

  @US10-TC2

  Scenario: Address as street and number should be provided and cannot be left blank
    And click the given value in the Address field
    And tab button should be clicked
    Then system should give adress error message.

  @US10-TC3

  Scenario: City should be provided and cannot be left as blank
    And given value in the City field
    Then the system should not give an error message

  @US10-TC4

  Scenario: City should be provided and cannot be left as blank
    And click the given value in the City field
    And tab button should be clicked
    Then system should give error message.

  @US10-TC5

  Scenario: Country should be typed and cannot be blank
    And select country in drop down menu
    Then the system should not give an error message

  @US10-TC6  #BUG

  Scenario: Country should be typed and cannot be blank
    And click the given value in the Country field
    And And tab button should be fied Country clicked
    Then system should give error message.

  @US10-TC7

  Scenario: State should be provided as US state and cannot be blank
    And given value in the State field
    Then the system should not give an error message

  @US10-TC8   #BUG

  Scenario: State should be provided as US state and cannot be blank
    And click the given value in the State field
    And tab button should be fied State clicked
    Then system should give error message.





