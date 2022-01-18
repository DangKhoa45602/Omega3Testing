package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class CreateNewSetting extends BaseStepDef {
    TestContext testContext;

    public CreateNewSetting(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("User create a new setting")
    public void userCreateANewSetting() {
        driver.findElement(By.xpath("//body/div[@id='layoutSidenav']/div[@id='layoutSidenav_nav']/nav[@id='sidenavAccordion']/div[@class='sb-sidenav-menu']/div[@class='nav']/a[3]")).click();
        driver.findElement(By.xpath("//a[@href='http://website-shop-demo.herokuapp.com/admin/setting/create']//button[@type='button']")).click();

    }
    @And("Input Name{string} Link {string} Icon {string} Click status button click button Save")
    public void inputNameLinkIconClickStatusButtonClickButtonSave(String Name, String Link, String Icon) {
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(Name);
        driver.findElement(By.xpath("//input[@name='link']")).sendKeys(Link);
        driver.findElement(By.xpath("//input[@name='icon']")).sendKeys(Icon);
        driver.findElement(By.xpath("//label[@for='status']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("A new setting created")
    public void aNewSettingCreated() throws InterruptedException {
        Thread.sleep(3000);
        String CheckCreated = driver.findElement(By.xpath("//div[@role='alert']//strong")).getText();
        Assert.assertEquals(CheckCreated,"Thêm mới thành công", "lỗi rồi");
    }


}
