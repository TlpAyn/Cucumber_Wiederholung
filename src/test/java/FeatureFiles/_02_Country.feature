
Feature: Login Functionality


  Scenario: Login with valid username und pass
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And  Navigate to country page
    When create a country
    Then Success message should be displayed