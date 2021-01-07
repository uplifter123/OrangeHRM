Feature: Admin should able to edit Payments

  Background:
    Given the user is on the login page
    Then the user should be able to login as admin

  Scenario Outline: Admin adds a payment
    When the user enter admin button
    And the user should be able to click on Job and Pay Grades
    And the user clicks add Pay Grades and assign currency
    And the user edits "<currency>" and assign  <min> - <max> Salary
    Then the user verify that selected currency and Salary values
    Examples:
      | currency | min | max |
      | TRY      | 100 | 300 |
      | USD      | 50  | 150 |





