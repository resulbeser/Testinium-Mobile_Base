package com.testinium.And.Pages.MainPage;

import com.testinium.And.PageElement.*;
import com.testinium.And.Pages.TestiniumMasterPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import com.testinium.And.Util.Data.DataReader;

import java.util.Objects;

import static org.assertj.core.api.Assertions.fail;

public class CartPage extends TestiniumMasterPage {

    private static final Logger log = LoggerFactory.getLogger(CartPage.class);

    private static TestiniumButton BTN_SepeteEkle = new TestiniumButton(PageElementModel.selectorNames.ID, "com.mobisoft.kitapyurdu:id/addToCartNormalView");
    private static TestiniumButton BTN_Sepet = new TestiniumButton(PageElementModel.selectorNames.ID, "com.mobisoft.kitapyurdu:id/navigation_cart");
    private static TestiniumLabel TXT_EklenenUrun = new TestiniumLabel(PageElementModel.selectorNames.ID, "com.mobisoft.kitapyurdu:id/productCountTextView");
    private static TestiniumButton BTN_Sil = new TestiniumButton(PageElementModel.selectorNames.ID, "com.mobisoft.kitapyurdu:id/buttonDelete");
    private static TestiniumButton BTN_Sil2 = new TestiniumButton(PageElementModel.selectorNames.XPATH, "//android.widget.RelativeLayout[@content-desc=\"Sil\"]");

    public static void sepeteEkleBtn(){
        BTN_SepeteEkle.click();
    }

    public static void sepetBtn(){
        BTN_Sepet.click();
    }

    public static void eklenenUrunTxt() {
        String eklenenUrun = TXT_EklenenUrun.getElementText();
        String expected = DataReader.get("EKLENEN_URUN_TXT");

        if (eklenenUrun != null && eklenenUrun.contains(expected)) {
            System.out.println("Alınan text doğru, expected text'i içeriyor: " + eklenenUrun);
        } else {
            System.out.println("HATA: Alınan text beklenen text'i içermiyor. Gelen: " + eklenenUrun);
            Assert.fail("Alınan text'i içermiyor! Beklenen: " + expected + " - Gelen: " + eklenenUrun);
        }
    }

    public static void sepettenSilBtn(){
        BTN_Sil.click();
        BTN_Sil2.click();
    }

}
