
Feature: Logged user could add different products to Shopping cart

  Background: User Should be Logged In
    When User Navigated to Log In Page
    And User Enter Valid Email and Password
    And User Clicked Log In Button
    Then User Logged In Successfully
    Given User Hover Categories
    And User Select Sub Category
    Then User Opened Sub Category Page


  Scenario: add different products to Shopping cart
    Given User Select Product Item 1
    When User Add Product Item 1 to Shopping cart
    And Back To Home Page
    And User Select Another Category
    And User Select Product Item 2
    And User Add Product Item 2 to Shopping cart
    Then Product Item 2 Added Successfully



