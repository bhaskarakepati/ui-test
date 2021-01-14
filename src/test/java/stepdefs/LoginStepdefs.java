package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.SignUpPage;
import sun.rmi.runtime.Log;
import utilities.Browser;
import utilities.PropertyLoader;

public class LoginStepdefs extends BasePage {

    private SignUpPage signUpPage;

    public LoginStepdefs(SignUpPage signUpPage){
        this.signUpPage = signUpPage;
    }
    public WebDriver driver = null;

    @Given("^I have a url$")
    public void iHaveAUrl() {
       // initialize();
        driver = BasePage.driver;
        driver.get(prop.getProperty("url"));
    }

    @When("^I click on New Customer$")
    public void iClickOnNewCustomer() throws InterruptedException{

        signUpPage.clickNewCustomer();
        Thread.sleep(10000);
    }

    @And("^enter email address$")
    public void enterEmailAddress() {
    }

    @And("^click on continue$")
    public void clickOnContinue() {
    }

    @Then("^it should move to new customer page$")
    public void itShouldMoveToNewCustomerPage() {
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
