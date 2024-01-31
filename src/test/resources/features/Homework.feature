@Homework
  Feature: Homework tests

    @Startpage
    Scenario: Startpage test for Cucumber
      Given I open url "https://www.startpage.com/"
      Then I should see page title contains "Startpage"
      Then I type "Cucumber" into element with xpath "//input[@id='q']"
      Then I click on element with xpath "//form[@id='search']/../..//button[@id='search-btn']"
      Then element with xpath "//div[@id='main']" should contain text "Cucumber"
      Then I wait for 3 sec
      Then I take screenshot


    @e2e_iMac
    Scenario: iMac e2e scenario
      Given I open url "https://store-stage.portnov.com/"
      Then element with xpath "//div[contains(@class, 'swiper-wrapper')]" should be displayed
      Then I click on element with xpath "//h2[contains(text(), 'iMac')]"
      Then I clear element with xpath "//input[@name='quantity']"
      Then I type "2" into element with xpath "//input[@name='quantity']"
      Then I click on element with xpath "//button[@name='add-to-cart']"
      Then I wait for element with xpath "//div[@class='woocommerce-message']" to be present
      Then I click on element with xpath "//div/a[contains(text(), 'View cart')]"
      Then element with xpath "//tr[@class='order-total']" should contain text "$3,598.00"
      Then I wait for 2 sec
      Then I take screenshot


    @e2e_iMac2
    Scenario: iMac e2e scenario2
      Given I open url "https://store-stage.portnov.com/"
      Then element with xpath "//div[contains(@class, 'swiper-wrapper')]" should be displayed
      Then I click on element with xpath "//li[3]/a[contains(text(), 'Add to cart')]"
      Then I wait for 3 sec
      Then I click on element with xpath "//li/a[contains(text(), 'View cart')]"
      Then I clear element with xpath "//input[@class='input-text qty text']"
      Then I type "2" into element with xpath "//input[@class='input-text qty text']"
      Then I click on element with xpath "//button[@name='update_cart']"
      Then I wait for 2 sec
      Then element with xpath "//div[contains(text(), 'Cart updated')]" should be displayed
      And element with xpath "//tr[@class='order-total']" should contain text "$3,598.00"
      Then I wait for 2 sec
      Then I take screenshot


    @quote_project
    Scenario: Verifying user can see "Save" and "Cancel" buttons in the pop-up menu in the "Name" field
      Given client open the main page
      Then the main page title should be displayed
      When client click on the "name" field
      Then client should see pop-up menu
#      Then pop-up menu should be displayed
      And client should see "Save" and "Cancel" buttons in the pop-up menu
      Then client wait for 3 sec

    @e2e_iMac_Auto_test
    Scenario: Auto test for iMac
      Given client navigate to the main page
      Then the landing page should be displayed
      When client click on the "Add to cart" button for "iMac"
      Then client wait for 3 sec
      Then client should see "View cart" button
      When client click on the "View cart" button
      Then "Cart" page should be displayed
      When client set items quantity to "2"
      And client click on the "Update cart" button
      Then client wait for 3 sec
      Then client should see updating notification
      Then items total amount should be "$3,598.00"
      Then client wait for 2 sec

