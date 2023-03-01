Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'nil810@gmail.com' and password '123@Jasmin'
    And User click on login butten
    And User should be logged in into Account
    When User click on Account option

  @updateProfile
  Scenario: Varify User can update Profile Information
    And User update Name 'jasmin' and Phone '1234567898'
    And User click on Update button
    Then User profile information should be updated

  

  @addPaimentMethod
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1034567801133109 | Jasmin     |              09 |           2027 |          132 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @editDebitOrCreditCard
  Scenario: Verify User can edit Debit or Credit card
    And User click on bank card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1111219111318811 | Ershad     |              10 |           2026 |          333 |
    And user click on Update Your Card button
    #Then a message should be displayed 'String'

  @removeDebitOrCredit
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And User fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city      | state    | zipCode |
      | Afghanistan     | nh       |  5711111111 | 3333 main dr  |   3 | Kabul | Kabul |   22193 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @editAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress   | apt | city    | state | zipCode |
      | Afghanistan | ershad   |  5710000000 | 3444 bicycle pl |   3 | Kabul | Kabul |   22222 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @removeAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
