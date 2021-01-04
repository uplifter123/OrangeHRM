$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/02_AdminJobTitleSearch.feature");
formatter.feature({
  "name": "User should be able to find any Job Title",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@hxm"
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
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using id\u003dbtnLogin\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Kaufers-MacBook-Pro.local\u0027, ip: \u00272a02:908:4c17:5580:3494:c9b0:717d:81c8%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u002712.0.1\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\n\tat com.orangehrm.step_definitions.LoginStep_Def.the_user_should_be_able_to_login_as_admin(LoginStep_Def.java:22)\n\tat ✽.the user should be able to login as admin(file:///Users/yilmaz/IdeaProjects/OrangeHRM/src/test/resources/features/02_AdminJobTitleSearch.feature:7)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Find IT manager",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hxm"
    }
  ]
});
formatter.step({
  "name": "the user enter admin button",
  "keyword": "When "
});
formatter.match({
  "location": "com.orangehrm.step_definitions.AdminJobTitleSearchStepDef.theUserEnterAdminButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should be able to click on Job and Jobtitle",
  "keyword": "Then "
});
formatter.match({
  "location": "com.orangehrm.step_definitions.AdminJobTitleSearchStepDef.theUserShouldBeAbleToClickOnJobAndJobtitle()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user find IT Manager from the table",
  "keyword": "And "
});
formatter.match({
  "location": "com.orangehrm.step_definitions.AdminJobTitleSearchStepDef.theUserFindFromTheTable()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d87.0.4280.88)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Kaufers-MacBook-Pro.local\u0027, ip: \u00272a02:908:4c17:5580:3494:c9b0:717d:81c8%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u002712.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: /var/folders/5c/y1zp5cjd5sn...}, goog:chromeOptions: {debuggerAddress: localhost:54865}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f3c29224b50949eb0d288db6727fa0da\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:837)\n\tat com.orangehrm.utilities.Driver.getDriver(Driver.java:61)\n\tat com.orangehrm.step_definitions.Hooks.tearDown(Hooks.java:24)\n",
  "status": "failed"
});
});