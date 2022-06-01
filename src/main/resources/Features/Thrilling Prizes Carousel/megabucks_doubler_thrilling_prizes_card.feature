Feature: Megabucks Doubler Thrilling Prizes Card


  Scenario: MBD Drawing on date in the future
    Given I am on the home screen
    And it is not a Megabucks Doubler draw day
    Then the Megabucks Doubler thrilling prizes card displays "drawing on [next draw date, time]"

  Scenario: MBD drawing today
    Given I am on the home screen
    And It is a Megabucks Doubler draw day
    Then the Megabucks Doubler thrilling prizes card displays "drawing today, 11:00pm"

  Scenario: MBD drawing tomorrow text
    Given I am on the home screen
    And tomorrow is a Megabucks Doubler draw day
    Then the mega millions thrilling prizes carousel card displays "drawing today, 11:30pm"

  Scenario: MBD estimated jackpot
    Given I am on the home screen
    And it is not the Megabucks Doubler draw time
    Then the Megabucks Doubler estimated jackpot is displayed on the mega millions thrilling prizes card

  Scenario: MBD estimated jackpot pending
    Given i am on the home screen
    And it is the Mega Millions draw time
    Then the mega millions thrilling prizes card displays the pending state
    And the mega million thrilling prizes card displays the new estimated jackpot when it comes in

  Scenario: MBD est. cash option
    Given I am on the home screen
    And it is not the Megabucks Doubler draw time
    Then the megabucks doubler thrilling prizes card displays the estimated cash option

  Scenario: MBD est. cash option pending
    Given I am on the home screen
    And it is the Megabucks Doubler draw time
    Then the Megabucks Doubler thrilling prizes card displays the pending state
    And the Megabucks Doubler estimated cash option is displayed when the results come in
