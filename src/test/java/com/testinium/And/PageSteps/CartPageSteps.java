package com.testinium.And.PageSteps;

import com.testinium.And.Pages.MainPage.CartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CartPageSteps {

    private static final Logger log = LoggerFactory.getLogger(CartPageSteps.class);
    private CartPage cartPage;

    @And("Sepete Ekle butonuna tıklanır.")
    public void clickSepeteEkleBtn(){
        cartPage.sepeteEkleBtn();
    }

    @And("Sepet butonuna tıklanır.")
    public void clickSepetBtn(){
        cartPage.sepetBtn();
    }

    @Then("Sepete ürün eklendiği doğrulanır.")
    public void verifyEklenenUrunTxt(){
        cartPage.eklenenUrunTxt();
    }

    @And("Sepet temizlenir.")
    public void clickSepettenSilBtn(){
        cartPage.sepettenSilBtn();
    }

}
