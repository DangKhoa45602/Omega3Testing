package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.TestContext;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ShowListUser extends BaseStepDef {
    TestContext testContext;

    public ShowListUser(TestContext context) {
        super(context);
        testContext = context;
    }

    @When("User click on Users button")
    public void userClickOnUsersButton() {
        driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Danh sách User']")).click();
    }

    @Then("go to User Page")
    public void goToUserPage() {
       String title = driver.findElement(By.xpath("//h1[normalize-space()='user']")).getText();
        Assert.assertEquals(title, "User", "Sai rồi");
    }
}
