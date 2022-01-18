package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class LoginValidateNoPassword extends BaseStepDef {
    TestContext testContext;

    public LoginValidateNoPassword(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("input Email{string} and not input Password{string}")
    public void inputEmailAndNotInputPassword(String Email, String Password) {

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
    }

    @Then("Go to errorNoPW")
    public void goToErrorNoPW() {
        String checkLoginPWNull = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        Assert.assertEquals(checkLoginPWNull,"Bắt buộc phải nhập mật khẩu", "lỗi rồi");
    }
}
