@userInfo
Feature: US_006 USER INFO

  Background:
Feature: Go to home page
  Scenario: User go to GmiBank home page
    Given user go to "http://www.gmibank.com/"

  Scenario:User Info Segment should be editable on homepage

    When the user click on the user name
    And User Info options should be visible
    Then the user click on the User Info
    And the user navigate to User Settings page