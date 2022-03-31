Feature: As a user, I want to add an item to the cart, then delete it.
  @wip
  Scenario: As a user, I want search and add an item to the cart, then delete it.
    Given user is on the WebstaurantStore home page
    When  user search for "stainless work table"
    Then  title should be "Table"
    When  user add on last item to the cart
    And   user navigates to the Cart
    When  user click on the Empty Cart button
    Then  user should see massage "Your cart is empty."




