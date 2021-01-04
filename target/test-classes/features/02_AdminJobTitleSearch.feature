Feature: User should be able to find any Job Title

  Background:
    Given the user is on the login page
    Then the user should be able to login as admin
    @wip
    Scenario: Find IT manager
      When the user enter admin button
      Then the user should be able to click on Job and Jobtitle
      And the user find IT Manager from the table
      And the user click on the ItManager