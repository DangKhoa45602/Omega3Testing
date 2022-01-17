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
    public void userDeleteANewSetting() {
        driver.findElement(By.xpath("//body/div[@id='layoutSidenav']/div[@id='layoutSidenav_nav']/nav[@id='sidenavAccordion']/div[@class='sb-sidenav-menu']/div[@class='nav']/a[3]")).click();
        driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/a[2]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']")).click();

    }

    @And("Setting deleted")
    public void settingDeleted() {
        String checkdeleted = driver.findElement(By.xpath("//tbody/tr[1]/th[1]")).getText();
        Assert.assertEquals(checkdeleted, "4","False");
    }
}
