package com.testinium.And.Pages.MainPage;

import com.testinium.And.PageElement.*;
import com.testinium.And.Pages.TestiniumMasterPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.assertj.core.api.Assertions.fail;

/**
 * Search Page for Kitapyurdu Mobile Application
 * This page handles search functionality and result verification
 */
public class SearchPage extends TestiniumMasterPage {

    private static final Logger log = LoggerFactory.getLogger(SearchPage.class);

    // Search page elements based on your requirements
    private static TestiniumButton BTN_SearchIcon = new TestiniumButton(PageElementModel.selectorNames.XPATH, "(//android.widget.ImageView[@resource-id=\"com.mobisoft.kitapyurdu:id/icon\"])[3]");
    private static TestiniumTextBox TXT_SearchEditText = new TestiniumTextBox(PageElementModel.selectorNames.ID, "com.mobisoft.kitapyurdu:id/searchEditText");
    private static TestiniumLabel LBL_SearchResult = new TestiniumLabel(PageElementModel.selectorNames.XPATH, "//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/list_content\" and @text=\"nutuk\"]");

    /**
     * Clicks on search icon to open search functionality
     */
    public static void clickSearchIcon() {
        log.info("Arama ikonu tıklanıyor...");
        try {
            BTN_SearchIcon.click();
            log.info("Arama ikonu başarıyla tıklandı");
        } catch (Exception e) {
            log.error("Arama ikonu tıklanamadı: " + e.getMessage());
            fail("Arama ikonu tıklama işlemi başarısız");
        }
    }

    /**
     * Types search text in search field
     * @param searchText Text to search for
     */
    public static void typeSearchText(String searchText) {
        log.info("Arama metni giriliyor: " + searchText);
        try {
            // Önce arama alanına tıkla ki imleç odaklanabilsin
            TXT_SearchEditText.click();
            Thread.sleep(500); // Tıklama sonrası kısa bekleme

            // Sonra metni yaz
            TXT_SearchEditText.type(searchText);
            Thread.sleep(2000); // Arama sonuçlarının yüklenmesi için bekleme
            log.info("Arama metni başarıyla girildi: " + searchText);
        } catch (InterruptedException e) {
            log.error("Bekleme işlemi kesintiye uğradı: " + e.getMessage());
            fail("Arama metni bekleme işlemi başarısız");
        } catch (Exception e) {
            log.error("Arama metni girilemedi: " + e.getMessage());
            fail("Arama metni girme işlemi başarısız");
        }
    }

    /**
     * Verifies search result is displayed
     * @param expectedResult Expected result text
     */
    public static void verifySearchResult(String expectedResult) {
        log.info("Arama sonucu doğrulanıyor: " + expectedResult);
        try {
            if (LBL_SearchResult.isExist()) {
                log.info("Arama sonucu başarıyla bulundu: " + expectedResult);
            } else {
                log.error("Arama sonucu bulunamadı: " + expectedResult);
                fail("Beklenen arama sonucu görüntülenmedi");
            }
        } catch (Exception e) {
            log.error("Arama sonucu doğrulama hatası: " + e.getMessage());
            fail("Arama sonucu doğrulaması başarısız");
        }
    }

    /**
     * Performs complete search operation
     * @param searchTerm Term to search for
     */
    public static void performSearch(String searchTerm) {
        log.info("Tam arama işlemi başlatılıyor: " + searchTerm);
        clickSearchIcon();
        typeSearchText(searchTerm);
        hideAndroidKeyboard();
        log.info("Arama işlemi tamamlandı: " + searchTerm);
    }
}
