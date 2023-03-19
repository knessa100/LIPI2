Feature:  Signup Feature

  Scenario: User should be able to create a brand new email with unique email
    Given user in TalentTEK Homepage
    And when user click on the create new account button
    When User enter first name
    And User enter last name
    And user enter email
    And user enter password
    And user enter confirm password
    And user  enter birth date
    And select gender button
    And user select check box for term
    And user click on create my account
    Then User should see the confirmation
