package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Market2;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class MarketTests {
    @Given("client open {string} main menu")
    public void clientOpenMainMenu(String urlName) {
        getDriver().get(Market2.getUrlFor(urlName));
    }


    @When("client {string} to the shopping cart")
    public void clientToTheShoppingCart(String itemName) {
        getDriver().findElement(By.xpath(Market2.getXpathFor(itemName))).click();
    }

    @Then("client wait for {string} to be present")
    public void clientWaitForBePresent(String elementName) {
        new WebDriverWait(getDriver(),3, 200)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(Market2
                                .getXpathFor(elementName))));
    }

    @Then("client click on the {string} button")
    public void clientClickOnTheButton(String elementName) {
        new WebDriverWait(getDriver(),2, 200)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(Market2
                                .getXpathFor(elementName))));
        getDriver().findElement(By.xpath(Market2.getXpathFor(elementName))).click();
    }

    @Then("client should see {string} page")
    public void clientShouldSeePage(String elementName) {
        WebElement title = getDriver().findElement(By.xpath(Market2.getXpathFor(elementName)));
        assertThat(title.isDisplayed()).isTrue();
    }

    @When("client clear {string} field")
    public void clientClearField(String elementName) {
        getDriver().findElement(By.xpath(Market2.getXpathFor(elementName))).clear();
    }

    @And("client chooses {string} for item")
    public void clientChoosesForItem(String quantity) {
        getDriver().findElement(By.xpath(Market2.getXpathFor(quantity))).sendKeys(quantity);
    }

    @Then("client should see {string} notification")
    public void clientShouldSeeUpdatingNotification(String elementName) {
        new WebDriverWait(getDriver(),3,200).
                until(ExpectedConditions.presenceOfElementLocated((By.
                        xpath(Market2.getXpathFor(elementName))))).isDisplayed();
    }


    @Then("client should see {string} cost {string}")
    public void clientShouldSeeCost(String elementName, String totalCost) {
        String actualText = getDriver().findElement(By.xpath(Market2.getXpathFor(elementName))).getText();
        assertThat(actualText.contains(totalCost)).isTrue();
    }


    @When("client click on the {string} icon")
    public void clientClickOnTheIcon(String elementName) {
        getDriver().findElement(By.xpath(Market2.getXpathFor(elementName))).click();
    }

    @And("client {string} in the required fields")
    public void clientInTheRequiredFields(String iAm) {
        List<WebElement> webElementList = getDriver().findElements(By.xpath("//input[@class='input-text ']"));
        for (WebElement we : webElementList) {
            we.sendKeys(iAm);
        }
    }


    @Then("client type {string} for username field and {string} for password field")
    public void clientTypeForUsernameFieldAndForPasswordField(String username, String password) {
        WebElement usernameField = getDriver().findElement(By.xpath(Market2.getXpathFor(username)));
        WebElement passwordField = getDriver().findElement(By.xpath(Market2.getXpathFor(password)));

        usernameField.sendKeys("Test1");
        passwordField.sendKeys("Testing_Testing1");
    }
}
