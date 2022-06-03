Feature: Lucky for Life Thrilling Prizes Card


  Scenario: L4L drawing today text
    Given I am on the home screen
    And it is a Lucky for Life draw day
    Then the Lucky for Life thrilling prizes card displays "drawing today, 10:00pm"

  Scenario: L4L drawing tomorrow text
    Given I am on the home screen
    And tomorrow is a Lucky for Life draw day
    Then the Lucky for Life thrilling prizes card displays "drawing tomorrow, 10:00pm"

  Scenario: L4L drawing in the future text
    Given I am on the home screen
    And it is not a Lucky for Life draw day
    Then the Lucky for Life thrilling prizes card displays "drawing on [next draw day], 10:00pm"

  Scenario: L4L Est. Top Prize
    Given I am on the home screen
    Then the Lucky for Life thrilling prizes card displays the estimated top prize information
