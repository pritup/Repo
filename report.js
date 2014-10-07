$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample_TypicalCaptureGroup\\FeatureFile.feature");
formatter.feature({
  "id": "this-is-a-feature-file",
  "description": "",
  "name": "This is a Feature file",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-is-a-feature-file;application-scenario",
  "description": "",
  "name": "Application Scenario",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I am available on \"Tuesday,Friday,Sunday\"",
  "keyword": "Given ",
  "line": 4
});
formatter.match({
  "arguments": [
    {
      "val": "Tuesday,Friday,Sunday",
      "offset": 19
    }
  ],
  "location": "Sample1.I_am_available_on(String\u003e)"
});
formatter.result({
  "duration": 534244354,
  "status": "passed"
});
});