Feature:  Signup Feature
  @regression @smoke @sanity @test
  Scenario: User should be able to create a brand new email with unique email
    Given user in TalentTEK Homepage
    And  user click on the "Create new account" button
    When User enter First and Last name
    And user enter their valid email
    And user enter password
    And user enter confirm password
    And user  enter month under Birth Date
    And user enter date under Birth Date
    And user enter year under Birth Date
    And user enter their gender as male
    And user agrees on terms and condition checkbox
    And user clicks on Create my account button
    Then User should be able to get their studentId
