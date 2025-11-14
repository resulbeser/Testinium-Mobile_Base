@SearchFunctionality
Feature: Kitapyurdu Mobile Arama İşlevi
  Kitapyurdu mobil uygulamasında arama işlevinin test edilmesi

  Background:
    Given Kullanıcı ana sayfada arama ikonu görünür

  @SearchPositiveTest
  Scenario: Başarılı kitap arama işlemi
    When Kullanıcı arama ikonuna tıklar
    And Kullanıcı arama alanına "nutuk" yazar
    And Klavye kapatılır
    Then Arama sonucunda "nutuk" görüntülenir

  @SearchWithParameter
  Scenario Outline: Farklı kitaplar için arama testi
    When Kullanıcı arama ikonuna tıklar
    And Kullanıcı arama alanına "<searchTerm>" yazar
    And Klavye kapatılır
    Then Arama sonucunda "<expectedResult>" görüntülenir

    Examples:
      | searchTerm | expectedResult |
      | nutuk      | nutuk          |
      | roman      | roman          |

  @SearchCompleteFlow
  Scenario: Tam arama işlem akışı
    When Kullanıcı "nutuk" için tam arama yapar
    Then Arama sonucunda "nutuk" görüntülenir