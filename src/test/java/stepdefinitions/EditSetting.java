package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class EditSetting extends BaseStepDef {
    TestContext testContext;

    public EditSetting(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("User edit a setting")
    public void userEditASetting() {
        driver.findElement(By.xpath("//body/div[@id='layoutSidenav']/div[@id='layoutSidenav_nav']/nav[@id='sidenavAccordion']/div[@class='sb-sidenav-menu']/div[@class='nav']/a[3]")).click();
        driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/a[1]")).click();
    }

    @And("Change the Name {string}")
    public void changeTheName(String Name) {
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(Name);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("A new edited")
    public void aNewEdited() {
        String CheckEdit = driver.findElement(By.xpath("//div[@role='alert']//strong")).getText();
        Assert.assertEquals(CheckEdit, "Sửa mới thành công", "Lỗi rồi");
    }
}
