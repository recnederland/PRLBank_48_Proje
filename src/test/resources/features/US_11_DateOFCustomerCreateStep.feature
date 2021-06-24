@US011
Feature: US011 An Employee manage date of custemor creation
  Background: Sign_in and navigation to create customer page
    #@login4us11
  #Scenario: Employee firstly sign in and navigates to create customer
    Given Employee at the homepage_11 "gmibank_url"
    And   clicks the human icon at the right top_11
    And   chooses sign in option_11
    And   gives "username_employee" to username textbox_11
    And   gives "password_employee" to password textbox_11
    And   clicks the sign in button_11
    And   employee sign in successfully_11
    And   clicks the my operations area_11
    And   chooses manage customer option_11
    And   clicks create new customer area_11
#TC001
  @US011_TC001
  Scenario:The date cannot be typed earlier, in the past, at the time of creation a customer
    Given employee types a valid ssn in searchbox
    And   types valid values in required fields
    When  employee tries to type date earlier than customer creation date
    Then  must see can not type earlier date

#TC002
  @US011_TC002
  Scenario:The date should be created as month, day, year, hour and minute
    When employee gets the format of date
    Then date format should be month day year hour and minute
#TC003
  @US011_TC003
  Scenario:User can choose a user from the registration and it cannot be blank
    When employee can choose user from dropdown
    Then if do not choose user should get a warning

#TC004
  @US011_TC004
  Scenario:There user can choose an account created on manage accounts
    When employee try to choose account from dropdown
    Then can do that
#TC005
  @US011_TC005
  Scenario:User can select Zelle Enrolled optionally and save it
    When employee want to select zelle enrollment
    Then can select and save it