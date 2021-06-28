
@US25EachCountry  @country
Feature: US25 System should allow to create new countries using api end point
  "https://www.gmibank.com/api/tp-countries" if not created already


  Scenario Outline: Create country
    Given System should allow to create new countries using api end point "https://www.gmibank.com/api/tp-countries" "<name>" "<state>"
    Then validate created country
    Examples:
      |name |
      |FreeState|
      |Freeland|