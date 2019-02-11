Feature: Free CRM Login feature

  As an automation engineer
  I want to write cucumber tests
  so I can complete a demo framework

  Scenario: Free CRM login Test Scenario

    Given User is already on Login Page
    When title of page login page is Free CRM
    Then user enters invalid username and password
    And user clicks on login button
    And user views error message