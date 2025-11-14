package com.testinium.And.PageSteps;

import com.testinium.And.Pages.MainPage.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import com.testinium.And.Pages.LandingPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPageSteps {

    private static final Logger log = LoggerFactory.getLogger(LoginPageSteps.class);
    private LoginPage loginPage;

    @And("Email girilir.")
    public void typeEmail(){
        loginPage.emailTxt();
    }

    @And("Şifre girilir.")
    public void typeSifre(){
        loginPage.sifreTxt();
    }

    @And("Giriş Yap butonuna tıklanır.")
    public void clickGirisYapBtn(){
        loginPage.girisYapBtn();
    }

    @Then("Başarıyla giriş yapıldığı doğrulanır.")
    public void verifyUsernameTxt(){
        loginPage.usernameTxt();
    }

}
