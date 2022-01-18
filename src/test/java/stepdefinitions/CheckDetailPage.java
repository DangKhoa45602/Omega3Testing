package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class CheckDetailPage extends BaseStepDef {
    TestContext testContext;

    public CheckDetailPage(TestContext context) {
        super(context);
        testContext = context;
    }

    @When("User click Product Name")
    public void userClickProductName() {
        driver.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
    }

    @Then("go to DetailPage")
    public void goToDetailPage() {
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "JBL Tune 220TWS", "Lỗi rồi");
    }
}
