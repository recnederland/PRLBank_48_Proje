@US-09
Feature: Create a new customer

  Background:

    And   click on  My Operations
    And   click on Manage Customers
    Then  click on Create a new Customer


  @US09-TC1
  Scenario: User can search for a new applicant by their SSN and see all their registration info populated

    And  given valid value in the ssn field
    And  click on search button
    Then verify that all information is displayed when search is clicked.
      |deneme_ders|
      |demo   |
      |564-87-9514|


  @US09-TC2
  Scenario: User can search for a new applicant by their SSN and see all their registration info populated
    And  given invalid value in the ssn field
    And wait 5 esconds
    And  click on search button
    Then verify that all information invalid is displayed when search is clicked.

  @US09-TC3
  Scenario: User can search for a new applicant by their SSN and see all their registration info populated
    And   click on search button
    Then  verify that all information empty is displayed when search is clicked.





