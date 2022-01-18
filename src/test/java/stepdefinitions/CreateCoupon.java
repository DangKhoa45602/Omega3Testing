package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class CreateCoupon extends BaseStepDef {
    TestContext testContext;

    public CreateCoupon(TestContext context) {
        super(context);
        testContext = context;
    }
    @And("Create Name {string} Percentage {string} Click Status Coupon Click Save")
    public void createNamePercentageClickStatusCouponClickSave(String Name, String Percentage)
    {
        driver.findElement(By.xpath("//a[@href='http://website-shop-demo.herokuapp.com/admin/coupon/create']//button[@type='button']")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(Name);
        driver.findElement(By.xpath("//input[@name='percentage']")).sendKeys(Percentage);
        driver.findElement(By.xpath("//label[normalize-space()='Status']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    }

    @Then("A coupon created")
    public void aCouponCreated() {
        String title = driver.findElement(By.xpath("//strong[contains(text(),'Thêm mới thành công')]")).getText();
        Assert.assertEquals(title ,"Thêm mới thành công","Error ... ");
    }
}
