Feature:  Logged user could select different tags

  Background: User Should be Logged In
      When User Navigated to Log In Page
      And User Enter Valid Email and Password
      And User Clicked Log In Button
      Then User Logged In Successfully
      Given User Hover Categories
      And User Select Sub Category
      Then User Opened Sub Category Page

  Scenario: User can Filter with Tags
      Given User Select Tags
      Then tagged Products are Displayed