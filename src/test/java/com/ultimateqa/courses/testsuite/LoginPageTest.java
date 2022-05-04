package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = homePage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }
    @Test
    public void verifyTheErrorMessage(){
    homePage.clickOnLoginLink();
    loginPage.enterEmailId("prime123@gmail.com");
    loginPage.enterPassword("123");
    loginPage.clickOnLoginButton();
    String expectedErrorMessage = "Invalid email or password.";
    String actualErrorMessage = loginPage.getErrorMessage();
    Assert.assertEquals(expectedErrorMessage,actualErrorMessage,"Invalid credentials");
  }


//    @Test
//    public void verifyErrorMessageWithInvalidCredentials(){
//        homePage.clickOnLoginLink();
//        loginPage.enterEmailId("prime123@gmail.com");
//        loginPage.enterPassword("prime123");
//        loginPage.clickOnLoginButton();
//        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
//                + "No customer account found";
//        String actualErrorMessage = loginPage.getErrorMessage();
//        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
//    }

}
