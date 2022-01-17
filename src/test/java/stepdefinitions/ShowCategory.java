package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class ShowCategory extends BaseStepDef {
    TestContext testContext;

    public ShowCategory(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("User Click on Category button")
    public void userClickOnCategoryButton() {
        driver.findElement(By.xpath("//a[normalize-space()='Product']")).click();
        driver.findElement(By.xpath("//a[@href='http://website-shop-demo.herokuapp.com/admin/product_category']")).click();
    }

    @Then("Go to Category dashboard")
    public void goToCategoryDashboard() {
       String title = driver.findElement(By.xpath("//h1[@class='core-title']")).getText();
       Assert.assertEquals(title, "Product_Category", "Sai rồi");
    }
}
