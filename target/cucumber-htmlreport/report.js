$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("artOfTesting\\test\\googleCalc.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Addition1",
  "description": "",
  "id": ";addition1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@DEM-37"
    },
    {
      "line": 4,
      "name": "@googleCalc.feature"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open google",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter \"2+2\" in search textbox",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get result as \"4\"",
  "keyword": "Then "
});
formatter.match({
  "location": "googleCalcStepDefinition.I_open_google()"
});
formatter.result({
  "duration": 5216460351,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2+2",
      "offset": 9
    }
  ],
  "location": "googleCalcStepDefinition.I_enter_in_search_textbox(String)"
});
formatter.result({
  "duration": 8444193035,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 24
    }
  ],
  "location": "googleCalcStepDefinition.I_should_get_correct_result(String)"
});
formatter.result({
  "duration": 7351218596,
  "status": "passed"
});
});