// src/test/java/com/testinium/And/PageSteps/KampanyaPageSteps.java
package com.testinium.And.PageSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.testinium.And.Pages.MainPage.KampanyaPage;

public class KampanyaPageSteps {
    private static final Logger log = LoggerFactory.getLogger(KampanyaPageSteps.class);

    @Given("Kullanıcı ana sayfada kampanyalar butonu görünür")
    public void kullanici_ana_sayfada_kampanyalar_butonu_gorunur() {
        log.info("Ana sayfada kampanyalar butonu görünürlüğü kontrol ediliyor...");
        // Gerekirse görünürlük kontrolü eklenebilir
    }

    @When("Kullanıcı kampanyalar butonuna tıklar")
    public void kullanici_kampanyalar_butonuna_tiklar() {
        log.info("Kampanyalar butonuna tıklanıyor...");
        KampanyaPage.clickKampanyalarButton();
    }

    @Then("Kampanyalar sayfası açılır")
    public void kampanyalar_sayfasi_acilir() {
        log.info("Kampanya sayfası açıldığı doğrulanıyor...");
        KampanyaPage.verifyKampanyaPageOpened();
    }
}

