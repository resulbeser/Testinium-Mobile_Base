// src/test/java/com/testinium/And/Pages/MainPage/KampanyaPage.java
package com.testinium.And.Pages.MainPage;

import com.testinium.And.PageElement.*;
import com.testinium.And.Pages.TestiniumMasterPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.assertj.core.api.Assertions.fail;

/**
 * Kampanya Page - Kitapyurdu Mobil
 * Kampanyalar butonunu tıklama ve sayfanın açıldığını doğrulama işlemleri
 */
public class KampanyaPage extends TestiniumMasterPage {

    private static final Logger log = LoggerFactory.getLogger(KampanyaPage.class);

    // Verilen xpath'e göre kampanyalar butonu
    private static TestiniumButton BTN_Kampanyalar = new TestiniumButton(
            PageElementModel.selectorNames.ID,
            "com.mobisoft.kitapyurdu:id/navigation_campaigns"
    );


    // Kampanya sayfasında görülebilecek bir başlık/label. Uygulamaya göre bu locator değiştirilebilir.
    private static TestiniumLabel LBL_KampanyaHeader = new TestiniumLabel(PageElementModel.selectorNames.XPATH,
            "//android.widget.TextView[contains(@text,'Kampanya') or contains(@text,'Kampanyalar')]");

    public static void clickKampanyalarButton() {
        log.info("Kampanyalar butonuna tıklanıyor...");
        try {
            BTN_Kampanyalar.click();
            log.info("Kampanyalar butonuna tıklandı");
        } catch (Exception e) {
            log.error("Kampanyalar butonuna tıklanamadı: " + e.getMessage());
            fail("Kampanyalar butonuna tıklama işlemi başarısız");
        }
    }

    public static void verifyKampanyaPageOpened() {
        log.info("Kampanya sayfası doğrulanıyor...");
        try {
            if (LBL_KampanyaHeader.isExist()) {
                log.info("Kampanya sayfası açıldı ve başlık bulundu");
            } else {
                log.error("Kampanya başlığı bulunamadı");
                fail("Kampanya sayfası açılmadı veya beklenen başlık görüntülenmedi");
            }
        } catch (Exception e) {
            log.error("Kampanya sayfası doğrulama hatası: " + e.getMessage());
            fail("Kampanya sayfası doğrulaması başarısız");
        }
    }}

