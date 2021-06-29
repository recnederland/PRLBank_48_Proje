@AllCustomerInfo
Feature: Customer Api Validation

  Background: Api end point is being set in response
    Given Authorized user provides the api end point to set the response using "customer_api_endpoint" "api_bearer_token"


  Scenario:
    And Customers info will be set to customers with deserialization
    Then Customers info will be saved to txt files
    Then Customers info has been validated

