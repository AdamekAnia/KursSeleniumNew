Feature: Creating an account

  Scenario Outline: user can create new account
    Given an open browser with aavtrain.com
    When user clicks register button
    And fills in data <firstname>, <lastname>, <emailaddress>, <username>, <address1>, <state>, <city>, <password>, <zip>
    And user clicks submit button
    Then new account is created
    And close browser

    Examples:
      | firstname | lastname | emailaddress              | username         | address1    | state       | city     | password   | zip    |
      | Liliana   | Jaworska | lilianajaworska@email.com | liliana.jaworska | Janaszka 14 | mazowieckie | Warszawa | liliana123 | 03-034 |
      | Aldona    | Kowalik  | aldonakowalik@email.com   | aldona.kowalik   | Akacjowa 24 | lubelskie   | Lublin   | aldona123  | 10-067 |