
@ApplicantApi
Feature: Applicant Api validation
  Background: api end point is set in response
    Given user provides api end point to set the response using "https://www.gmibank.com/api/tp-account-registrations" for applicants

  @ReadApplicants
  Scenario: read one by one applicants' data
    Given User gets and manipulates all applicant data
        #And user sets the data in correspondent files
        #Then user validates all data

  @ReadAllApplicants
  Scenario: read all applicant data
    Given user sets the response using api end point "https://www.gmibank.com/api/tp-account-registrations"
    And user saves the applicants in correspondent files
    Then user validates the applicants