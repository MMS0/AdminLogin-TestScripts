$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TC_PRF_001.feature");
formatter.feature({
  "line": 1,
  "name": "Admin Login - 1) Login Module Test cases",
  "description": "",
  "id": "admin-login---1)-login-module-test-cases",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify whether it display the following when click on \"options and Settings\"",
  "description": "1.Home\n2.Dashboard\n3.Quick Tour\n4.Settings\n5.Migration Services\n6.Help\n7.Sign out",
  "id": "admin-login---1)-login-module-test-cases;verify-whether-it-display-the-following-when-click-on-\"options-and-settings\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Go to Product url",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Signin using Admin Login ID \"h\" and Password \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click on the options and Settings icon",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "It displays the above values",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Takes Screenshot for reference",
  "keyword": "And "
});
formatter.match({
  "location": "TC_PRF_001.go_to_Product_url()"
});
formatter.result({
  "duration": 11178834212,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Sign In\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027kaasprold4\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-70-generic\u0027, java.version: \u00271.8.0_222\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: /tmp/.com.google.Chrome.tj4FjP}, goog:chromeOptions: {debuggerAddress: localhost:38875}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f2c349a87ecdbcf82df3bdae8fb109bd\n*** Element info: {Using\u003dlink text, value\u003dSign In}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat stepDefenition.Login_Module.TC_PRF_001.go_to_Product_url(TC_PRF_001.java:22)\n\tat ✽.Given Go to Product url(TC_PRF_001.feature:12)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "h",
      "offset": 29
    },
    {
      "val": "1",
      "offset": 46
    }
  ],
  "location": "TC_PRF_001.signin_using_Admin_Login_ID_and_Password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC_PRF_001.click_on_the_options_and_Settings_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC_PRF_001.it_displays_the_above_values()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC_PRF_001.takes_Screenshot_for_reference()"
});
formatter.result({
  "status": "skipped"
});
});