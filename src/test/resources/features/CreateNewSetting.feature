Feature: CreateSetting
  Scenario Outline: CreateSetting
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When User create a new setting
    And Input Name"<Name>" Link "<Link>" Icon "<Icon>" Click status button click button Save
    Then A new setting created
    Examples:
      |url|User|Password|Name|Link|Icon|
      | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong |Thay đổi|https://meet.google.com/oby-eyqt-bzj|Haha|