Feature: All or Nothing


  Scenario: AoN results card heading
    Given I am on the home screen
    When I click the All or Nothing draw card heading
    Then the All or Nothing game details screen is displayed

  Scenario: AoN draw card info icon
    Given I am on the home screen
    When I click the information icon on the All or Nothing draw card
    Then the All or Nothing game details screen is displayed

  Scenario: AoN draw card most recent drawing
    Given I am on the home screen
    When I view the All or Nothing draw card
    Then the most recent All or Nothing draw number is displayed
    And the draw number updates automatically

  Scenario: AoN draw card view mode button
    Given I am on the home screen
    When I click View Mode on the All or Nothing draw card
    Then the All or Nothing view mode screen is displayed

  Scenario: AoN draw card ticket mode button
    Given I am on the home screen
    When I click Ticket Mode on the All or Nothing draw card
    Then the All or Nothing ticket form screen is displayed

  Scenario: AoN draw card past results button
    Given I am on the home screen
    When I click Past Results on the All or Nothing draw card
    Then the Past Results screen is displayed
    And All or Nothing is pre-populated
