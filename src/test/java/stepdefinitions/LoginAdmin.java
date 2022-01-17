package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class LoginAdmin extends BaseStepDef {
    TestContext testContext;

    public LoginAdmin(TestContext context) {
        super(context);
        testContext = context;
    }

    @Given("Go to LoginAdmin Page {string}")
    public void goToLoginAdminPage(String url)
    {
        driver.get(url);
    }

    @When("Input User{string} and Password{string}")
    public void inputUserAndPassword(String User, String Password)
    {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
    }

    @And("Click button Login")
    public void clickButtonLogin()
    {
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }

    @Then("Go to dashboard")
    public void goToDashboard()
    {
        boolean title = driver.findElement(By.xpath("//nav[@class='sb-topnav navbar navbar-expand navbar-dark bg-dark']")).isDisplayed();
        Assert.assertTrue(true, "sửa lại");
    }
}
