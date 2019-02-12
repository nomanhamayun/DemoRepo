Feature: Contact Bink

  As an Business user
  I want to visit Bink's website
  so I can contact Bink with my query

  @SmokeTest
  Scenario: Ensure Bink can be contacted

    Given User is on Bink Contact page
    And user fills in the form
    When user submit the form
    Then form is submitted
    And user is informed
