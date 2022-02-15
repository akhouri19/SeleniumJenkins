$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Test login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "launch login url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.launch_login_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter creds",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.enter_creds()"
});
formatter.result({
  "status": "passed"
});
});