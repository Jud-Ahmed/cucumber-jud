
Feature: Title of your feature

 Feature: login functionality

Scenario: valid log in to HRM
  Given  I navigated to HRM Website
  When I enter a valid username 
  And I enter a valid password
  And I clicked on the submit button
  Then   I validate that I am logged in 
  And I quite the browser
  
  
    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
