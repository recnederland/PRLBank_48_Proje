  @registration
  Feature: US001 Registration

  Scenario: User applies for registration
        And User navigates to registration page

    Scenario:
      Given User on the "gmibank_url"
      And User navigates to registration page
      Then User provides a valid ssn
      And User provides a valid firstname
      And User provides a valid lastname
      And User provides a valid address
      And User provides a valid phonenumber
      And User provides a valid username
      And User provides a valid email
      And User provides a valid password
      And User provides a valid password confirmation
      And User clicks Register button
      And User asserts that he could register successfully