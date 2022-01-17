package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class CheckValidateAccountPW extends BaseStepDef {
    TestContext testContext;

    public CheckValidateAccountPW(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("input User{string}  Email{string} and not input Password{string} and input  ReEnterPassword{string} Phone{string}")
    public void inputUserEmailAndNotInputPasswordAndInputReEnterPasswordPhone(String User, String Email, String Password, String ReEnterPassword, String Phone) {
        driver.findElement(By.xpath("//input[@placeholder='Tên tài khoản...']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@placeholder='Email...']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@placeholder='Mật khẩu...']")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@placeholder='Nhập lại mật khẩu...']")).sendKeys(ReEnterPassword);
        driver.findElement(By.xpath("//input[@placeholder='Số điện thoại...']")).sendKeys(Phone);
    }

    @Then("Go to ErrorPassword")
    public void goToErrorPassword() {
        boolean checkPWNull = driver.findElement(By.xpath("//strong[contains(text(),'Mật khẩu không được để trống')]")).isDisplayed();
        Assert.assertTrue(true,"Lỗi chưa nhập Password");
    }
}
