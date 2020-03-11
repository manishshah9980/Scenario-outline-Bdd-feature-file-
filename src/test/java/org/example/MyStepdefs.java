package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyStepdefs extends Utils {

    Homepage homepage = new Homepage();

    @Given("user is on homepage")
    public void userIsOnHomepage() {
    }
 // ENTER USERNAME AND PASSWORD
    @When("user enter {string}  And user enter {string}")
    public void userEnterAndUserEnter(String username, String password) {
        homepage.enterUsername(username);
        homepage.enterPassword(password);
    }
 // TO CLICK ON LOGIN BUTTON
    @And("click on login Button")
    public void clickOnLoginButton() {
        homepage.clickOnLogin();
    }

    @Then("user should not able to login")
    public void userShouldNotAbleToLogin() {
    }
    // USER CAN SEE ERROR MESSAGE
    @And("user can see error {string}")
    public void userCanSeeError(String message) {

        String actual = getTextFromElement(By.xpath("//span[@id=\"spanMessage\"]"));
        String expected = message;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();          }
        Assert.assertEquals(expected, actual);  }
}

