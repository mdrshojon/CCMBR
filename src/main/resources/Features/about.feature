Feature: About Header
  Scenario: Testing the Support Communities icon

    Given that I have the MA Website open
    When I tap on About icon
    And I tap on Support Communities icon
    Then the Support Communities page loads with Fiscal Year and Ne Profit information
  Scenario: Testing the News Icon
  Given that I have the MA Website open
  When I tap on About icon
  And I tap on News icon
  Then the News page loads
  Scenario: Winning Stories
    Given that I have the MA Website open


    When I tap on the About icon


    And I tap on the Winning Stories icon


    Then the Winning Stories page loads
  Scenario: For Agents
      Given that I have the MA Website open


      When I tap on About icon


      Then a dropdown is displayed


      And I tap on For Agents icon


      Then the For Agents page loads
  Scenario:  Responsible Gaming
    Given that I have the MA Website open


    When I tap on About icon


    Then a dropdown is displayed


    And I tap on Responsible Gaming


    Then the Responsible Gaming page loads
