Feature: Search Customer
  Background: kullanici login sayfasina gider
    Given kullanici gmibank sayfasina "https://gmibank.com" gider
    And login linkine tiklar


  @AdminManageUsers
  Scenario Outline: Admin kullanicilarin rollerini aktive eder
    Given kullanici sign in menusune tiklar
    And kullanici username "<username>" girer
    And kullanici password "<password>" girer
    And kullanici sign in buttonuna tiklar
    And admin Administration dropdow a ve User Management sekmesine tiklar
    And admin kullanici rolunu mail "<e_mail>" yardimi ile User "ROLE_USER" olarak belirler
    And admin kullanici rolunu mail "<e_mail>" yardimi ile Employee "ROLE_EMPLOYEE" olarak belirler
    And admin kullanici rolunu mail "<e_mail>" yardimi ile Manager "ROLE_MANAGER" olarak belirler
    And admin kullanici rolunu mail "<e_mail>" yardimi ile Admin "ROLE_ADMIN" olarak belirler
    And admin kullanıcı bilgilerini mail "<e_mail>" yardimi ile görüntüleyebilir
    And admin kullanıcı bilgilerini mail "<e_mail>" yardimi ile duzenleyebilir
    Then admin kullanıcı bilgilerini mail "<e_mail>" yardimi ile silebilir

    Examples:Test values
    | username  | password   | e_mail             |
    |admin_17   |admin_017*  |lindapine@gmail.com |