Feature: Admin should able to edit Payments

  Background:
    Given the user is on the login page
    Then the user should be able to login as admin

  Scenario Outline: Admin adds a payment
    When the user enter admin button
    And the user should be able to click on Job and Pay Grades
    And the user clicks add Pay Grades and assign currency as "<name>"
    And the user edits "<curreency>" and assign "<min>" ve "<max>" Salary
    Then the user verify that selected currency and Salary values "
    Examples:
      | name | curreency | min | max |
      | G89 | TRL       | 100 | 300 |
    # | G13  | USD       | 50  | 150 |

