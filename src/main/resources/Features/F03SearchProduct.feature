Feature: Logged User could search for any product

  Background: User Should be Logged In
    When User Navigated to Log In Page
    And User Enter Valid Email and Password
    And User Clicked Log In Button
    Then User Logged In Successfully

  Scenario: User Can Search for Product
    Given Enter Search Keyword
    And Navigated to Search Screen
    #Then  Search Keyword is Diplayed