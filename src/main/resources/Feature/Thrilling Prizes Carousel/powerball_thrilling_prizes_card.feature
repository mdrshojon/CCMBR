Feature: Powerball Thrilling Prizes Card


  Scenario: PB Drawing on date in the future
    Given I am on the home screen
    And it is not a Powerball draw day
    Then the Powerball thrilling prizes card displays "drawing on [day, time]"

  Scenario: PB drawing tomorrow text
    Given I am on the home screen
    And tomorrow is a Powerball draw day
    Then the Powerball thrilling prizes card displays "drawing tomorrow, 11:00pm"

  Scenario: PB drawing today
    Given I am on the home screen
    And today is a Powerball draw day
    Then the Powerball thrilling prizes card displays "drawing today, 11:00pm"

  Scenario: PB estimated jackpot
    Given I am on the home screen
    And it is not the Powerball draw time
    Then the Powerball estimated cash option is displayed on the Powerball thrilling prizes card

  Scenario: PB estimated jackpot pending
    Given I am on the home screen
    And it is the Powerball draw time
    Then the Powerball estimated jackpot on the Powerball thrilling prizes card is replaced with the pending state
    And the Powerball pending state is replaced with the new jackpot when the results come in

  Scenario: PB est. cash option
    Given I am on the home screen
    And it is not a Powerball draw time
    Then the Powerball estimated cash option is displayed on the Powerball thrilling prizes card

  Scenario: PB est. cash option pending
    Given I am on the home screen
    And it is the Powerball draw time
    Then the estimated cash option on the Powerball thrilling prizes card is replaced with the pending state
    And the pending state on the Powerball thrilling prizes card is replaced with the new estimated cash option when the results come in
