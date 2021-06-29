
  Feature: Api Presentation
    Scenario: Create a customer on UI and Validate with Api
      Given User is on main page
      And User access to registration page
      And User provides information for registration
      Then Admin activate to applicant
      Then Employee create two new account for the customer
      And Employee integrate account for the customer
      Then Authorized user access the api endpoint for read the customer info
      And Validate the customer
