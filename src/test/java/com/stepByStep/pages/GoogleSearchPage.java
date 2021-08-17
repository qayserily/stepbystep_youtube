package com.stepByStep.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public WebDriver driver;

    public GoogleSearchPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[name='q']")
    public WebElement search;

    @FindBy(css ="[data-ved='2ahUKEwijyp2izrjyAhUx8bsIHZffC_AQFnoECAwQAw'] > .LC20lb")
    public WebElement cybertek;

   public void googleSearch(String input){
       search.sendKeys(input, Keys.ENTER);
   }

}
