@US014
Feature: US014 An Employee manage date of account creation
  Background: Sign_in and navigation to create account page
    #@login4us14
  #Scenario: Employee firstly sign in and navigates to create account
    Given Employee at the homepage_14 "gmibank_url"
    And   clicks the human icon at the right top_14
    And   chooses sign in option_14
    And   gives "username_employee" to username textbox_14
    And   gives "password_employee" to password textbox_14
    And   clicks the sign in button_14
    And   employee sign in successfully_14
    And   clicks the my operations area_14
    And   chooses manage accounts option_14
    And   clicks create new account area_14
#TC001
  @US014_TC001
  Scenario:The date cannot be typed earlier, at the time of creation an account
    Given employee types description and balance values
    When employee tries to type date earlier than account creation date
    Then must see can not type earlier date than account creation
#TC002
  @US014_TC002
  Scenario:The date should be created as month-day-year hour:minute
    Given employee checks the format of date
    Then date must be month day year hour minute
#TC003
  @US014_TC003
  Scenario:User choose a user from the registration and it cannot be blank
    When employee wants to choose user
    Then can choose user
#TC004
  @US014_TC004
  Scenario:User can choose an account created on manage accounts
    When employee wants to choose account
    Then can choose account
#TC005
  @US014_TC005
  Scenario:User can select Zelle Enrolled optionally
    Given employee wants select zelle
    Then  can select zelle