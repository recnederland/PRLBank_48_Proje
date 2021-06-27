@StateApi
Feature: CRUD operations for api states
  Background: api end point is set in response
    Given user sets all states to response using api end point "https://www.gmibank.com/api/tp-states"

  @ReadState
  Scenario: test all states
    Given User gets and manipulates all states data
        #And user sets states data in correspondent files
        #Then user validates all state data



