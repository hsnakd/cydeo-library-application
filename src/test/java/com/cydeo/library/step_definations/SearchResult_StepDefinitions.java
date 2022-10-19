package com.cydeo.library.step_definations;

import com.cydeo.library.pages.SearchResultPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class SearchResult_StepDefinitions {
    SearchResultPage searchResultPage=new SearchResultPage();

    @Given("user is on the librarian page")
    public void user_is_on_the_librarian_page() {
        Driver.getDriver().get("https://library2.cydeo.com/login.html");
        searchResultPage.usersColumns.click();
    }
    @Then("user should see below columns")
    public void user_should_see_below_columns(List<String> expectedColumns) {

        List<String> actualColumns= BrowserUtils.dropdownOptionsAsString(searchResultPage.usersColumns);
        Assert.assertEquals(expectedColumns,actualColumns);
    }

}
