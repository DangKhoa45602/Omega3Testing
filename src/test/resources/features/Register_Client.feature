Feature: RegisterClient
    Scenario Outline: CheckRegister
      Given Go to register page "<url>"
      When Input User"<User>" and Email"<Email>"  Password"<Password>"  ReEnterPassword"<ReEnterPassword>" Phone"<Phone>"
      And Click button Regiter
      Then Go to dasshboard
      Examples:
      | url | User | Email| Password| ReEnterPassword| Phone|
      |http://website-shop-demo.herokuapp.com/dang-ky| hoangluat| hoangluat1211@gmail.com|123123|123123|0932684368|
