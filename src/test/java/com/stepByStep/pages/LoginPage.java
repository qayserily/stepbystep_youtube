package com.stepByStep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver ldriver ;

    public LoginPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(id="Email")
    @CacheLookup
    WebElement txtEmail ;

    @FindBy(xpath = "//*[@id='Password']")
    @CacheLookup
    WebElement txtPassword ;

    @FindBy(css = "<button type='submit' class='button-1 login-button'>Log in</button>")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id='navbarText']/ul/li[3]/a")
    @CacheLookup
    WebElement lnkLogout;

    public void setUserName(String userName){
        txtEmail.clear();
        txtEmail.sendKeys(userName);
    }

    public void setPassword(String password){
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public void clickLogout(){
        lnkLogout.click();
    }
}
