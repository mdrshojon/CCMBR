Feature: Games


  Scenario: Draw and Instants
    Given that I have the MA Website open
    When I select the Games icon
    And I tap on Draws and Instants
    Then the Draw and Instants page loads and all of the games display with name, price and prize info
    When I tap in the Search by game name box
    And I enter in THE NUMBERS GAME
    Then THE NUMBERS GAME thumbnail is displayed

  Scenario: Pull Tabs
    Given that I have the MA Website open
    When I select the Games icon
    Then a dropdown is displayed
    And I select the Pull Tabs icon
    Then the Pull Tabs page loads

  Scenario: Charitable Games
    Given that I have the MA Website open
    When I select the Games icon
    And I tap on Charitable Games icon
    Then the Charitable Games page loads

  Scenario: Season Tickets
    Given that I have the MA Website open
    When I select the Games icon
    And I tap on Season Tickets icon
    Then the Seasons Tickets page loads
