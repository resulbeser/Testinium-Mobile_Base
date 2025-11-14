Feature: Kitapyurdu Login Senaryoları

  Scenario: Kullanıcı Başarılı Giriş senaryosu
    Given   Hesaba giriş işlemleri yapılır.
    And     Email girilir.
    And     Şifre girilir.
    And     Giriş Yap butonuna tıklanır.
    Then    Başarıyla giriş yapıldığı doğrulanır.