Feature: Mass Cash Thrilling Prizes Card


  Scenario: MC drawing today text
    Given I am on the home screen
    And to day is a Mass Cash draw day
    Then "drawing today, 9:47pm" is displayed on the Mass Cash thrilling prizes card

  Scenario: MC drawing closed text
    Given that I have the MA Website open
    And it is the Mass Cash draw time
    Then the Mass Cash thrilling prizes card displays "drawing tomorrow, 9:47pm"

  Scenario: MC Estimated Top Prize
    Given I am on the home screen
    Then the Mass Cash thrilling prizes card displays the estimated top prize information
