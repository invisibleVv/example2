@e2e_MarketTest
  Feature: Multiple Scenarios for tests market place
    Background: Open web application
      Given client open "store-stage" main menu

    @e2e_Add_items
    Scenario Outline: Add items to shopping cart
      When client "<add item>" to the shopping cart
      Then client wait for "view cart" to be present
      Then client click on the "view cart" button
      Then client should see "cart" page
      When client clear "quantity" field
      And client chooses "<quantity>" for item
      Then client click on the "update cart" button
      Then client should see "updating" notification
      Then client should see "total" cost "<equal>"

      Examples:
      | add item | quantity | equal |
      | iMac | 1        | $1,933.93 |
      | iPhone XR | 3   | $2,254.28 |
      | AirPods Pro | 5 | $1,338.38 |

    @e2e_Remove_items
    Scenario Outline: Tests for remove items from shopping cart
      When client "<add item>" to the shopping cart
      Then client wait for "view cart" to be present
      Then client click on the "view cart" button
      Then client should see "cart" page
      When client clear "quantity" field
      And client chooses "<quantity>" for item
      Then client click on the "update cart" button
      Then client should see "updating" notification
      Then client should see "total" cost "<equal>"
      When client click on the "remove from cart" icon
      Then client should see "removed item" notification

      Examples:
        | add item | quantity | equal |
        | iMac | 1        | $1,933.93 |
        | iPhone XR | 3   | $2,254.28 |
        | AirPods Pro | 5 | $1,338.38 |

    @e2e_Purchasing_items
    Scenario Outline: E2E purchasing items with partial removal items from shopping cart
      Then client click on the "My account" icon
      Then client type "username" for username field and "password" for password field
      And client click on the "log in" button
      Then client click on the "Get started" button
      When client "<add item>" to the shopping cart
      Then client wait for "view cart" to be present
      Then client click on the "view cart" button
      Then client should see "cart" page
      When client clear "quantity" field
      And client chooses "<quantity>" for item
      Then client click on the "update cart" button
      Then client should see "updating" notification
      Then client should see "total" cost "<equal>"
      When client click on the "proceed to checkout" button
      Then client should see "checkout" page
      And client "fills" in the required fields
      Then client click on the "place order" button

      Examples:
      | add item | quantity | equal |
      | AirPods Pro | 3 | $803.03 |