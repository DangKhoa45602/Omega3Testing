package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class CheckEmailAvaiable extends BaseStepDef {
    TestContext testContext;

    public CheckEmailAvaiable(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("input User{string} and input Email already exist {string}  Password{string}  ReEnterPassword{string} Phone{string}")
    public void inputUserAndInputEmailAlreadyExistPasswordReEnterPasswordPhone(String User, String Email, String Password, String RePassword, String Phone) {
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys(RePassword);
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Phone);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Then("form show errorEmailExist")
    public void formShowErrorEmailExist() {
        String Erorr = driver.findElement(By.xpath("//button[@type='submit']")).getText();
        Assert.assertEquals(Erorr, "Email đã tồn tại","lỗi rồi");
    }
}
