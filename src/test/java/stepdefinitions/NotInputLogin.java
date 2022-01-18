package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class NotInputLogin extends BaseStepDef {
    TestContext testContext;

    public NotInputLogin(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("Not input Email{string} and Not input Password{string}")
    public void notInputEmailAndNotInputPassword(String Email, String Password) {

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
    }
    @Then("Go to errorLoginNotInput")
    public void goToErrorLoginNotInput() {
        String checkEmailInputNull = driver.findElement(By.xpath("//div[contains(text(),'Email người dùng không được để trống')]")).getText();
        Assert.assertEquals(checkEmailInputNull,"Email người dùng không được để trống", "lỗi rồi");
        String checkPasswordInputNull = driver.findElement(By.xpath("//div[contains(text(),'Bắt buộc phải nhập mật khẩu')]")).getText();
        Assert.assertEquals(checkPasswordInputNull,"Bắt buộc phải nhập mật khẩu", "lỗi rồi");
    }
}
