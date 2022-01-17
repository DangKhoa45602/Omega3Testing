Feature: DeleteProduct
  Scenario Outline: Delete Product
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When  User click on DanhSach button
    And Click button Delete
    And Click button Yes
    Then Show the Notification
    And go to Product Page
    Examples:
      |url|User|Password|
      | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong |
