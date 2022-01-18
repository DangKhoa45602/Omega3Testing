Feature: DeleteSetting
  Scenario Outline: DeleteSetting
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When User delete a new setting
    And Setting deleted
    Then can't found the name of deleted product
    Examples:
      |url|User|Password|
      | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong |