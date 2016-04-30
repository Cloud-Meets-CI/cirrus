Feature: cirrus

  A cloud innovation submission application

  Scenario: Create Album
    Given New Album "title" "artist" "releaseYear" "genre" "description"
    When Add Album
    Then Album added
