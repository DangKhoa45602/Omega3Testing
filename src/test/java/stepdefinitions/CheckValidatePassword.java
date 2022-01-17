package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class CheckValidatePassword extends BaseStepDef {
    TestContext testContext;

    public CheckValidatePassword(TestContext context) {
        super(context);
        testContext = context;
    }
    @Given("go to register page {string}")
    public void goToRegisterPage(String url) {
        driver.get(url);
    }

    @When("User input User{string} Email {string} Password{string} Wrong RePassword {string} Phone {string}")
    public void userInputUserEmailPasswordWrongRePasswordPhone(String User, String Email, String Password, String RePassword, String Phone) {
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys(RePassword);
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Phone);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Then("show error")
    public void showError() {
        String Error = driver.findElement(By.xpath("//div[@role='alert']//ul//li//strong")).getText();
        Assert.assertEquals(Error,"Mật khẩu không khớp","sai rồi");
    }
}
