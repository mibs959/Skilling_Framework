Feature: Registration of a new user

  Scenario: User successfully register a user
    Given user goes to Kaboo Home page
    When user click on Open Free Account
    Then user completes the 1st section of the registration
    And user clicks on Next button from Registration page
    Then user completes the 2nd section of the registration
    And user clicks on Register Now button from Registration page
