Feature: ShowListUser
  Scenario Outline: Show List User
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When User click on Users button
    Then go to User Page
    Examples:
      |url|User|Password|
      | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong |