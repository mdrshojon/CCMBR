Feature: The Numbers Game


  Scenario: TNG draw card heading
    Given I am on the home screen
    When I tap the TNG draw card heading
    Then the TNG game details screen is displayed

  Scenario: TNG draw card information icon
    Given I am on the home screen
    When I click the information icon on the TNG draw card
    Then the TNG game details screen is displayed

  Scenario: TNG calendar left arrow default
    Given I am on the home screen
    Then the left calendar arrow is in an active state

  Scenario: TNG right arrow default
    Given I am on the home screen
    And I haven't changed the date on the TNG calendar
    Then the right calendar arrow on the TNG draw card is gray and inactive

  Scenario: TNG right arrow active
    Given I am on the home screen
    And I have changed the TNG calendar to a previous date
    Then the right calendar arrow on the TNG draw card is in an active state

  Scenario: TNG date default
    Given I am on the home screen
    And I have not changed the TNG calendar date
    Then the TNG calendar displays the date of the most recent draw

  Scenario: TNG past date
    Given I am on the home screen
    And I select a previous draw date on the TNG draw card
    Then the TNG calendar displays the selected date
    And the TNG results for that date are displayed

  Scenario: TNG calendar icon

  Scenario: TNG calendar select past date

  Scenario: TNG calendar select future date
    Given I am on the home screen
    When I open the calendar on the TNG draw card
    Then I am unable to select a future date

  Scenario: TNG draw card midday drawing
    Given I am on the home screen
    And it is after 12:47pm
    Then the TNG midday drawing results are displayed for the current date

  Scenario: TNG draw card midday drawing pending
    Given I am on the home screen
    And it is 12:47pm
    Then the TNG draw card midday displays a pending state
    And it auto updates to display the TNG midday results when they come in
    And the evening section displays "drawing closes at 7:45 pm"

  Scenario: TNG draw card midday draw video link
    Given I am on the home screen
    When I click on the TNG draw video link
    Then the TNG draw video for that date is displayed

  Scenario: TNG draw card midday prize payout
    Given I am on the home screen
    When I click the TNG Midday prize payout link
    Then the midday prize payout information for that date is displayed in an overlay

  Scenario: TNG draw card midday video link pending
    Given I am on the home screen
    And it is 12:47pm
    Then the midday draw video link is not displayed while the pending state is displayed
    And the draw video link auto populates once the video is available

  Scenario: TNG draw card midday prize payout pending

  Scenario: TNG draw card evening drawing

  Scenario: TNG draw card evening drawing pending

  Scenario: TNG draw card evening drawing after midday before evening
