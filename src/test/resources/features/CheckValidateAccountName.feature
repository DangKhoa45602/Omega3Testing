Feature: CheckAccountName
  Scenario Outline: CheckAccountName
    Given Go to register page "<url>"
    When not input User"<User>" and input Email"<Email>"  Password"<Password>"  ReEnterPassword"<ReEnterPassword>" Phone"<Phone>"
    And Click button Regiter
    Then Go to Error
    Examples:
      | url | User | Email| Password| ReEnterPassword| Phone|
      |http://website-shop-demo.herokuapp.com/dang-ky| | hoangluat1211@gmail.com|12345678|12345678|0932684368|
