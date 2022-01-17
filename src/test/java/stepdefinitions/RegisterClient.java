package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class RegisterClient extends BaseStepDef {
    TestContext testContext;

    public RegisterClient(TestContext context) {
        super(context);
        testContext = context;
    }
    @Given("Go to register page {string}")
    public void goToRegisterPage(String url) {
        driver.get(url);
    }

    @When("Input User{string} and Email{string}  Password{string}  ReEnterPassword{string} Phone{string}")
    public void inputUserAndEmailPasswordReEnterPasswordPhone(String User, String Email, String Password, String ReEnterPassword, String Phone) {
        driver.findElement(By.xpath("//input[@placeholder='Tên tài khoản...']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@placeholder='Email...']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@placeholder='Mật khẩu...']")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@placeholder='Nhập lại mật khẩu...']")).sendKeys(ReEnterPassword);
        driver.findElement(By.xpath("//input[@placeholder='Số điện thoại...']")).sendKeys(Phone);

    }
    @And("Click button Regiter")
    public void clickButtonRegiter () {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("Go to dasshboard")
    public void goToDasshboard() {
        boolean checkRegister = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        Assert.assertTrue(true,"Loi roi");
    }
}
