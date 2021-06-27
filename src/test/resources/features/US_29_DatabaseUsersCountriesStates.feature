
@tumVeriler
Feature:  veritabani testini gerceklestiren tum verileri dogrular


  @KullaniciVerileri
  Scenario: Tum kullanicilarin bilgilerinin veritabani tarafindan alinmasi ve dogrulanmasi
    Given verilen customer endpoint "https://www.gmibank.com/api/tp-customers" kullanilarak bilgileri al
    Then verilen customer id yi "42687" oldugunu dogrula


  @UlkeVerileri
  Scenario: Tum ulkelerin bilgilerinin veritabani tarafindan alinmasi ve dogrulanmasi
    Given verilen country endpoint "https://www.gmibank.com/api/tp-countries" kullanilarak bilgileri al
    Then verilen country id yi "22316" oldugunu dogrula


  @EyaletVerileri
  Scenario: Tum eyaletlerin bilgilerinin veritabani tarafindan alinmasi ve dogrulanmasi
    Given verilen state endpoint "https://www.gmibank.com/api/tp-states" kullanilarak bilgileri al
    Then verilen state id yi "58975" oldugunu dogrula
