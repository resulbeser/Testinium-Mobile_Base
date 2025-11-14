package com.testinium.And.Pages.MainPage;

import com.testinium.And.PageElement.*;
import com.testinium.And.Pages.TestiniumMasterPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import com.testinium.And.Util.Data.DataReader;

import java.util.Objects;

import static org.assertj.core.api.Assertions.fail;

public class LoginPage extends TestiniumMasterPage {

    private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

    private static TestiniumTextBox TXT_Email = new TestiniumTextBox(PageElementModel.selectorNames.XPATH, "(//android.widget.EditText[@resource-id=\"com.mobisoft.kitapyurdu:id/inputEditText\"])[1]");
    private static TestiniumTextBox TXT_Sifre = new TestiniumTextBox(PageElementModel.selectorNames.XPATH, "(//android.widget.EditText[@resource-id=\"com.mobisoft.kitapyurdu:id/inputEditText\"])[2]");
    private static TestiniumButton BTN_GirisYap = new TestiniumButton(PageElementModel.selectorNames.ID, "com.mobisoft.kitapyurdu:id/btnLogin");
    private static TestiniumLabel TXT_Username = new TestiniumLabel(PageElementModel.selectorNames.ID, "com.mobisoft.kitapyurdu:id/txt_username");


    public static void emailTxt(){
        String email = DataReader.get("EMAIL");
        TXT_Email.type(email);
    }

    public static void sifreTxt(){
        String sifre = DataReader.get("SIFRE");
        TXT_Sifre.type(sifre);
    }

    public static void girisYapBtn(){
        BTN_GirisYap.click();
    }

    public static void usernameTxt(){
        String username = TXT_Username.getElementText();
        String expected = DataReader.get("KULLANICI_ADI");

        if (Objects.equals(username, expected)) {
            System.out.println("Username doğru: " + username);
        } else {
            System.out.println("HATA: Username beklenen ile aynı değil. Gelen: " + username);
            Assert.fail("Username eşleşmedi! Beklenen: " + expected + " - Gelen: " + username);
        }
    }

}
