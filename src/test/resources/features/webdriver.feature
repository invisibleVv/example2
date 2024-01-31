Feature: WebDriver feature

  Scenario: Test scenario for web driver
    Given client open web page


  Scenario: Portnov responsive test
    Given client open portnov web page
    Then client set browser size to mobile

  Scenario: Iterate through elements
    Given client open test url for form
    And client type "111" into all input fields
    Then client wait for 2 sec

  Scenario: Location strategy examples
    Given I open url "https://quote-stage.portnov.com/"
    Then I search for the element

  Scenario: s8 Quote Project
    Given I visit Quote Page in the "QA" Environment
    When I enter "username" for the Username field
    And I enter "first" for first name and "last" for last name in the Name field
    And I enter "email@yahoo.com" in the Email field
    When I enter "password" in the Password field
    And I enter "password" in the ConfirmPassword field
    Then I "check" the Privacy Policy checkbox
    When I click on the "Send" button at the bottom of the page
    Then I verify we see the Submitted Application Page
