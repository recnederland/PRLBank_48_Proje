Feature: 2. API Session
  @create_ders
  Scenario: Creation a country
    And User creates a country from api using "country_api_endpoint"d
    Then User validates that country is created
  @update_ders
  Scenario:  Update a country
    And ders update created country using api end point "country_api_endpoint"d
    Then User validates that country is updated
  @delete_ders
  Scenario:  Delete a country
    And ders delete created country using api end point "country_api_endpoint" "/4499"d
    Then User validates that country is deleted