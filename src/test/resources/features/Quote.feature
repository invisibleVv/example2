@quote_feature
  Feature: Quote project test

    Background: Open web application
      Given I open url "http://quote-stage.portnov.com/"
      Then I should see page title contains "Quote"
    
    @Qoute1
    Scenario: Form validations (negative)
      And I click on element with xpath "//button[@id='formSubmit']"
      Then element with xpath "//label[@id='name-error']" should contain text "This field is required."
      Then element with xpath "//label[@id='username-error']" should contain text "This field is required."
      Then element with xpath "//label[@id='password-error']" should contain text "This field is required."
      Then element with xpath "//label[@id='email-error']" should contain text "This field is required."

      
    @Quote2
    Scenario: Successful submission
      And I click on element with xpath "//input[@id='name']"
      Then element with xpath "//div[@id='nameDialog']" should be displayed
      Then I type "Vova" into element with xpath "//input[@id='firstName']"
      Then I type "Verner" into element with xpath "//input[@id='lastName']"
      And I click on element with xpath "//button/span[contains(text(), 'Save')]"
      Then I type "Vova_test" into element with xpath "//input[@name='username']"
      Then I type "test@yahoo.com" into element with xpath "//input[@name='email']"
      Then I type "12345ABC" into element with xpath "//input[@name='password']"
      Then element with xpath "//input[@name='confirmPassword']" should be enabled
      Then I type "12345ABC" into element with xpath "//input[@name='confirmPassword']"
      And I switch to iframe with xpath "//iframe[@name='additionalInfo']"
      Then I type "Vova" into element with xpath "//input[@id='contactPersonName']"
      Then I type "9125462120" into element with xpath "//input[@id='contactPersonPhone']"
      And I switch to default content
      And I click on element with xpath "//button[@id='formSubmit']"
      Then element with xpath "//*[contains(text(), 'Submitted Application')]" should be displayed
      And element with xpath "//b[@name='firstName']" should contain text "Vova"
      And element with xpath "//b[@name='lastName']" should contain text "Verner"
      And element with xpath "//b[@name='username']" should contain text "Test"
      And element with xpath "//b[@name='email']" should contain text "test@yahoo.com"
      And I wait for 3 sec
      And I take screenshot