Feature: LoginSteps

  Scenario: Test the valid login
    Given user is on login page
    When user enters username and password
    Then click on Login Button
    Then User should land on home page
