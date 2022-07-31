#Author: arunsinghratwaana@gmail.com

@tag1
Feature: Validate Different Options in App

  Scenario: Validate App option
    Given I opened the Application
    And I tab on App option
    When I click on Action Bar option
    And I tab on Display Options
    Then I click on NAVIGATION
    And click on DISPLAY_SHOW_TITLE
