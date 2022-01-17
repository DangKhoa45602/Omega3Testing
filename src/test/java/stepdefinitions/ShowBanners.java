package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class ShowBanners extends BaseStepDef {
    TestContext testContext;

    public ShowBanners (TestContext context) {
        super(context);
        testContext = context;
    }
    @When("User click on Widget button")
    public void userClickOnWidgetButton() {
        driver.findElement(By.xpath("//a[@data-target='#widget']")).click();

    }

    @And("click Banners button")
    public void clickBannersButton() {
        driver.findElement(By.xpath("//a[normalize-space()='Banners']")).click();
    }

    @Then("go to Banners Page")
    public void goToBannersPage() {
        String title = driver.findElement(By.xpath("//h1[normalize-space()='banner']")).getText();
        Assert.assertEquals(title, "Banner", "Sai rồi");
    }
}
