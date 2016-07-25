Feature: To test gmail login
  Scenario: Login to gmail with valid credentials
    Given The gmail login page is loaded
    When User enters the credentials
    Then User logs into Gmail