Feature: CheckAccountPassword
  Scenario Outline: CheckAccountPassword
    Given Go to register page "<url>"
    When input User"<User>"  Email"<Email>" and not input Password"<Password>" and input  ReEnterPassword"<ReEnterPassword>" Phone"<Phone>"
    And Click button Regiter
    Then Go to ErrorPassword
    Examples:
      | url | User | Email| Password| ReEnterPassword| Phone|
      |http://website-shop-demo.herokuapp.com/dang-ky| leninh | ninhle662k@gmail.com||12345678|0932684368|