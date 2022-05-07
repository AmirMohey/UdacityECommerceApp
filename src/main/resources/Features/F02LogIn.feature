

Feature: Test Sign Up , Log In and Reset Password

  Scenario:  User could log in with valid email and password

    When User Navigated to Log In Page
    And User Enter Valid Email and Password
    And User Clicked Log In Button
    Then User Logged In Successfully