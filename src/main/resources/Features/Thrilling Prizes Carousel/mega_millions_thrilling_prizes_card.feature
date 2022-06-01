Feature: Mega Millions Thrilling Prizes Card


  Scenario: MM Drawing on date in the future
    Given I am on the home screen
    And it is not a Mega Millions draw day
    Then the mega millions thrilling prizes carousel displays "drawing on [next draw date]"

  Scenario: MM drawing today
    Given I am on the home screen
    And it is a Mega Millions draw day
    Then the mega millions thrilling prizes card displays "drawing today, 11:00 pm"

  Scenario: MM draw tomorrow text
    Given I am on the home screen
    And tomorrow is a Mega Millions draw day
    Then the mega millions thrilling prizes carousel displays "drawing tomorrow, 11:00 pm"

  Scenario: MM estimated jackpot
    Given I am on the home screen
    And it is not the mega millions draw time
    Then the mega millions estimated jackpot is displayed on the mega millions thrilling prizes card

  Scenario: MM estimated jackpot pending
    Given I am on the home screen
    And it is the mega millions draw time
    Then the estimated jackpot on the mega millions thrilling prizes card is in the pending state
    And the jackpot is displayed in place of the pending state once it comes in

  Scenario: MM est. cash option
    Given I am on the home screen
    And it is not a Mega Millions draw day
    Then the estimated cash option is displayed on the mega millions thrilling prizes card

  Scenario: MM est. cash option pending
    Given I am on the home screen
    And it is the mega millions draw time
    Then the estimated cash option is replaced with the pending state on the mega millions thrilling prizes card
    And the estimated cash option replaced the pending state once the results come in
