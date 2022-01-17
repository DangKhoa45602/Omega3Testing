Feature: CheckValidatePassword

  Scenario Outline: Check
    Given go to register page "<url>"
    When User input User"<User>" Email "<Email>" Password"<Password>" Wrong RePassword "<RePassword>" Phone "<Phone>"
    Then show error
    Examples:
      | url                                            | User | Email           | Password | RePassword | Phone      |
      | http://website-shop-demo.herokuapp.com/dang-ky | Khoa | admin@gmail.com | 12345678 | 22222222   | 0965024403 |