Feature: EditCoupon
  Scenario Outline: EditCoupon
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When  User go to Coupon Page
    And Edit Name "<Name>" Coupon
    Then A coupon edited
    Examples:
      |url|User|Password|Name|
      | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong |Thay đổi|