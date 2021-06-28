$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_21_ReadAllCountriesFromDataset.feature");
formatter.feature({
  "name": "Country Api validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CountryApi"
    }
  ]
});
formatter.background({
  "name": "api end point is set in response",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user provides api end point to set the response using \"https://www.gmibank.com/api/tp-countries\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "test all country data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CountryApi"
    },
    {
      "name": "@ReadCountry"
    }
  ]
});
formatter.step({
  "name": "User gets and manipulates all country data",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});