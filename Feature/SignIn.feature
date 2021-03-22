@SignIn
Feature: Facebook log in feature Test

Scenario: I able to log in with valid credentials
   Given I able to go on home page
   When I click on email
   And Enter email
   And Enter passward
   And I click on log in
   Then I successfully Logged in to the page
    