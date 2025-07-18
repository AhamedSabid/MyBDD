@smoke
Feature: Automating Test Practice site

  Scenario: : Automating Test Practice site

    Given I have a url "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/"
    And wait for 5 seconds
    Then I verify the links are available
    And Close the browser
