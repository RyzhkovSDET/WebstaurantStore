Feature: A a user, I want to add an item to the cart, then delete it.
  @wip
  Scenario: A a user, I should search and add an item to the cart, then delete it.
    Given user on the WebstaurantStore home page
    When  user search "stainless work table"
    Then  title should be "Table" on this page
    When  user add on last item to the cart
    And  user move to Cart
    When  user click on button  Empty Cart
    Then  cart should see massage "Your cart is empty."




