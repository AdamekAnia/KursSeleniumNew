Feature: Creating an account

  Scenario Outline: user can create new account
    Given open browser with tester.codersguru.pl
    When user clicks register
    And choose private account
    And fills the formular with data <email> <firstname> <lastname> <password> <repeatPassword> <city> <zip> <street> <houseNumber>
    Then username <expectedname> should appear on the page
    And close Chromebrowser


    Examples:
      | email              | firstname   | lastname | password   | repeatPassword | city     | zip    | street  | houseNumber | expectedname |
      | hannanowa@email.com| Hanna       | Nowa     | hannanowa  | hannanowa      | Lublin   | 20-034 | Boczna  | 38          | Hanna         |
