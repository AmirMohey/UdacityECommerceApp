Feature: Logged User could search for any product

  Background: User Should be Logged In


  Scenario: User Can Search for Product
    Given Enter Search Keyword
    And Navigated to Search Screen
    Then  Search Keyword is Displayed