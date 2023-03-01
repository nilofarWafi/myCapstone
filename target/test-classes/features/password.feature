 Feature: change password
  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'nil810@gmail.com' and password '123@Jasmin'
    And User click on login butten
    And User should be logged in into Account
    When User click on Account option
 
 @password
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | 123@Jasmin       | 123@Jasm    | 123@Jasm        |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'