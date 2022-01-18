package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class EditCoupon extends BaseStepDef {
    TestContext testContext;

    public EditCoupon(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("User go to Coupon Page")
    public void userGoToCouponPage() {
        driver.findElement(By.xpath("//a[normalize-space()='Coupon']")).click();

    }

    @And("Edit Name {string} Coupon")
    public void editNameCoupon(String Name) {
        driver.findElement(By.xpath("//a[@class='el-button el-button--default el-button--mini']")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(Name);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Then("A coupon edited")
    public void aCouponEdited() {
        String CheckEdit = driver.findElement(By.xpath("//div[@role='alert']//strong")).getText();
        Assert.assertEquals(CheckEdit,"Sửa mới thành công", "lỗi rồi");
    }


}
