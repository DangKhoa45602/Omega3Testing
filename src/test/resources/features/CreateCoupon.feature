Feature: EditCoupon
    
    Scenario Outline: CreateCoupon
        Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
        When  User go to Coupon Page
        And Create Name "<Name>" Percentage "<Percentage>" Click Status Coupon Click Save
        Then A coupon created
        Examples:
            | url                                               | User                | Password  | Name  | Percentage |
            | http://website-shop-demo.herokuapp.com/auth/login | daop37566@gmail.com | duyphuong | 001TD | 10         |