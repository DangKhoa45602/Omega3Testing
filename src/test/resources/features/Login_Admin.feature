Feature: LoginAdmin

  Scenario Outline: LoginAdmin
    Given Go to LoginAdmin Page "<url>"
    When  Input User"<User>" and Password"<Password>"
    And Click button Login
    Then Go to dashboard
    Examples:
      | url                                               | User                | Password  |
      | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong |