Feature: LoginAccountNOTEmail
  Scenario Outline: CheckLoginNotEmail
    Given GO to login page "<url>"
    When Not input Email"<Email>" and input Password"<Password>"
    And Click button Login
    Then Go to errorNoEmail
    Examples:
      |url|Email|Password|
      |http://website-shop-demo.herokuapp.com/dang-nhap||12345678|