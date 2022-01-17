Feature: CheckAccountEmail
  Scenario Outline: CheckAccountEmail
    Given  Go to register page "<url>"
    When  When  input User"<User>" and not input Email"<Email>" and input Password"<Password>"  ReEnterPassword"<ReEnterPassword>" Phone"<Phone>"
    And Click button Regiter
    Then Go to ErrorEmail
    Examples:
      |url | User | Email| Password| ReEnterPassword| Phone|
      |http://website-shop-demo.herokuapp.com/dang-ky| hoangluat| |12345678|12345678|0932684368|

