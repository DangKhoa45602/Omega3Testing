package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class Liked extends BaseStepDef {
    TestContext testContext;

    public Liked(TestContext context) {
        super(context);
        testContext = context;
    }
    @Given("go to dashboard{string}")
    public void goToDashboard(String url) {
        driver.get(url);
    }

    @When("user click like")
    public void userClickLike() {
        driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//button[2]")).click();
        driver.findElement(By.xpath("//i[@class='icon-heart']")).click();
    }

    @Then("the product go to the liked table")
    public void theProductGoToTheLikedTable() {
        String CheckLiked = driver.findElement(By.xpath("//div[@class='main-content-wrap section-ptb']//div[@class='row']")).getText();
        Assert.assertEquals(CheckLiked, "%Asus ROG Phone 5%","false");
    }
}
