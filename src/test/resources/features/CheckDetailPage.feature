Feature: CheckDetail

  Scenario Outline: CheckDetail
    Given go to dashboard"<url>"
    When User click Product Name
    Then go to DetailPage
    Examples:
      | url                                    |
      | http://website-shop-demo.herokuapp.com |
