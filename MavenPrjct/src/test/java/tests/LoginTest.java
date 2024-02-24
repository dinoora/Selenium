package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.AccountPage;
import pageObjects.LoginPage;
import pageObjects.StartingPage;
import resources.Base;

import java.io.IOException;

public class LoginTest extends Base {

    WebDriver driver;

    @Test(dataProvider = "LoginData")
    public void login(String email, String password, String expectedRslt) throws IOException, InterruptedException {
        StartingPage strPge = new StartingPage(driver);
        strPge.loginbtn().click();

        LoginPage lgnPage = new LoginPage(driver);
        lgnPage.email().sendKeys(email);
        lgnPage.password().sendKeys(password);
        lgnPage.signinBtn().click();

        AccountPage accPage = new AccountPage(driver);
        Thread.sleep(10000);
        //accPage.accLogo().click();

        String actRslt = null;

        try {
            if (accPage.accName().isDisplayed()) {
                Thread.sleep(5000);
                actRslt = "Successful";
            }

        } catch (Exception e) {
            actRslt = "failure";

        }
        Assert.assertEquals(actRslt, expectedRslt);
    }

    @AfterMethod
    public void closure() {
        driver.close();
    }

    @DataProvider
    public Object[][] LoginData() {
        Object[][] data = {{"sam.anderson@mailinator.com", "sam.anderson", "Successful"},{"sam@mailinator.com", "sam", "failure"}};
        return data;
    }

    @BeforeMethod
    public void LoadPage() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }
}
