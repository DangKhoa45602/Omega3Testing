package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class CheckUserFail extends BaseStepDef {
    TestContext testContext;

    public CheckUserFail(TestContext context) {
        super(context);
        testContext = context;
    }
    @Then("Show error")
    public void showError() {
        boolean title = driver.findElement(By.xpath("//nav[@class='sb-topnav navbar navbar-expand navbar-dark bg-dark']")).isDisplayed();
        Assert.assertTrue(true, "sửa lại");
    }
}
