Feature: LoginAccountNOTPassword
  Scenario Outline: CheckLoginNotPassword
    Given GO to login page "<url>"
    When input Email"<Email>" and not input Password"<Password>"
    And Click button Login
    Then Go to errorNoPW
    Examples:
      |url|Email|Password|
      |http://website-shop-demo.herokuapp.com/dang-nhap|hoangluat1211@gmail.com||
