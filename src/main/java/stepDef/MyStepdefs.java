package stepDef;

import baseClass.BaseClass;
import com.google.common.base.Equivalence;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.RegisterPage;
import util.Utilities;


public class MyStepdefs extends BaseClass {

    public RegisterPage registerPage;
    Utilities utilities = new Utilities();

    @Given("I have a url {string}")
    public void iHaveAUrl(String url) {

        initBrowser();
        loadUrl(url);
    }

    @When("I fill firstname as {string} and Lastname as {string}")
    public void iFillFirstnameAsAndLastnameAs(String firstname, String lastname) {
        registerPage = new RegisterPage();
        //registerPage.firstName.sendKeys(firstname);
        //registerPage.lastName.sendKeys(lastname);
        utilities.enterText(registerPage.firstName, firstname);
        utilities.enterText(registerPage.lastName, lastname);
    }

    @Then("I fill address as {string}")
    public void iFillAddressAs(String address) {

        // registerPage.address.sendKeys(address);
        utilities.enterText(registerPage.address, address);
    }

    @And("Close the browser")
    public void closeTheBrowser() {

        closeBrowser();
    }

    @And("wait for {int} seconds")
    public void waitForSeconds(int arg0) throws InterruptedException {

        utilities.waitForSeconds(arg0);
    }

    @Then("I verify the links are available")
    public void iVerifyTheLinksAreAvailable() {

        WebElement pandaHeading = driver.findElement(By.xpath("//h1[text()='Automation Panda']"));
        WebElement HomeLink = driver.findElement(By.xpath("(//li/a[text()='Home'])[1]"));

        Assert.assertTrue(pandaHeading.isDisplayed());
        Assert.assertTrue(HomeLink.isDisplayed());

    }
}
