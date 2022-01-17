Feature: LoginClient
  Scenario Outline:  CheckLoginClient
    Given  Go to login page "<url>"
    When  Input Email"<Email>" and Password"<Password>"
    And Click button LoginClient
    Then Go to dashboard
    Examples:
      |url|Email|Password|
      |http://website-shop-demo.herokuapp.com/dang-nhap|hoangluat1211@gmail.com|12345678|