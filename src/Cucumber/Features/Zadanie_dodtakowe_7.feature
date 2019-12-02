Feature: Creating an account

  Scenario Outline: user can create new account
    Given an open browser with aavtrain.com
    When user clicks register button
    And fills in data <firstname> <lastname> <emailaddress> <username> <address1> <state> <city> <password> <zip>
    Then new account is created
    And close the browser

    Examples: