@Smoke
Feature: Logged User can Create Successful Order


Background: User Should be Logged In
  When User Navigated to Log In Page
  And User Enter Valid Email and Password
  And User Clicked Log In Button
  Then User Logged In Successfully
  Given User Hover Categories
  And User Select Sub Category
  Then User Opened Sub Category Page
  Given User Select Product Item 1
  When User Add Product Item 1 to Shopping cart

  Scenario: User Can Make Order
    Given User Go To Shipping Cart Page
    And Update Quantity Count
    And User Click Checkout
    And User Fill Shipping Address Form
    And User Select Shipping Method
    And User Select Payment Method
    And User Select Payment Information
    Then User Confirm Order
