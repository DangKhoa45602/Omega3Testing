Feature: LoginClientNoInput
  Scenario Outline:  LoginClientNoInput
    Given  Go to login page "<url>"
    When Not input Email"<Email>" and Not input Password"<Password>"
    And Click button LoginClient
    Then Go to errorLoginNotInput
    Examples:
      |url|Email|Password|
      |http://website-shop-demo.herokuapp.com/dang-nhap|||