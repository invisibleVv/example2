package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;


public class MyStepdefs {
    @Given("client open the main page")
    public void clientOpenTheMainPage() {
        getDriver().get("http://quote-stage.portnov.com/");
    }

    @Then("the main page title should be displayed")
    public void theMainPageTitleShouldBeDisplayed() {
        assertThat(getDriver().findElement(By.xpath("//div[@id='quotePageForm']")).isDisplayed()).isTrue();
    }

    @When("client click on the {string} field")
    public void clientClickOnTheField(String nameField) {
        String xpath = "//input[@name='"+nameField+"']";
        getDriver().findElement(By.xpath(xpath)).click();
    }

    @Then("client should see pop-up menu")
    public void clientShouldSeePopUpMenu() {
        assertThat(getDriver().findElement(By.xpath("//div[@id='nameDialog']")).isDisplayed()).isTrue();
    }

    @And("client should see {string} and {string} buttons in the pop-up menu")
    public void clientShouldSeeAndButtonsInThePopUpMenu(String name1, String name2) {
        String b1 = "//span[contains(text(), '"+name1+"')]";
        String b2 = "//span[contains(text(), '"+name2+"')]";
        WebElement button1 = getDriver().findElement(By.xpath(b1));
        WebElement button2 = getDriver().findElement(By.xpath(b2));
        assertThat(button1.getText()).contains(name1);
        assertThat(button2.getText()).contains(name2);
    }

    @Then("^client wait for (\\d+) sec$")
    public void clientWaitForSec(int sec) throws Exception {
        Thread.sleep(sec * 1000);
    }

    @Given("client navigate to the main page")
    public void clientNavigateToTheMainPage() {
        getDriver().get("https://store-stage.portnov.com/");
    }

    @Then("the landing page should be displayed")
    public void theLandingPageShouldBeDisplayed() {
        assertThat(getDriver().findElement(By.xpath("//div[@id='content']")).isDisplayed()).isTrue();
    }

}
