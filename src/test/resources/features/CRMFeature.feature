Feature: Free CRM Login feature

  As an automation engineer
  I want to write cucumber tests
  so I can complete a demo framework

@SmokeTest @RegressionTest
  Scenario Outline: Free CRM login Test Scenario

    Given User is already on Login Page
    When title of page login page is Free CRM
    Then user enters invalid credentials "<username>" and "<password>"
    And user clicks on login button
    And user views error message

  Examples:

   | username       | password   |
   | noman          | software123 |
   | Tom            | Test435    |

@SmokeTest
  Scenario Outline: Follow Sign up link

    Given User is already on Login Page
    When title of page login page is Free CRM
    Then user enters invalid credentials "<username>" and "<password>"
    Then user click on the signup link
    Then user is directed to the Registration page

  Examples:

  | username       | password   |
  | noman          | software123 |
  | Tom            | Test435    |
