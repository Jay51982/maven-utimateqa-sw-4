package com.ultimateqa.courses.pages;


import com.google.common.base.Verify;
import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
   /* 1. userShouldNavigateToLoginPageSuccessfully
   * click on the ‘Sign In’ link
   * * Verify the text ‘Welcome Back!’
    */


    By signLink = By.xpath("//li[@class='header__nav-item header__nav-sign-in']//a[normalize-space()='Sign In']");
    By welcomeText = By.xpath("//h1[@class='page__heading']");

    public void clickOnLoginLink(){
        clickOnElement(signLink);
    }
    public String getWelcomeText(){

        return getTextFromElement(welcomeText);
    }

}
