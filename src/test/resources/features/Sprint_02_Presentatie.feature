@demo2
Feature: ApiDemo2
  Scenario: Putting in order Id's, Reading, Creating, Updating and Deleting Country
    Given User on the api endpoint "country_api" and read the countries
    And Validate countries read
    And create a country using to api end point "country_api"
    And Validate country create
    And user updates a country using api end point "country_api"  "name" and its extension "id"
    And Validate country update
    And user deletes a country using endpoint "country_api" and its extension "country_id"
    And Validate country delete


  @demoJDBC
  Scenario Outline: All users info should be retrieved by database and validated
    Given User creates a connection with db using "gmibank_jdbc" , "techpro_username" and "techpro_pw"
    And User retrieves the info of user from database using "<query>" and "<columnName>"
    Then User validates users info "jdbc_email"
    Examples:
      |query|columnName|
      |Select * From jhi_user|email|


  @DemoPdf
  Scenario Outline: Generate Datas to Pdf
    Given User creates a connection with db using "gmibank_jdbc" , "techpro_username" and "techpro_pw"
    And User provides the query "<query>" and generate it to PDF
    Examples: Queries
      |query|
      |Select * from tp_customer|




