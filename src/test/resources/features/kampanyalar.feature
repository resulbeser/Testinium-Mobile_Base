# src/test/resources/features/kampanyalar.feature
@Kampanyalar
Feature: Kitapyurdu Mobil Kampanyalar
  Kampanyalar butonunun çalışırlığı ve kampanya sayfasının açılması test edilir

  Scenario: Kampanyalar sayfasına gidilebilmeli
    Given Kullanıcı ana sayfada kampanyalar butonu görünür
    When Kullanıcı kampanyalar butonuna tıklar
    Then Kampanyalar sayfası açılır

