Feature: Logged user could filter with color

  Scenario: User Can Filter Product with Color
    Given User Selected Category and SubCategory
    And User Filter with Color
    Then Filtered Products are Displayed