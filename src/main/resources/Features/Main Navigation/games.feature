Feature: Games Header
  Scenario: Draw and Instants


    Given I have the MA website open


    When I tap on Tools  icon


    Then a dropdown is displayed


    When I tap on Past Results


    And the Past Results page loads


    And I select All or Nothing from the Game dropdown


    Then the Game & Results list is displayed
  Scenario:   Pull Tabs


      Given that I have the MA Website open


      When I select the Games icon


      Then a dropdown is displayed


      And I select the Pull Tabs icon


      Then the Pull Tabs page loads
  Scenario:      Charitable Games


  Given that I have the MA Website open


  When I select the Games icon


  And I tap on Charitable Games icon

      Then the Charitable Games page loads
  Scenario: Season Tickets
  Given that I have the MA Website open
    When I select the Games icon
    And I tap on Season Tickets icon
    Then the Seasons Tickets page loads
