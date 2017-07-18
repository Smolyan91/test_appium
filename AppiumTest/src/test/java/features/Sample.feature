Feature: Hello World

  Scenario: Registration Flow Validation via App
    As a user I should be able to see my google account
    when I try to register myself in Quikir

    When I launch Quikr app
     And I choose to log in using Google
    Then I see account picker screen with my email address "testinggapp11@gmail.com"