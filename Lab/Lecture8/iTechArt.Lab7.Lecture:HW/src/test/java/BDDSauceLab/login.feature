Feature: feature to test login functionality

  Scenario Outline: Check login page
    Given user is on main page
    When user enters <username> and <password>
    And clicks on the login button
    Then user is navigated to home page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

    Scenario:Add to cart
      When I click on button Add to card
      Then box has itemOne
      And I click on box
      Then cart page is opened
