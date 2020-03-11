$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/Feature/Login.feature");
formatter.feature({
  "name": "login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User enter invalid credentials to login,",
  "description": "  so he will see error message \"invalid Credentials\"",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user enter \"\u003cusername\u003e\"  And user enter \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on login Button",
  "keyword": "And "
});
formatter.step({
  "name": "user should not able to login",
  "keyword": "Then "
});
formatter.step({
  "name": "user can see error \"\u003cmessage\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "message"
      ]
    },
    {
      "cells": [
        "Abcd1",
        "Xyz11",
        "Invalid credentials"
      ]
    },
    {
      "cells": [
        "Abcd1",
        "admin123",
        "Invalid credentials"
      ]
    },
    {
      "cells": [
        "Abcd1",
        "",
        "Password cannot be empty"
      ]
    },
    {
      "cells": [
        "",
        "admin123",
        "Username cannot be empty"
      ]
    },
    {
      "cells": [
        "Admin",
        "Xyz11",
        "Invalid credentials"
      ]
    },
    {
      "cells": [
        "",
        "",
        "Username cannot be empty"
      ]
    },
    {
      "cells": [
        "Abcd1",
        "",
        "Password cannot be empty"
      ]
    },
    {
      "cells": [
        "",
        "admin123",
        "Username cannot be empty"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User enter invalid credentials to login,",
  "description": "  so he will see error message \"invalid Credentials\"",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user enter \"Abcd1\"  And user enter \"Xyz11\"",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userEnterAndUserEnter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login Button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldNotAbleToLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see error \"Invalid credentials\"",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.userCanSeeError(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
