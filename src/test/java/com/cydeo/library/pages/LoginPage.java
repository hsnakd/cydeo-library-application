package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//label[.='Email address']")
    public WebElement Username;

    @FindBy(xpath = "//label[.='Password']")
    public WebElement Password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    public void login(String username,String password){
    Username.sendKeys(username);
    Password.sendKeys(password);
    signInButton.click();
    }

}
