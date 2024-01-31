@quote_outline
Feature: Quote project outline tests

  @Quote2
  Scenario Outline: Applications test
    Given I open url "http://quote-stage.portnov.com/"
    Then I should see page title contains "Quote"
    And I click on element with xpath "//input[@id='name']"
    Then element with xpath "//div[@id='nameDialog']" should be displayed
    Then I type "<firstname>" into element with xpath "//input[@id='firstName']"
    Then I type "Verner" into element with xpath "//input[@id='lastName']"
    And I click on element with xpath "//button/span[contains(text(), 'Save')]"
    Then I type "Vova_test" into element with xpath "//input[@name='username']"
    Then I type "test@yahoo.com" into element with xpath "//input[@name='email']"
    Then I type "12345ABC" into element with xpath "//input[@name='password']"
    Then element with xpath "//input[@name='confirmPassword']" should be enabled
    Then I type "12345ABC" into element with xpath "//input[@name='confirmPassword']"
    And I click on element with xpath "//button[@id='formSubmit']"
    And I wait for 3 sec
    Examples:
      |  firstname |
      | Vladimir |