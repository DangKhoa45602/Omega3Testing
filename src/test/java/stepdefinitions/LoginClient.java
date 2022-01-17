package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class LoginClient extends BaseStepDef {
    TestContext testContext;

    public LoginClient(TestContext context) {
        super(context);
        testContext = context;
    }
    @Given("Go to login page {string}")
    public void goToLoginPage(String url) {
        driver.get(url);
    }

    @When("Input Email{string} and Password{string}")
    public void inputEmailAndPassword(String Email, String Password) {

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
    }

    @And("Click button LoginClient")
    public void clickButtonLoginClient() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
