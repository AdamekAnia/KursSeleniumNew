Feature: Creating an account

  Scenario Outline: user can create new account
    Given open browser with aavtrain.com
    When user clicks register button
    And fills in with data <firstname> <lastname> <emailaddress> <username> <address1> <state> <city> <password> <zip>
    Then new account is created
    And close the browser

    Examples:
      | firstname | lastname | emailaddress              | username         | address1 | state | city     | password   | zip   |
      | Liliana   | Jaworska | lilianajaworska@email.com | liliana.jaworska | Janaszka | AK    | Warszawa | liliana123 | 99501 |
#      | Aldona    | Kowalik  | aldonakowalik@email.com   | aldona.kowalik   | Akacjowa | 45    | Lublin   | aldona123  | 10067 |