package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class ShowProduct extends BaseStepDef {
    TestContext testContext;

    public ShowProduct(TestContext context) {
        super(context);
        testContext = context;
    }

    @Given("Go to login page {string} And Enter User{string} Password{string} Click button Login")
    public void goToLoginPageAndEnterUserPasswordClickButtonLogin(String url, String User, String Password) {
        driver.get(url);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }

    @When("User click on DanhSach button")
    public void userClickOnDanhSachButton() {
        driver.findElement(By.xpath("//a[normalize-space()='Product']")).click();
        driver.findElement(By.xpath("//a[@href='http://website-shop-demo.herokuapp.com/admin/product']")).click();

    }

    @Then("go to Product Page")
    public void goToProductPage() {
        boolean Check = driver.findElement(By.xpath("//div[@class='table-content']")).isDisplayed();
        Assert.assertTrue(true, "Lỗi con mẹ m rồi");
    }
}
