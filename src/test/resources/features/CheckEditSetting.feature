Feature: EditSetting
  Scenario Outline: EditSetting
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When User edit a setting
    And Change the Name "<Name>"
    Then A new edited
    Examples:
      |url|User|Password|Name|
      | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong |Lại đổi|