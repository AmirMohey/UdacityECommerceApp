
Feature: Logged user could add different products to compare list


  Background: User Should be Logged In
    When User Navigated to Log In Page
    And User Enter Valid Email and Password
    And User Clicked Log In Button
    Then User Logged In Successfully
    Given User Hover Categories
    And User Select Sub Category
    Then User Opened Sub Category Page
    And User Select Product Item 1


  Scenario: add different products to Wishlist

    Given User Add Product Item 1 to Compare List
    And Back To Home Page
    And User Select Another Category
    And User Select Product Item 2
    Then User Add Product Item 2 to Compare List




