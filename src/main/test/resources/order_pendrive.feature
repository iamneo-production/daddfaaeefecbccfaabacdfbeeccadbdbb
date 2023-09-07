Feature: Order HP Pen Drive with Different Quantities on Amazon

  Scenario Outline: Order HP Pen Drive with Quantity
    Given User is on the Amazon homepage
    When User searches for "HP Pen Drive"
    And Adds the first result on the page with quantity <qty> to the cart
    Then Cart should display <qty> HP Pen Drive

    Examples:
      | qty |
      | 1   |
      | 2   |
      | 5   |
