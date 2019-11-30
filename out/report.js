$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("google-text-search.feature");
formatter.feature({
  "line": 1,
  "name": "Google search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword \u003ckeyword\u003e is entered in input field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain \u003cexpectedWord\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;",
  "rows": [
    {
      "cells": [
        "keyword",
        "expectedWord"
      ],
      "line": 10,
      "id": "google-search;user-can-search-any-keyword;;1"
    },
    {
      "cells": [
        "karol",
        "karol"
      ],
      "line": 11,
      "id": "google-search;user-can-search-any-keyword;;2"
    },
    {
      "cells": [
        "jacek",
        "jacek"
      ],
      "line": 12,
      "id": "google-search;user-can-search-any-keyword;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword karol is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain karol",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearch.openGoogleSearch()"
});
formatter.result({
  "duration": 7140321760,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karol",
      "offset": 10
    }
  ],
  "location": "GoogleSearch.enterKeyword(String)"
});
formatter.result({
  "duration": 2880998073,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karol",
      "offset": 29
    }
  ],
  "location": "GoogleSearch.theFirstOneShouldContainKeyword(String)"
});
formatter.result({
  "duration": 1163278,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.closeBrowser()"
});
formatter.result({
  "duration": 83841324,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword jacek is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain jacek",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearch.openGoogleSearch()"
});
formatter.result({
  "duration": 2480903331,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jacek",
      "offset": 10
    }
  ],
  "location": "GoogleSearch.enterKeyword(String)"
});
formatter.result({
  "duration": 2445151853,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jacek",
      "offset": 29
    }
  ],
  "location": "GoogleSearch.theFirstOneShouldContainKeyword(String)"
});
formatter.result({
  "duration": 157953,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.closeBrowser()"
});
formatter.result({
  "duration": 79991941,
  "status": "passed"
});
});