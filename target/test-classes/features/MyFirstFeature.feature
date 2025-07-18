Feature: This a feature file for my BDD FW dev

  Scenario: This is my first scenario for my BDD
    Given I have a url "https://demo.automationtesting.in/Register.html"
    When I fill firstname as "Ahamed" and Lastname as "Sabid"
    Then I fill address as "ABC"
    And wait for 3 seconds
    And Close the browser

  @smoke
  Scenario: This is my second scenario for my BDD
    Given I have a url "https://demo.automationtesting.in/Register.html"
    When I fill firstname as "Arun" and Lastname as "Kumar"
    Then I fill address as "TVM"
    And wait for 3 seconds
    And Close the browser