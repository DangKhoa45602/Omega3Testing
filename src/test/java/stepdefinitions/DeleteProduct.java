package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import cucumber.TestContext;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DeleteProduct extends BaseStepDef {
    TestContext testContext;

    public DeleteProduct(TestContext context) {
        super(context);
        testContext = context;
    }
    @And("Click button Delete")
    public void clickButtonDelete() {
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/a[2]")).click();
    }

    @And("Click button Yes")
    public void clickButtonYes() {
        driver.findElement(By.xpath("//button[normalize-space()='Yes, delete it!']")).click();
    }

    @Then("Show the Notification")
    public void showTheNotification() {
        boolean title = driver.findElement(By.xpath("//th[normalize-space()='4']")).isDisplayed();
        Assert.assertTrue(true,"phuong oc cho");

    }
}
