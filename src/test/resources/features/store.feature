Feature: Store stage test
  
  Scenario: Responsive UI validations
    Given I open url "https://store-stage.portnov.com/"
    And I resize window to 700 and 1000
    And I take screenshot
    Then element with xpath "//nav[@id='site-navigation']" should not be displayed
    And I resize window to 800 and 1000
    And I take screenshot
    Then element with xpath "//nav[@id='site-navigation']" should be displayed
    