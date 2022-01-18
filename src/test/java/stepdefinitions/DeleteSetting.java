package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class DeleteSetting extends BaseStepDef {
    TestContext testContext;

    public DeleteSetting(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("User delete a new setting")
    public void userDeleteANewSetting() throws InterruptedException {
        driver.findElement(By.xpath("//body/div[@id='layoutSidenav']/div[@id='layoutSidenav_nav']/nav[@id='sidenavAccordion']/div[@class='sb-sidenav-menu']/div[@class='nav']/a[3]")).click();
        driver.findElement(By.xpath("//tbody/tr[2]/td[6]/div[1]/a[2]")).click();
        Thread.sleep(2000);


    }

    @And("Setting deleted")
    public void settingDeleted() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']")).click();
        Thread.sleep(2000);


    }

    @Then("can't found the name of deleted product")
    public void canTFoundTheNameOfDeletedProduct() throws InterruptedException {
        String CheckDeleted = driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
        Assert.assertEquals(CheckDeleted, "Your file has been deleted.");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();

    }
}
