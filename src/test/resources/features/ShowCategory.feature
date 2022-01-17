Feature: ShowCategory
  Scenario Outline: ShowCategory
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When  User Click on Category button
    Then Go to Category dashboard
    Examples:
      |url|User|Password|
      | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong |