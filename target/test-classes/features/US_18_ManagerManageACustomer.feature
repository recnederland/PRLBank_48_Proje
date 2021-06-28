
Feature:Sistem, Yonetici'nin bir musteriyi yonetmesine izin vermelidir
  Background: kullanici musteri yonetimi sayfasina gider
    Given kullanici sayfasina "https://gmibank.com" gider
    And logine tiklar
    And signin linkine tiklar
    And kullanici "employee_17" ve "employee_17." e girer
    And kullanici musteri yonetimi modulu gorur

  Scenario: 18.user story kullanici sayfasini yonetir
    And kulanici goruntule secenegini gorur
    And kulanici duzenle secenegini gorur
    And kullanici duzenleme yapabilmelidir
    Then kullanici bir musteriyi siler ve silme mesajini gorur

  Scenario:  19.user story yonetici yeni bir hesap oluşturur
    And kullanici hesap olustur bolumunu tiklar
    And kullanici aciklama bolumune yazi girer
    And kullanici bakiye girer
    And kullanici hesap turu secer
    And kullanici hesap durumu secer
    And kullanici acılır menuden calısan secemez