Feature: Tools Header
  Scenario: Claim a Prize
    Given I have the MA website open
    When I tap on Tools  icon
    And a dropdown is displayed
    Then I select the Claim a Prize icon
    And the Claim a Prize page loads
  Scenario: Location Finder
    Given I have the MA website open
    When I select the Tools Icon
    And a dropdown is displayed
    And I tap on Location Finder icon
    Then the Location Finder page loads
  Scenario: Prizes Remaining
    Given I have the MA website open
    When I tap on Tools  icon
    And a dropdown is displayed
    And I tap on Prizes Remaining icon
    Then the Prizes Remaining page loads
    And I select $2 from the Ticket Cost dropdown
    And I select Top from the Prize Type dropdown
    And I select $9999 or below from the Prize Amount dropdown
    Then the Prizes Remaining list is displayed with Game, Prize Amount, Start, Claimed, Remaining and Game Details information
  Scenario: Past Results
    Given I have the MA website open
    When I tap on Tools  icon
    Then a dropdown is displayed
    When I tap on Past Results
    And the Past Results page loads
    And I select All or Nothing from the Game dropdown
    Then the Game & Results list is displayed
    Given that I have the MA Website open
  Scenario: Winners
    When I tap on Tools icon
    And a dropdown is displayed
    And I tap on Winners icon
    Then the Winners page loads
    And I select 100x from the Game dropdown
    And I select 30 days ago date and today's date
    Then Winners list is displayed with Date and Prize information