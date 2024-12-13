Feature: eBay Advanced Search

  Scenario: Search items with advanced options
    Given I am on the eBay Advanced Search page
    When I enter search keyword "laptop"
    And I set price range between "500" and "1000"
    And I select "Buy It Now" option
    And I click the "Search" button
    Then I should see results matching "laptop" in the price range
