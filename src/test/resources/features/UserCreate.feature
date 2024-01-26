Feature: user transactions
  @GetUser
  Scenario: user successful query
    When the user sends a request to the endpoint
    Then user will be able to see status code 200