Feature: cirrus

  A cloud innovation submission application

  Scenario: Create Innovation Item
    Given Create Innovation "Cloud Application" "Nehal Gandhi" "04/30/2016" "Cloud Ready" "Cloud Integration"
    When Create Innovation Item
    Then Innovation Item Created

  Scenario: Delete Innovation Item
    Given Delete Innovation "Cloud Application"
    When Delete Innovation Item
    Then Innovation Item Deleted
    
  Scenario: Search Innovation Item
    Given Search Innovation "Cloud Application"
    When Search Innovation Item
    Then Innovation Item Found
        

    