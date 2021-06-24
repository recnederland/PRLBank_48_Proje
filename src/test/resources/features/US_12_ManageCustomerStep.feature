@US012
Feature: US012 An Employee can manage Customer
  Background: Sign_in and navigation to manage customer page
    #@login4us12
   # Scenario: Employee firstly sign in and navigates to manage customer
    Given Employee at the homepage "gmibank_url"
    And   clicks the human icon at the right top
    And   chooses sign in option
    And   gives "username_employee" to username textbox
    And   gives "password_employee" to password textbox
    And   clicks the sign in button
    And   employee sign in successfully
    And   clicks the my operations area
    And   chooses manage customer option

  @US012_TC001
  Scenario: TC001_All customers should show up on manage customers module populating the account information of the customer

    Given   kullanici webtable bilgilerini okumaya calisir
    Then    verify the table header contains the criterias and can read infos
  @US012_TC002
  Scenario: TC002_There should be a View option where customer can be navigated to all customer info and see edit button there

    Given   kullanici ekranda view butonlarindan birine tiklar
    Then    ilgili musterinin bilgilerine ulasir ve sayfanin en altinda bir edit butonu gorur

  @US012_TC003
  Scenario: TC003_There should be an Edit button where all customer information can be populated

    Then kullanici ekranda edit butonlarindan birini gorur


  @US012_TC004
  Scenario: TC004_The Edit portal can allow user to create or update the user info

    Given kullanici ekranda edit butonlarindan birine tiklar
    And   musterinin bilgilerini olusturur ya da degistirir
    Then  bilgilerin son halini kaydeder

  @US012_TC005
  Scenario: TC005_User can delete a customer but seeing a message if the user is sure about deletion

    Given kullanici ekranda delete butonlarindan birine tiklar
    And   silme isleminle ilgili uyari ekranini gorur
    Then  silme islemini onaylar