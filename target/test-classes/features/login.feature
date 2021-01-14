Feature: This is to test Login feature

  Scenario: Testing the New user functionality
    Given I have a url
    When I click on New Customer
    And enter email address
    And click on continue
    Then it should move to new customer page