Feature: Keno


  Scenario: Keno results card heading
    Given I am on the home screen
    When I tap the Keno draw results card heading
    Then the Keno game details screen is displayed

  Scenario: Keno draw card info icon
    Given I am on the home screen
    And Whe I click the information icon on the Keno draw results card
    Then the Keno game details screen is displayed

  Scenario: Keno draw card most recent drawing
    Given I am on the home screen
    Then the most recent Keno draw number is displayed
    And the Keno draw number updates automatically

  Scenario: Keno draw card view mode button
    Given I am on the home screen
    When I tap View Mode on the Keno draw results card
    Then the Keno View Mode screen is displayed

  Scenario: Keno draw card ticket mode button
    Given I am on the home screen
    When I tap Ticket Mode on the Keno draw card
    Then the Keno Ticket Form screen is displayed

  Scenario: Keno draw card past results button
    Given I am on the home screen
    When I click Past Results on the Keno draw card
    Then the Past Results screen is displayed
    And Keno is pre-selected
