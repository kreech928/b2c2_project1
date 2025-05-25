Feature: Candidate navigating through the main sections of the website

  Background:
    Given User is on the home page

  Scenario: User checks the existence of the contact form
    When User goes to the 'contact' page, fill foam and submit
    Then "Are you a robot" pop up shows up

    Scenario: User checks the existence of offers for Zielona Gora
      When User goes to the career page and filters the offers
      Then User sees more then 5 job offerts in Zielona Gora


