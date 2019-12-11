$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Features/Zadanie1_koncowe.feature");
formatter.feature({
  "line": 1,
  "name": "Creating an account",
  "description": "",
  "id": "creating-an-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user can create new account",
  "description": "",
  "id": "creating-an-account;user-can-create-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "open browser with tester.codersguru.pl",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks register",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "choose private account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "fills the formular with data \u003cemail\u003e \u003cfirstname\u003e \u003clastname\u003e \u003cpassword\u003e \u003crepeatPassword\u003e \u003ccity\u003e \u003czip\u003e \u003cstreet\u003e \u003chouseNumber\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "username \u003cexpectedname\u003e should appear on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close Chromebrowser",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "creating-an-account;user-can-create-new-account;",
  "rows": [
    {
      "cells": [
        "email",
        "firstname",
        "lastname",
        "password",
        "repeatPassword",
        "city",
        "zip",
        "street",
        "houseNumber",
        "expectedname"
      ],
      "line": 13,
      "id": "creating-an-account;user-can-create-new-account;;1"
    },
    {
      "cells": [
        "hannanowa@email.com",
        "Hanna",
        "Nowa",
        "hannanowa",
        "hannanowa",
        "Lublin",
        "20-034",
        "Boczna",
        "38",
        "Hanna"
      ],
      "line": 14,
      "id": "creating-an-account;user-can-create-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "user can create new account",
  "description": "",
  "id": "creating-an-account;user-can-create-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "open browser with tester.codersguru.pl",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks register",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "choose private account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "fills the formular with data hannanowa@email.com Hanna Nowa hannanowa hannanowa Lublin 20-034 Boczna 38",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "username Hanna should appear on the page",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close Chromebrowser",
  "keyword": "And "
});
formatter.match({
  "location": "Zadanie1_koncowe.openCodersGuru()"
});
formatter.result({
  "duration": 3201341128,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1_koncowe.account()"
});
formatter.result({
  "duration": 375507517,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1_koncowe.privateaccount()"
});
formatter.result({
  "duration": 135600743,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hannanowa@email.com",
      "offset": 29
    },
    {
      "val": "Hanna",
      "offset": 49
    },
    {
      "val": "Nowa",
      "offset": 55
    },
    {
      "val": "hannanowa",
      "offset": 60
    },
    {
      "val": "hannanowa",
      "offset": 70
    },
    {
      "val": "Lublin",
      "offset": 80
    },
    {
      "val": "20-034",
      "offset": 87
    },
    {
      "val": "Boczna",
      "offset": 94
    },
    {
      "val": "38",
      "offset": 101
    }
  ],
  "location": "Zadanie1_koncowe.fillsTheFormular(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2618919475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hanna",
      "offset": 9
    }
  ],
  "location": "Zadanie1_koncowe.userloggedin(String)"
});
formatter.result({
  "duration": 199699,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1_koncowe.closeChromebrowser()"
});
formatter.result({
  "duration": 76190950,
  "status": "passed"
});
});