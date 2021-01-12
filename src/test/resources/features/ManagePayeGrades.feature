Feature: Admin should able to edit Payments


  Background:
    Given the user is on the login page
    Then the user should be able to login as admin


  Scenario Outline: Admin adds a payment
    When the user enter admin button
    And the user should be able to click on Job and Pay Grades
    And the user clicks add Pay Grades and assign currency as "<name>"
    And the user edits "<currency>" and assign "<min>" ve "<max>" Salary
    Then the user verify that selected currency and Salary values "<verifyCurrency>"
    Examples:
      | name  | currency                   | min  | max  | verifyCurrency       |
      | F43814 | USD - United States Dollar | 1000 | 7000 | United States Dollar |
      | L44141 | EUR - Euro                 | 1000 | 7000 | Euro                 |
     #| L43  | TRL - Turkish Lira         | 1000 | 7000 | Turkish Lira         |


# Sonraki adimimiz birden fazla <name> girilebilmeli. Assert edilebilmeli,
# sonra da excellden bir degeri otomatikman bu sayfaya verebilecek miyiz