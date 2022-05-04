package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //storing element in variable

    By signLink = By.xpath("//li[@class='header__nav-item header__nav-sign-in']//a[normalize-space()='Sign In']");
    By emailField = By.xpath("//input[@id='user[email]']");
    By passwordField = By.xpath("//input[@id='user[password]']");
    By signInButton = By.xpath("//input[@value='Sign in']");
    By errorMessage = By.xpath("//li[@role='alert']");

    // for each element need to create method

//    public String getWelcomeText(){
//
//        return getTextFromElement(welcomeText);
//    }
    public void enterEmailId(String email){

        sendTextToElement(emailField,email);
        }
    public void enterPassword(String password){

        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(signInButton);
    }
    public String getErrorMessage(){

        return getTextFromElement(errorMessage);
    }
}
