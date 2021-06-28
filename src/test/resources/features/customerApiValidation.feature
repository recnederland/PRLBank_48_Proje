Feature: Customer Api Validation

  Background: Api end point is being set in responce
    Given User provides the api end point to set the response using "customer_api_endpoint" "api_bearer_token"

    Scenario:
      And All customer info will be set to customers with deserialization
      Then All customer info will be saved to txt files
      Then All customer info has been validated
