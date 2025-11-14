package com.testinium.And.PageSteps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.AfterScenario;
import com.testinium.And.Pages.LandingPage;
import com.testinium.And.Util.Driver.Driver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GaugeLandingPageSteps {
    private static final Logger log = LoggerFactory.getLogger(GaugeLandingPageSteps.class);
    private LandingPage landingPage;

    @BeforeScenario
    public void setUp() {
        log.info("Landing page test başlıyor...");
        try {
            // Eğer driver null ise, DriverFactory'den başlat
            if (Driver.driver == null) {
                Driver.initializeDriver();
            }
            landingPage = new LandingPage();
            log.info("Driver hazır, Landing page oluşturuldu");
        } catch (Exception e) {
            log.error("Driver başlatma hatası: " + e.getMessage());
            throw new RuntimeException("Test başlatılamadı", e);
        }
    }

    @Step("Örnek test1 case'i çalıştır")
    public void ornek_test_case_calistir() {
        log.info("Örnek test case'i çalıştırılıyor...");
        landingPage.verifyLandingPageExists();
    }

    @Step("Control <countryCode> Country Clicking")
    public void control_country_clicking(String countryCode) {
        log.info(countryCode + " ülkesi kontrol ediliyor ve tıklanıyor");
        landingPage.clickCountry(countryCode);
    }

    @Step("Kullanıcı bilgileri girilir")
    public void kullaniciGirisBilgileri() throws InterruptedException {
        LandingPage.logoLogin();
    }

    @Step("Kullanıcı Giriş İşlemleri")
    public void kullaniciIsim() {
        LandingPage.logoIsim();
    }

    @AfterScenario
    public void tearDown() {
        log.info("Landing page test tamamlandı");
        // Driver'ı kapatmıyoruz, mevcut sistemde açık kalıyor
    }
}