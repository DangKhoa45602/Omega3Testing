package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class LoginValidateNoEmail extends BaseStepDef {
    TestContext testContext;

    public LoginValidateNoEmail(TestContext context) {
        super(context);
        testContext = context;
    }
    @Given("GO to login page {string}")
    public void goToLoginPage(String url) {
        driver.get(url);
    }

    @When("Not input Email{string} and input Password{string}")
    public void notInputEmailAndInputPassword(String Email, String Password) {

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
    }


    @Then("Go to errorNoEmail")
    public void goToErrorNoEmail() {
        String checkLoginEmailNull = driver.findElement(By.xpath("//div[@class='alert alert-danger'] ")).getText();
        Assert.assertEquals(checkLoginEmailNull,"Email người dùng không được để trống", "lỗi rồi");
    }
}
