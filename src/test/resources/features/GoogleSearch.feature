Feature: feature to test google search functionality
@google
  Scenario: Validate google search in working
    Given user is on google search page
    When user enters a text in search box
    Then user is navigated to search results