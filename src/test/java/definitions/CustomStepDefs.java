package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.*;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class CustomStepDefs {
    @Given("client open web page")
    public void clientOpenWebPage() throws InterruptedException {
        getDriver().navigate().to("https://google.com");
        Thread.sleep(2000);
        WebElement searchBar = getDriver().findElement(By.xpath("//*[@name='q']"));
        searchBar.sendKeys("Portnov");
        searchBar.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
        getDriver().navigate().back();
        Thread.sleep(1000);
        getDriver().navigate().forward();
        Thread.sleep(1000);
        getDriver().navigate().refresh();
        Thread.sleep(1000);
    }

    @Given("client open portnov web page")
    public void clientOpenPortnovWebPage() {
        getDriver().get("https://portnov.com");
    }

    @Then("client set browser size to mobile")
    public void clientSetBrowserSizeToMobile() throws Exception {
        getDriver().manage().window().setSize(new Dimension(998,600));
        WebElement headerBar = getDriver().findElement(By.xpath("//*[@id='header-bar-desktop']"));
        assertThat(headerBar.isDisplayed()).isFalse();
        Thread.sleep(1000);
    }

    @Given("client open test url for form")
    public void clientOpenTestUrlForForm() {
        getDriver().get("https://testautomationpractice.blogspot.com/");
    }

    @And("client type {string} into all input fields")
    public void clientTypeIntoAllInputFields(String inputString) {
        List<WebElement> webElementList = getDriver().findElements(By.xpath("//input[@type='text']"));
        for (WebElement we : webElementList) {
            we.sendKeys(inputString);
        }
    }

    @Then("I search for the element")
    public void iSearchForTheElement() {
        WebElement we = getDriver().findElement(By.id("name"));
        WebElement we2 = getDriver().findElement(By.cssSelector("#name"));
        WebElement we3 = getDriver().findElement(By.tagName("iframe"));
        WebElement we4 = getDriver().findElement(By.xpath("//*[contains(text(), 'Get a Quote')]"));
        WebElement we5 = getDriver().findElement(By.className("application"));

    }
}
