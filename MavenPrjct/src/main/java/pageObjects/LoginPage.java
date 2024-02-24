package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"web-ui1\"]")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"web-ui2\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"overlays\"]/div[3]/div/div/form/div[1]/button")
    WebElement signinBtn;

    public WebElement email() {
        return email;
    }
    public WebElement password(){
        return password;
    }
    public WebElement signinBtn(){
        return signinBtn;
    }
}
