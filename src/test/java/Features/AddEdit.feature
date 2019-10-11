Feature: Add and edit entries in the budgeting app

  Scenario: Add a new entry
    Given I navigate to the budgeting website, budget tab
    And I add a new entry with the category Income
    And Description Paycheck
    And Value 30000
    When I click the add button
    Then the entry is successfully added

  Scenario: Edit a new entry, cancel action
    Given I navigate to the budgeting website, budget tab
    And I select an existing entry
    When I click the cancel button
    Then the entry is unchanged

  Scenario: Edit a new entry, update action
    Given I navigate to the budgeting website, budget tab
    And I select an existing entry
    When I edit the value and click the update button
    Then the entry is successfully changed
