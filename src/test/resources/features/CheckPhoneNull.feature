Feature: CheckPhoneNull

  Scenario Outline: CheckPhoneNull
    Given  go to register page "<url>"
    When User input User"<User>" Email "<Email>" Password"<Password>"  RePassword "<RePassword>" not input Phone "<Phone>"
    Then  form error appear
    Examples:
      | url                                            | User | Email           | Password | RePassword | Phone |
      | http://website-shop-demo.herokuapp.com/dang-ky | Khoa | abc@gmail.com | 12345678 | 12345678   |       |