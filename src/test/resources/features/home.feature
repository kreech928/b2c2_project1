Feature: Candidate navigating through the main sections of the website

  Background:
    Given User is on the home page

  Scenario: User checks the existence of the contact form
    When User goes to the 'contact' page
    Then Contact page contain contact form and user can fill it

    Scenario: User checks the existence of offers for Zielona Gora
      When User goes to the career page and filters the offers
      Then User sees filtered job offers


