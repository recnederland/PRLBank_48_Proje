@CustomerApi
Feature: Customer Api validation

  @CustomerRead
  Scenario:user provides api end point to set the response using
    Given manipulate all customers' data "https://www.gmibank.com/api/tp-customers?size=1500"
    And user sets the data in correspondent files
    And user read all customers you created and validate them 1 by 1
    Then user validates "all" data