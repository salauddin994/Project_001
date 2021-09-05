Feature: Login
  Scenario: User logs in and sees their profile name
    Given user at login page
    And  input email in email editBox
    Then input password in password editBox
    When click on login button
    Then User should able to logged in succefullly and able to sees the profile name


