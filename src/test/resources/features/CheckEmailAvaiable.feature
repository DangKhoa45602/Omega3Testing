Feature: CheckEmailAvaiable
  Scenario Outline: CheckEmailAvaiable
    Given Go to LoginAdmin Page "<url>"
    When  input User"<User>" and input Email already exist "<Email>"  Password"<Password>"  ReEnterPassword"<ReEnterPassword>" Phone"<Phone>"

    Then form show errorEmailExist
    Examples:
      | url | User | Email| Password| ReEnterPassword| Phone|
      |http://website-shop-demo.herokuapp.com/dang-ky| thanhhai| haicutene@gmail.com|anhpro123|anhpro123|0777465590|