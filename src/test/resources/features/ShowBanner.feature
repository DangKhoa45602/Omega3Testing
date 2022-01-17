Feature: ShowBanner
  Scenario Outline: ShowBanner
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When User click on Widget button
    And click Banners button
    Then go to Banners Page
    Examples:
      |url|User|Password|
      | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong |