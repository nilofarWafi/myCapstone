Feature: Sign in Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signIn
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'nil810@gmail.com' and password '123@Jasmin'
    And User click on login butten
    Then User should be logged in into Account

  @creatAcount
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email                | password  | confirmPassword |
      | Jasmin | jasmin127344@gmail.com | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page

 
  
