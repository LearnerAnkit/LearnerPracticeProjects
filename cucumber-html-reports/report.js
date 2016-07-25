$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testfeatures.feature");
formatter.feature({
  "line": 1,
  "name": "To test gmail login",
  "description": "",
  "id": "to-test-gmail-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6426108612,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Login to gmail with valid credentials",
  "description": "",
  "id": "to-test-gmail-login;login-to-gmail-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "The gmail login page is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters the credentials",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User logs into Gmail",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailLoginScenario.loadGmailPage()"
});
formatter.result({
  "duration": 5381649225,
  "status": "passed"
});
formatter.match({
  "location": "GmailLoginScenario.enterCredentials()"
});
formatter.result({
  "duration": 2656118559,
  "status": "passed"
});
formatter.match({
  "location": "GmailLoginScenario.loggedIn()"
});
formatter.result({
  "duration": 2518191588,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat cucumberexpo.GmailLoginScenario.loggedIn(GmailLoginScenario.java:61)\r\n\tat ✽.Then User logs into Gmail(testfeatures.feature:5)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 714241585,
  "status": "passed"
});
});