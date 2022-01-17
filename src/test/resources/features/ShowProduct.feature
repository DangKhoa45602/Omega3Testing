Feature: ShowProduct
  Scenario Outline: ShowProduct
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When User click on DanhSach button
    Then go to Product Page
    Examples:
      |url|User|Password|
      | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong |