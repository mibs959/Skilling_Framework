Feature: Tests for the Registration feature

  Scenario: Register new user - In progress
    Given user goes to Home/Landing page
    When user click on Open Account from the Header
    Then user set a random email as Email on Create Account page
    And user set 'Tester123' as Password on Create Account page
    And user clicks on 'Create Account' from Create Account page
    Then user click on sign up manually
    And user set valid inputs on all Personal Information Page fields
    Then user click on 'I declare that Im not a US citizen' checkbox
    And user click on Submit button from Personal Information Page

#    TODO: Here complete the rest of the flow for the Manual Registration path.

    Then username is displayed on header
    And user click on Log out

