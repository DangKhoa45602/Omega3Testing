package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class CheckPhoneNull extends BaseStepDef {
    TestContext testContext;

    public CheckPhoneNull(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("User input User{string} Email {string} Password{string}  RePassword {string} not input Phone {string}")
    public void userInputUserEmailPasswordRePasswordNotInputPhone(String User, String Email, String Password, String RePassword, String Phone) {
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys(RePassword);
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Phone);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Then("form error appear")
    public void formErrorAppear() {
        String Erorr = driver.findElement(By.xpath("//div[@role='alert']//ul//li//strong")).getText();
        Assert.assertEquals(Erorr, "Số điện thoại không được để trống","lỗi rồi");
    }
}
