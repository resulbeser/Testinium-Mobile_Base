package com.testinium.And.PageSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import com.testinium.And.Pages.MainPage.SearchPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchPageSteps {
    private static final Logger log = LoggerFactory.getLogger(SearchPageSteps.class);

    @Given("Kullanıcı ana sayfada arama ikonu görünür")
    public void kullanici_ana_sayfada_arama_ikonu_gorunur() {
        log.info("Ana sayfada arama ikonu kontrol ediliyor...");
        // Ana sayfa kontrolü burada yapılabilir
    }

    @When("Kullanıcı arama ikonuna tıklar")
    public void kullanici_arama_ikonuna_tiklar() {
        log.info("Arama ikonu tıklanıyor...");
        SearchPage.clickSearchIcon();
    }

    @And("Kullanıcı arama alanına {string} yazar")
    public void kullanici_arama_alanina_yazar(String searchText) {
        log.info("Arama alanına metin yazılıyor: " + searchText);
        SearchPage.typeSearchText(searchText);
    }

    @And("Klavye kapatılır")
    public void klavye_kapatilir() {
        log.info("Klavye kapatılıyor...");
        SearchPage.hideAndroidKeyboard();
    }

    @Then("Arama sonucunda {string} görüntülenir")
    public void arama_sonucunda_goruntulenr(String expectedResult) {
        log.info("Arama sonucu doğrulanıyor: " + expectedResult);
        SearchPage.verifySearchResult(expectedResult);
    }

    @When("Kullanıcı {string} için tam arama yapar")
    public void kullanici_icin_tam_arama_yapar(String searchTerm) {
        log.info("Tam arama işlemi gerçekleştiriliyor: " + searchTerm);
        SearchPage.performSearch(searchTerm);
    }
}
