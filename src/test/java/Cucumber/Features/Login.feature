Feature: Tests for the Login feature

  Scenario: User can successfully Log in
    Given user goes to Home/Landing page
    When user click on Log In from the Header
    Then user logs in with valid credentials
    And username is displayed on header
    Then user click on Log out
