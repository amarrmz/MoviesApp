@Filter
Feature: Filter

  @detailsScreen @Smoke
  Scenario: going from main movies list screen to the details screen of the app
    Given User at main movies screen
    When  User clicks on the details button
    Then  User should be redirected to details screen

  @FilterByYear
  Scenario: filtering movies based on year
    Given User at main movies screen
    When  User select filter movies by year
    Then  Movies list should be displayed based on year

  @FilterByPopularity
  Scenario: filtering movies based on popularity
    Given User at main movies screen
    When  User select filter movies by popularity
    Then  Movies list should be displayed based on popularity

 #Filtering movies based on year or popularity by passing parameter using data table.