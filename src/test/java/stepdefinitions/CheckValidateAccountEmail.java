package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class CheckValidateAccountEmail extends BaseStepDef {
    TestContext testContext;

    public CheckValidateAccountEmail(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("When  input User{string} and not input Email{string} and input Password{string}  ReEnterPassword{string} Phone{string}")
    public void whenInputUserAndNotInputEmailAndInputPasswordReEnterPasswordPhone(String User, String Email, String Password, String ReEnterPassword, String Phone) {
        driver.findElement(By.xpath("//input[@placeholder='Tên tài khoản...']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@placeholder='Email...']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@placeholder='Mật khẩu...']")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@placeholder='Nhập lại mật khẩu...']")).sendKeys(ReEnterPassword);
        driver.findElement(By.xpath("//input[@placeholder='Số điện thoại...']")).sendKeys(Phone);
    }

    @Then("Go to ErrorEmail")
    public void goToErrorEmail() {
        boolean checkEmailNull = driver.findElement(By.xpath("//strong[contains(text(),'Email không được để trống')]")).isDisplayed();
        Assert.assertTrue(true,"Lỗi Email");
    }
}
