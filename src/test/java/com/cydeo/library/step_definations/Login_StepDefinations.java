package com.cydeo.library.step_definations;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Login_StepDefinations {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://library2.cydeo.com/login.html");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.Username.sendKeys("librarian1@library" + Keys.ENTER);
    }

    @When("user anters librarion password")
    public void user_anters_librarion_password() {
        loginPage.Password.sendKeys("qU9mrvur" + Keys.ENTER);
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        loginPage.signInButton.click();
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.Username.sendKeys("student1@library" + Keys.ENTER);
    }

    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.Password.sendKeys("d5fv9BtX" + Keys.ENTER);
    }
    @When("user enters librarian {string}")
    public void user_enters_librarian(String string) {
       loginPage.Username.sendKeys(string+Keys.ENTER);
    }
    @When("user enters library {string}")
    public void user_enters_library(String string) {
     loginPage.Password.sendKeys(string+Keys.ENTER);
    }

    @When("user enters student {string}")
    public void user_enters_student(String string) {
       loginPage.Username.sendKeys(string+Keys.ENTER);
    }
    @When("user enters students {string}")
    public void user_enters_students(String string) {
       loginPage.Password.sendKeys(string+Keys.ENTER);
    }
    @When("user enters username {string} password {string} and login")
    public void user_enters_username_password_and_login(String string, String string2) {
       loginPage.login(string,string2);
    }

}
