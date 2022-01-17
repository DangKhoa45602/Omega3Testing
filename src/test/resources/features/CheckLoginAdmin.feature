Feature: CheckLoginAdmin

  Scenario Outline: CheckLoginAdmin
    Given Go to LoginAdmin Page "<url>"
    When  Input User"<User>" and Password"<Password>"
    And Click button Login
    Then Show error
    Examples:
      | url                                               | User | Password  |
      | http://website-shop-demo.herokuapp.com/auth/login | abc  | duyphuong |