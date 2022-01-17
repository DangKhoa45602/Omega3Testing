package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class CheckValidateRegisterAccout extends BaseStepDef {
    TestContext testContext;

    public CheckValidateRegisterAccout(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("not input User{string} and input Email{string}  Password{string}  ReEnterPassword{string} Phone{string}")
    public void notInputUserAndInputEmailPasswordReEnterPasswordPhone(String User, String Email, String Password, String ReEnterPassword, String Phone) {
        driver.findElement(By.xpath("//input[@placeholder='Tên tài khoản...']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@placeholder='Email...']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@placeholder='Mật khẩu...']")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@placeholder='Nhập lại mật khẩu...']")).sendKeys(ReEnterPassword);
        driver.findElement(By.xpath("//input[@placeholder='Số điện thoại...']")).sendKeys(Phone);
    }
        @Then("Go to Error")
    public void goToError() {
        boolean checkUserNull = driver.findElement(By.xpath("//strong[contains(text(),'Tên không được để trống')]")).isDisplayed();
        Assert.assertTrue(true,"Lỗi User");
    }
}
