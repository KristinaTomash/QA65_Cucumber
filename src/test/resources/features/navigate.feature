Feature: HomePage

@navigate
  Scenario: Verify HomePage tittle is displayed
    Given User launches Chrome browser
    When User opens iLCarro HomePage
    Then User verifies HomePage title
  And User quites browser