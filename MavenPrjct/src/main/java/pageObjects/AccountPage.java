package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='_3ir_3 _3WFsS']")
    WebElement accName;

    @FindBy(xpath = "//img[@class='_2Wzh_']")
    WebElement accLogo;

    public WebElement accName() {
        return accName;
    }

    public WebElement accLogo() {
        return accLogo;
    }
}
