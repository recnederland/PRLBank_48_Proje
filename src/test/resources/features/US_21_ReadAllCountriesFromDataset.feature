@CountryApi
Feature: Country Api validation
  Background: api end point is set in response
    Given user provides api end point to set the response using "https://www.gmibank.com/api/tp-countries"

  @ReadCountry
  Scenario: test all country data
    Given User gets and manipulates all country data
        #And user sets the data in correspondent files
        #Then user validates all data

  @CreateCountry
  Scenario Outline: create a country
    Given user sets the response using api end point "https://www.gmibank.com/api/tp-countries" and creates using "<idJson>" and "<nameJson>"

    Examples: create country
      |idJson|nameJson|
      |name   |Hacimokkey|
      |name   |Hababam|
      |name   |IsmailAbi|

  @ReadAllCountry
  Scenario: read all country data
    Given user sets the response using api end point "https://www.gmibank.com/api/tp-countries"
    And user saves the countries in correspondent files
    Then user validates the countries

  @DeleteCountry
  Scenario Outline: delete countries
    Given user deletes a country using endpoint "<endPoint>" and its extension "<id>"

    Examples: multiple countries
      |endPoint|id|
      |https://www.gmibank.com/api/tp-countries|/92257|

  @ReadLogs
  Scenario: read logs
    Given user sees all logs "https://www.gmibank.com/management/audits/?fromDate=2020-11-10&toDate=2020-11-12"