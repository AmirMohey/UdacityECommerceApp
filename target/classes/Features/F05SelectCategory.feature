Feature:  Logged user could select different Categories

  Background: User Should be Logged In
    When User Navigated to Log In Page
    And User Enter Valid Email and Password
    And User Clicked Log In Button
    Then User Logged In Successfully

  Scenario: User Can Select Category and Sub-Category
    Given User Hover Categories
    And User Select Sub Category
    Then User Opened Sub Category Page
