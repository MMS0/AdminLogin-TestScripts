Feature: Admin Login - 1) Login Module Test cases

Scenario: Verify whether it display the following when click on "options and Settings"
1.Home
2.Dashboard
3.Quick Tour
4.Settings
5.Migration Services
6.Help
7.Sign out

Given Go to Product url
And Signin using Admin Login ID "h" and Password "1"
When Click on the options and Settings icon
Then It displays the above values
And Takes Screenshot for reference
