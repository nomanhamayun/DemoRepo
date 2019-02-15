Feature: Bink's website availability

  As an automation engineer
  I want to write cucumber tests
  so I can ensure Bink's website is up and running

@SmokeTest @RegressionTest
  Scenario: Bink's website Homepage Test Scenario

    Given user opens browser
    When user accesses Bink's website
    Then user lands on the homepage



