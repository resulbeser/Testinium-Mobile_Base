Feature: Kitapyurdu Sepet Senaryoları

  Scenario: Sepete Ürün Ekleme Senaryosu
    Given   Hesaba giriş işlemleri yapılır.
    And     Email girilir.
    And     Şifre girilir.
    And     Giriş Yap butonuna tıklanır.
    And     Başarıyla giriş yapıldığı doğrulanır.
    And     Ana Sayfa butonuna tıklanır.
    And     İlgi Görenler bölümündeki ilk kitaba tıklanır.
    And     Sepete Ekle butonuna tıklanır.
    And     Sepet butonuna tıklanır.
    Then    Sepete ürün eklendiği doğrulanır.
    And     Sepet temizlenir.