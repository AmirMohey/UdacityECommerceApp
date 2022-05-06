Feature: Logged user could filter with color

  Background: User Should be Logged In
    When User Navigated to Log In Page
    And User Enter Valid Email and Password
    And User Clicked Log In Button
    Then User Logged In Successfully


  Scenario: User Can Filter Product with Color
    Given User Selected Category and SubCategory
    And User Filter with Color
    Then Filtered Products are Displayed