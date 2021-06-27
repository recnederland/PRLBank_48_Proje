
Feature: country bilgilerini guncelleme
  @putCountry
  Scenario: kullanici country bilgilerini bire bir gunceller
    Given kullanici end point te "https://www.gmibank.com/api/tp-countries" put request ile id si 57074 olan Egeli yi "EGELI" olarak gunceller
    Then kullanici "EGELI" olarak country nin degistigini end point te "https://www.gmibank.com/api/tp-countries" dogrular