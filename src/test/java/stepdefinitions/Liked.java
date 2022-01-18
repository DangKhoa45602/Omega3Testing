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
    public void userClickLike() throws InterruptedException {

        Actions action = new Actions(driver);

        Thread.sleep(1000);
        //Move xuống sản phẩm
        action.moveToElement(driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//button[2]//i[1]"))).perform();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//button[2]//i[1]")).click();
        Thread.sleep(1000);
        action.sendKeys(Keys.HOME).perform(); //Move lên đầu trang
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[@class='icon-heart']")).click(); //Dòng này ở đâu dị
    }

    @Then("the product go to the liked table")
    public void theProductGoToTheLikedTable() throws InterruptedException {

        Thread.sleep(3000);
        String productName = "Asus ROG Phone 5";
        String CheckLiked1 = driver.findElement(By.xpath("//tbody//td//a[contains(.,'" + productName + "')]")).getText();
        Assert.assertEquals(CheckLiked1, "Asus ROG Phone 5", "Không đúng tên sản phẩm");

//        String CheckLiked2 = driver.findElement(By.xpath("//div[@class='main-content-wrap section-ptb']//div[@class='row']")).getText();
//        Assert.assertEquals(CheckLiked2, "%Asus ROG Phone 5%", "false");
    }
}
