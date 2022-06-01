Feature: The Numbers Game Thrilling Prizes Card


  Scenario: TNG drawing today text before midday
    Given I am on the home screen
    And it is before 12:45pm
    Then the TNG thrilling prizes card displays "drawing today, 12:47pm"

  Scenario: TNG drawing today after midday before evening
    Given I am on the home screen
    And it is between 12:47pm and 7:47pm
    Then the TNG thrilling prizes card displays "drawing today, 12:47pm"

  Scenario: TNG drawing tomorrow
    Given I am on the home screen
    And it is after 7:47pm
    Then the TNG thrilling prizes card displays "drawing tomorrow, 12:45pm"

  Scenario: TNG Drawn Twice Daily text
    Given I am on the home screen
    Then the TNG thrilling prizes card displays "drawn twice daily"
