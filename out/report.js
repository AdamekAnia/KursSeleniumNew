$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Zadanie14_i_15.feature");
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
  "name": "an open browser with aavtrain.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks register button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "fills in data \u003cfirstname\u003e \u003clastname\u003e \u003cemailaddress\u003e \u003cusername\u003e \u003caddress1\u003e \u003cstate\u003e \u003ccity\u003e \u003cpassword\u003e \u003czip\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "new account is created",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "creating-an-account;user-can-create-new-account;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "emailaddress",
        "username",
        "address1",
        "state",
        "city",
        "password",
        "zip"
      ],
      "line": 11,
      "id": "creating-an-account;user-can-create-new-account;;1"
    },
    {
      "cells": [
        "Liliana",
        "Jaworska",
        "lilianajaworska@email.com",
        "liliana.jaworska",
        "Janaszka",
        "AK",
        "Warszawa",
        "liliana123",
        "99501"
      ],
      "line": 12,
      "id": "creating-an-account;user-can-create-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "user can create new account",
  "description": "",
  "id": "creating-an-account;user-can-create-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with aavtrain.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks register button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "fills in data Liliana Jaworska lilianajaworska@email.com liliana.jaworska Janaszka AK Warszawa liliana123 99501",
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
  "line": 7,
  "name": "new account is created",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Zadanie14_i_15.openAavtrain()"
});
formatter.result({
  "duration": 4780349841,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie14_i_15.registerNewUser()"
});
formatter.result({
  "duration": 498405926,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Liliana Jaworska lilianajaworska@email.com liliana.jaworska Janaszka AK Warszawa liliana123 99501",
      "offset": 14
    }
  ],
  "location": "Zadanie14_i_15.fillsTheFormular(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2849530,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027cucumber.test.Zadanie14_i_15.fillsTheFormular(String,String,String,String,String,String,String,String,String) in file:/home/anna/IdeaProjects/KursSelenium/target/test-classes/\u0027 with pattern [fills in data (.*)] is declared with 9 parameters. However, the gherkin step has 1 arguments [Liliana Jaworska lilianajaworska@email.com liliana.jaworska Janaszka AK Warszawa liliana123 99501]. \nStep: And fills in data Liliana Jaworska lilianajaworska@email.com liliana.jaworska Janaszka AK Warszawa liliana123 99501\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\n",
  "status": "failed"
});
formatter.match({
  "location": "Zadanie14_i_15.accountcreated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Zadanie14_i_15.closeBrowser()"
});
formatter.result({
  "status": "skipped"
});
});