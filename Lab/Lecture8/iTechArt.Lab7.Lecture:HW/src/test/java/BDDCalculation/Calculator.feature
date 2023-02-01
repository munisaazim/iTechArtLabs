Feature: Calculation Sum
  In order to use sum function
  As user
  I want to sum 2 plain numbers
  Scenario: Add two numbers
    Given I start calculator
    And I have the first number 5
    And I have the second number 2
    When I want to sum this numbers
    Then the result should be 7

  Scenario: Subtract two numbers
    Given I start calculator
    And I have subtractNumber 10
    And I have subtractNumberTwo 5
    When I want to subtract this numbers
    Then the result is 5

    Scenario: Divide two numbers
      Given I start calculator
      And I have divisinNumber 10
      And I have divisinNumberTwo 5
      When I want to divide this numbers
      Then the result of division is 2

  Scenario: Multiple two numbers
    Given I start calculator
    And I have multipleNumber 10
    And I have multipleNumberTwo 5
    When I want to multiple this numbers
    Then the result of multiple is 50


