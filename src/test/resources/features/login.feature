Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens iLCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message is displayed
    And User quites browser

    @wrongPassword
    Scenario Outline: Login with valid email and wrong password
      Given User launches Chrome browser
      When User opens iLCarro HomePage
      And User clicks on Login link
      And User enters valid email and wrong password
      |email|password|
      |<email>|<password>|
      And User clicks on Yalla button
      Then User verifies Error message is displayed
      And User quites browser
      Examples:
        |email|password|
        |Test321@gmail.com|Test12345$|
        |Test321@gmail.com|Test12345|
        |Test321@gmail.com|est12345$|




