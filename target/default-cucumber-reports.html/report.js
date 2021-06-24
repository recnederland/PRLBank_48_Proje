$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_016_MoneyTransfer.feature");
formatter.feature({
  "name": "US016 Money Transfer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MoneyTransfer"
    }
  ]
});
formatter.scenario({
  "name": "User does every step to transfer money between user\u0027s accounts",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MoneyTransfer"
    }
  ]
});
formatter.step({
  "name": "user go to \"https://gmibank-qa-environment.com/\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "DUser navigates to sign in page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "DUser provide a valid username",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "DUser provide a valid password",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on the sign in button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "DUser navigates My Accounts Page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "DUser gets the info about Users accounts balance",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "DUser navigates to Transfer Money Page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "DUser does the money transfer",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "DUser navigates My Accounts Page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "DUser validates that User s money transferred successfully",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});