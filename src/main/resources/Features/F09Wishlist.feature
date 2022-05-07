Feature: Logged user could add different products to Wishlist

  Background: User Should be Logged In

    Given User Hover Categories
    And User Select Sub Category
    Then User Opened Sub Category Page
    And User Select Product Item 1


  Scenario: add different products to Wishlist

    Given User Add Product Item 1 to Wishlist
    And Back To Home Page
    And User Select Another Category
    And User Select Product Item 2
    Then User Add Product Item 2 to Wishlist




