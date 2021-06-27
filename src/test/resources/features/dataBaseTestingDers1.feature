Feature: database testing ders
  Background: create connection ders
    Given ders user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
  Scenario Outline: read and validate created data using with ssn
    And DUders user creates a Country data using "INSERT INTO tp_country(id, name) VALUES(3516255,'Deneme123 Country12345')" "3516255"
    And DUders user reads the Country data using "<query>" and "<columnName>"
    Then DUders validate customers data
    Examples: demo read the data
      | query                    | columnName |
      | Select * from tp_country | id         |

#  select * from tp_customer
#  select * from tp_customer
#  select * from tp_country
#  select * from tp_account
#  INSERT INTO tp_country(id, name) VALUES(251355412,'Bank123 Ulkesi')
#  SELECT * FROM tp_country
#  select * from jhi_user
#  select * from jhi_user_authority
#  select mobile_phone_number from tp_customer where first_name='Jon';