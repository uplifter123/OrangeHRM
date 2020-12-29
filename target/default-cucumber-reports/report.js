$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "User should be able to login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as admin",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.orangehrm.step_definitions.LoginStep_Def.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login as admin",
  "keyword": "Then "
});
formatter.match({
  "location": "com.orangehrm.step_definitions.LoginStep_Def.the_user_should_be_able_to_login_as_admin()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});