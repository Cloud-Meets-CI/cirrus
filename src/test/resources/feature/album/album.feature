Feature: cirrus

  A cloud innovation submission application

  Scenario: Create Album
    Given New Album "title" "artist" "releaseYear" "genre"
    When Add Album
    Then Album added
