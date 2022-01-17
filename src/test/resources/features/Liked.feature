Feature: Liked

  Scenario Outline: Liked
    Given go to dashboard"<url>"
    When user click like
    Then the product go to the liked table
    Examples:
      | url                                    |
      | http://website-shop-demo.herokuapp.com |