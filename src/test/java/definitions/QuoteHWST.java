package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class QuoteHWST {
    @Given("I visit Quote Page in the {string} Environment")
    public void iVisitQuotePageInTheEnvironment(String environmentName) {
        if (environmentName.equals("QA")) {
            getDriver().get("https://quote-stage.portnov.com/");
        } else {
            System.out.println("Environment " + environmentName +" not supported.");
        }
    }

    @When("I enter {string} for the Username field")
    public void iEnterForTheUsernameField(String userName) {
//        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
        String xpath = "//input[@name='username']";
        WebElement userNameField = getDriver().findElement(By.xpath(xpath));
        userNameField.sendKeys(userName);
    }


    @And("I enter {string} for first name and {string} for last name in the Name field")
    public void iEnterForFirstNameAndForLastNameInTheNameField(String firstName, String lastName) {
        String xpath = "//input[@name='name']";
        WebElement nameField = getDriver().findElement(By.xpath(xpath));
        nameField.sendKeys(firstName + " " + lastName);
    }

    @And("I enter {string} in the Email field")
    public void iEnterInTheEmailField(String email) {
        String xpath = "//input[@name='email']";
        getDriver().findElement(By.xpath(xpath)).sendKeys(email);
    }

    @When("I enter {string} in the Password field")
    public void iEnterInThePasswordField(String password) {
        String xpath = "//input[@name='password']";
        getDriver().findElement(By.xpath(xpath)).sendKeys(password);
    }

    @And("I enter {string} in the ConfirmPassword field")
    public void iEnterInTheConfirmPasswordField(String confirmPassword) {
        String xpath = "//input[@name='confirmPassword']";
        getDriver().findElement(By.xpath(xpath)).sendKeys(confirmPassword);
    }

    @Then("I {string} the Privacy Policy checkbox")
    public void iThePrivacyPolicyCheckbox(String check) {
        String xpath = "//input[@name='agreedToPrivacyPolicy']";
        WebElement agreeCheckbox = getDriver().findElement(By.xpath(xpath));
        agreeCheckbox.click();
        if (agreeCheckbox.getAttribute("checked") != null) {
            System.out.println("The checkbox is checked");
        }
//        if (agreeCheckbox.isSelected()) {
//            System.out.println("checked");
//        }
    }


    @When("I click on the {string} button at the bottom of the page")
    public void iClickOnTheButtonAtTheBottomOfThePage(String send) {
        String xpath = "//button[@id='formSubmit']";
        getDriver().findElement(By.xpath(xpath)).click();
    }

    @Then("I verify we see the Submitted Application Page")
    public void iVerifyWeSeeTheSubmittedApplicationPage() {
        String xpath = "//legend[contains(text(), 'Submitted Application')]";
        WebElement title = getDriver().findElement(By.xpath(xpath));
        assertThat(title.isDisplayed()).isTrue();
    }
}
